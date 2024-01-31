package com.petprojects.todo.service;

import com.petprojects.todo.model.SystemModel;
import com.petprojects.todo.repository.GenericRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Service
public abstract class SystemService<S extends SystemModel> extends GenericService<S> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    protected SystemService(GenericRepository<S> repository) {
        super(repository);
    }

    public void markAsDeleted(SystemModel model) {
        model.setDeleted(true);
        model.setDeletedAt(LocalDateTime.now());
        model.setDeletedBy(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    public void unmarkAsDeleted (SystemModel model) {
        model.setDeleted(false);
        model.setDeletedAt(null);
        model.setDeletedBy(null);
    }

    public void deleteSoft(final Long id) {
        S object = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Object wasn't found."));
        markAsDeleted(object);
        repository.save(object);
    }

    public void restore(final Long id) {
        S object = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Object wasn't found."));
        unmarkAsDeleted(object);
        repository.save(object);
    }
}
