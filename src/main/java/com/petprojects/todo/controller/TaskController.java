package com.petprojects.todo.controller;

import com.petprojects.todo.config.TaskStatus;
import com.petprojects.todo.model.Task;
import com.petprojects.todo.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("")
    ResponseEntity getAllTasks() {
        return ResponseEntity.ok(taskService.getAll());
    }
    @PostMapping ("/add")
    public ResponseEntity addTask(@RequestBody @Valid Task task) {
        task.setStatus(TaskStatus.NEW);
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(task.getCreatedAt());
        taskService.save(task);
        return ResponseEntity.ok(task);
    }

}
