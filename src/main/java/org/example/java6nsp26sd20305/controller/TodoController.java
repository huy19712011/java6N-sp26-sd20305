package org.example.java6nsp26sd20305.controller;

import lombok.RequiredArgsConstructor;
import org.example.java6nsp26sd20305.entity.Todo;
import org.example.java6nsp26sd20305.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/todos")
public class TodoController {

    private final TodoService todoService;

    // api/todos
    @GetMapping
    public List<Todo> getAllTodos() {

        return todoService.findAll();
    }

    // api/todos/id
    @GetMapping("{id}")
    public Todo getTodo(@PathVariable long id) {

        return todoService.findById(id);
    }

    // POST api/todos
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {

        return todoService.add(todo);
    }

    // PUT api/todos/{id}
    @PutMapping("{id}")
    public Todo updateTodo(@RequestBody Todo todo, @PathVariable long id) {

        return todoService.update(todo, id);
    }

    // DELETE api/todos/{id}
    @DeleteMapping("{id}")
    public Todo deleteTodo(@PathVariable long id) {

        return todoService.delete(id);
    }


}
