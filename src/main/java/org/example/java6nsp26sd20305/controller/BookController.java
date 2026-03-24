package org.example.java6nsp26sd20305.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.java6nsp26sd20305.dto.BookRequest;
import org.example.java6nsp26sd20305.dto.BookResponse;
import org.example.java6nsp26sd20305.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {

        return ResponseEntity.status(HttpStatus.OK).body(bookService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<BookResponse> getBookById(@PathVariable long id) {

        return ResponseEntity.status(HttpStatus.OK).body(bookService.findById(id));
    }

    @PostMapping
    public ResponseEntity<BookResponse> add(@Valid @RequestBody BookRequest bookRequest) {

        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.add(bookRequest));
    }

    @PutMapping("{id}")
    public ResponseEntity<BookResponse> update(@Valid @RequestBody BookRequest bookRequest, @PathVariable long id) {

        return ResponseEntity.status(HttpStatus.OK).body(bookService.update(bookRequest, id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {

        bookService.delete(id);

        return ResponseEntity.noContent().build(); // 204
    }
}
