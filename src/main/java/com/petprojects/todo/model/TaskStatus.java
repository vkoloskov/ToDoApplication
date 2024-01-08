package com.petprojects.todo.model;

public enum TaskStatus {
    NEW("New"),
    IN_PROGRESS("In progress"),
    COMPLETED("Completed");

    private String name;

    TaskStatus(String name) {
        this.name = name;
    }
}
