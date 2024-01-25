package com.petprojects.todo.controller;

import com.petprojects.todo.model.TaskStatus;
import com.petprojects.todo.model.Task;
import com.petprojects.todo.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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
        return ResponseEntity.ok(taskService.listAll());
    }
    @PostMapping ("/add")
    public ResponseEntity addTask(@RequestBody @Valid Task task) {
        task.setStatus(new TaskStatus("New"));
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(task.getCreatedAt());
        taskService.update(task);
        return ResponseEntity.ok(task);
    }

}
