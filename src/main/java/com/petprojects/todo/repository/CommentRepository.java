package com.petprojects.todo.repository;

import com.petprojects.todo.model.Comment;

import java.util.List;

public interface CommentRepository extends GenericRepository<Comment> {
    List<Comment> findByTask_Id(int id);
}
