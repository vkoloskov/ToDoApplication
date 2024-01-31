package com.petprojects.todo.service;

import com.petprojects.todo.model.GenericModel;
import com.petprojects.todo.repository.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public abstract class GenericService<E extends GenericModel> {

    protected final GenericRepository<E> repository;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    protected GenericService(GenericRepository<E> repository) {
        this.repository = repository;
    }

    public List<E> listAll() {
        return repository.findAll();
    }

    public E getOne(final Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Object wasn't found."));
    }

    public E create(E newObject) {
        return repository.save(newObject);
    }

    public E update(E updatedObject) {
        return repository.save(updatedObject);
    }

    public void delete(final Long id) {
        repository.deleteById(id);
    }
}
