package com.example.demo;

import javax.validation.constraints.NotBlank;

public class Book {

  @NotBlank(message = "Title is mandatory")
  public String Title;
}
