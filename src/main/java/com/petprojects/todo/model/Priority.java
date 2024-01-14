package com.petprojects.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "priorities")
public class Priority extends GenericModel{
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "level", nullable = false)
    private Integer level;
}
