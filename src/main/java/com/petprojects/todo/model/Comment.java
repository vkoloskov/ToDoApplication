package com.petprojects.todo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends GenericModel {
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name="task_id")
    private Task task;
}
