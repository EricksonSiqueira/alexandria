package com.example.alexandria.models.repositories;

import com.example.alexandria.models.entities.BookDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDetailRepository extends JpaRepository<BookDetail, Long> {}
