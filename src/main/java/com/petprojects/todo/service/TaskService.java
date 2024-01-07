package com.petprojects.todo.service;

import com.petprojects.todo.model.Task;
import com.petprojects.todo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public void save(Task task) {
        taskRepository.save(task);
    }

    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> getAll() {
        return (List<Task>) taskRepository.findAll();
    }

    public void delete(Task task) {
        taskRepository.delete(task);
    }


}
