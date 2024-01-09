package com.petprojects.todo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task extends GenericModel{
    @NotNull
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @ManyToOne()
    @JoinColumn(name = "status_id")
    private TaskStatus status;
    @Column(name = "completed_at")
    private LocalDateTime completedAt;
    @ManyToOne()
    @JoinColumn(name="assign_user_id")
    private User assignTo;
}
