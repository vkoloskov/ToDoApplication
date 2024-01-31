package com.petprojects.todo.service;

import com.petprojects.todo.model.Task;
import com.petprojects.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class TaskService extends GenericService<Task> {

    protected TaskService(TaskRepository taskRepository) {
        super(taskRepository);
    }
}
