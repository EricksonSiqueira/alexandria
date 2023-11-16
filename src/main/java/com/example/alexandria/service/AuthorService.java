package com.example.alexandria.service;

import com.example.alexandria.models.entities.Author;
import com.example.alexandria.models.repositories.AuthorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
  private AuthorRepository authorRepository;

  @Autowired
  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Author insertAuthor(Author author) {
    return authorRepository.save(author);
  }

  public Optional<Author> updateAuthor(Long id, Author author) {
    Optional<Author> optionalAuthor = authorRepository.findById(id);

    if(optionalAuthor.isPresent()) {
      Author authorFromDb = optionalAuthor.get();
      authorFromDb.setName(author.getName());
      authorFromDb.setNationality(author.getNationality());

      Author updatedAuthor = authorRepository.save(authorFromDb);
      return Optional.of(updatedAuthor);
    }

    return optionalAuthor;
  }

  public Optional<Author> removeAuthorById(Long id) {
    Optional<Author> authorOptional = authorRepository.findById(id);

    if(authorOptional.isPresent()) {
      authorRepository.deleteById(id);
    }

    return authorOptional;
  }

  public Optional<Author> getAuthorById(Long id) {
    return authorRepository.findById(id);
  }

  public List<Author> getAllAuthors() {
    return authorRepository.findAll();
  }
}
