package com.example.alexandria.dto;

public record ResponseDTO<T> (String message, T data){}
