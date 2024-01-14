package com.petprojects.todo.repository;


import com.petprojects.todo.model.User;

public interface UserRepository extends GenericRepository<User>{
    User findUserByLogin(String login);
    User findUserByEmail(String email);
}
