package com.example.demo;

import javax.validation.Valid;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

  final Log log = LogFactory.getLog(getClass());

  @PostMapping("/")
  public String add(@RequestHeader("id") String value, @Valid @RequestBody final Book book) {
    log.info(value); // want this value even when hit @ExceptionHandler
    return "added " + book.Title;
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(value = MethodArgumentNotValidException.class)
  public String handleInvalidRequest(final MethodArgumentNotValidException e) {
    //log headers; ??
    return e.getMessage();
  }

}
