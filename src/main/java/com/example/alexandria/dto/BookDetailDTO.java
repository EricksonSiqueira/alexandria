package com.example.alexandria.dto;

import com.example.alexandria.models.entities.BookDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

public record BookDetailDTO(
    Long id,
    String summary,
    @JsonProperty("page_count")
    int pageCount,
    String year,
    String isbn
) {
  public BookDetail toBookDetail() {
    return new BookDetail(id, summary, pageCount, year, isbn);
  }
}
