package com.petprojects.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "priorities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Priority extends GenericModel{
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private Integer level;
}
