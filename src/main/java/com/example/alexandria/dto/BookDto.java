package com.example.alexandria.dto;

import com.example.alexandria.models.entities.Book;

public record BookDto(Long id, String title, String genre) {
  public Book toBook() {
    return new Book(id, title, genre);
  }
}
