package org.example.java6nsp26sd20305.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookRequest {

    private String title;
    private String author;
    private double price;
}
