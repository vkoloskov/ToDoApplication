package com.petprojects.todo.repository;

import com.petprojects.todo.model.Role;

public interface RoleRepository extends GenericRepository<Role>{

    Role findByName(String name);
}
