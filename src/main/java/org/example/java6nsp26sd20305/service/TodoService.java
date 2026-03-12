package org.example.java6nsp26sd20305.service;

import org.example.java6nsp26sd20305.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    Todo findById(long id);

    Todo add(Todo todo);

    Todo update(Todo todo, long id);

    Todo delete(long id);

}
