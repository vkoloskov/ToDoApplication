package com.petprojects.todo.repository;

import com.petprojects.todo.model.TaskStatus;
public interface TaskStatusRepository extends GenericRepository<TaskStatus> {
    TaskStatus findByName(String name);
}
