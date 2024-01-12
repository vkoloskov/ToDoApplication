package com.petprojects.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task_statuses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskStatus extends GenericModel{
    @Column(name = "status_name")
    private String name;

}