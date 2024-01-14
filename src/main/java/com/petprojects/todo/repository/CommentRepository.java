package com.petprojects.todo.repository;

import com.petprojects.todo.model.Comment;

public interface CommentRepository extends GenericRepository<Comment> {
    Comment findByTask_Id(int id);
}
