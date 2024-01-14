package com.petprojects.todo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment extends GenericModel {
    @Column(name = "content", nullable = false)
    private String content;
    @ManyToOne
    @JoinColumn(name="task_id", nullable = false)
    private Task task;
}
