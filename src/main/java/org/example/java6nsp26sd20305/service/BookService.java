package org.example.java6nsp26sd20305.service;

import org.example.java6nsp26sd20305.dto.BookRequest;
import org.example.java6nsp26sd20305.dto.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> findAll();

    BookResponse findById(long id);

    BookResponse add(BookRequest bookRequest);

    BookResponse update(BookRequest bookRequest, long id);

    void delete(long id);
}
