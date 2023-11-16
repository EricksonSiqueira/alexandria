package com.example.alexandria.models.repositories;

import com.example.alexandria.models.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> { }
