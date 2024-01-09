package com.petprojects.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.IdGeneratorType;

import java.util.List;

@Entity
@Table(name = "user_app")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends GenericModel{
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<String> authorities;
    @OneToMany(mappedBy="assignTo")
    private List<Task> tasks;

}
