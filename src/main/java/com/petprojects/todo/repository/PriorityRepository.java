package com.petprojects.todo.repository;

import com.petprojects.todo.model.Priority;

public interface PriorityRepository extends GenericRepository<Priority> {
    Priority findByName(String name);
    Priority findByLevel(int level);
}
