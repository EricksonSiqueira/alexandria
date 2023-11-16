package com.example.alexandria.dto;

import com.example.alexandria.models.entities.Publisher;

public record PublisherDTO(Long id, String name, String address) {

  public Publisher toPublisher() {
    return new Publisher(id, name, address);
  }
}
