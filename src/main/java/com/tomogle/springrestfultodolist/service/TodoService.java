package com.tomogle.springrestfultodolist.service;

import com.tomogle.springrestfultodolist.dto.TodoDTO;
import com.tomogle.springrestfultodolist.exception.TodoBadIDException;
import com.tomogle.springrestfultodolist.exception.TodoNotFoundException;

import java.util.List;

/**
 * Service for interacting with domain Todos and exposing TodoDTOs.
 */
public interface TodoService {
  List<TodoDTO> findAll();
  TodoDTO findById(String id) throws TodoNotFoundException;
  TodoDTO create(TodoDTO todo);
  TodoDTO update(String id, TodoDTO todo) throws TodoBadIDException;
  TodoDTO delete(String id) throws TodoNotFoundException;;
}
