package com.petprojects.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "app_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends GenericModel{
    @Column(name = "email")
    private String email;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "password")
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<String> authorities;
    @OneToMany(mappedBy="assignTo")
    private List<Task> tasks;
    @OneToMany
    @JoinColumn(name = "role_id")
    private List<Role> roles;
}
