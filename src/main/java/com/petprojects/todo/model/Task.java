package com.petprojects.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task extends GenericModel{
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private TaskStatus status;
    @Column(name = "completed_at")
    private LocalDateTime completedAt;
    @ManyToOne
    @JoinColumn(name="assign_user_id")
    private User assignTo;
    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;
    @OneToMany
    @JoinColumn(name = "follower_id")
    private List<User> followers;
}
