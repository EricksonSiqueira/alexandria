package com.example.alexandria.dto;

import com.example.alexandria.models.entities.Author;

public record AuthorDTO (Long id, String name, String nationality){

  public Author toAuthor() {
    return new Author(id, name, nationality);
  }
}
