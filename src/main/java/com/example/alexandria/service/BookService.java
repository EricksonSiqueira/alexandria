package com.example.alexandria.service;

import com.example.alexandria.models.entities.Book;
import com.example.alexandria.models.entities.BookDetail;
import com.example.alexandria.models.repositories.BookDetailRepository;
import com.example.alexandria.models.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  private final BookRepository bookRepository;

  private final BookDetailRepository bookDetailRepository;

  @Autowired
  public BookService(BookRepository bookRepository, BookDetailRepository bookDetailRepository) {
    this.bookRepository = bookRepository;
    this.bookDetailRepository = bookDetailRepository;
  }

  public Book insertBook(Book book) {
    return bookRepository.save(book);
  }

  public Optional<Book> updateBook(Long id, Book book) {
    Optional<Book> optionalBook = bookRepository.findById(id);

    if(optionalBook.isPresent()) {
      Book bookFromDb = optionalBook.get();
      bookFromDb.setTitle(book.getTitle());
      bookFromDb.setGenre(book.getGenre());

      Book updatedBook = bookRepository.save(bookFromDb);
      return Optional.of(updatedBook);
    }

    return optionalBook;
  }

  public Optional<Book> removeBookById(Long id) {
    Optional<Book> bookOptional = bookRepository.findById(id);

    if(bookOptional.isPresent()) {
      bookRepository.deleteById(id);
    }

    return bookOptional;
  }

  public Optional<Book> getBookById(Long id) {
    return bookRepository.findById(id);
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }


  public BookDetail insertBookDetail(BookDetail bookDetail) {
    return bookDetailRepository.save(bookDetail);
  }

  public Optional<BookDetail> updateBookDetail(Long id, BookDetail bookDetail) {
    Optional<BookDetail> optionalBookDetail = bookDetailRepository.findById(id);

    if(optionalBookDetail.isPresent()) {
      BookDetail bookDetailFromDb = optionalBookDetail.get();
      bookDetailFromDb.setSummary(bookDetail.getSummary());
      bookDetailFromDb.setPageCount(bookDetail.getPageCount());
      bookDetailFromDb.setYear(bookDetail.getYear());
      bookDetailFromDb.setIsbn(bookDetail.getIsbn());

      BookDetail updatedBookDetail = bookDetailRepository.save(bookDetailFromDb);
      return Optional.of(updatedBookDetail);
    }

    return optionalBookDetail;
  }

  public Optional<BookDetail> removeBookDetailById(Long id) {
    Optional<BookDetail> bookDetailOptional = bookDetailRepository.findById(id);

    if(bookDetailOptional.isPresent()) {
      bookDetailRepository.deleteById(id);
    }

    return bookDetailOptional;
  }

  public Optional<BookDetail> getBookDetailById(Long id) {
    return bookDetailRepository.findById(id);
  }
}
