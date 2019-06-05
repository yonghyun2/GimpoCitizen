package com.gimpocitizen.toyproject.controller;

import com.gimpocitizen.toyproject.model.service.TodoService;
import com.gimpocitizen.toyproject.model.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
public class TodoController {

    private TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    public ResponseEntity<Boolean> Add(@RequestBody Todo todo){
        if(todoService.createTodo(todo)){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(false, HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/todo/{todo_no}")
    public ResponseEntity<Todo> GetTodoDetail(@PathVariable Long todo_no){
        return new ResponseEntity<>(todoService.readTodo(todo_no), HttpStatus.OK);
    }

    @GetMapping("/todolist")
    public ResponseEntity<List<Todo>> GetTodoList(){
        return new ResponseEntity<>(todoService.readTodoList(), HttpStatus.OK);
    }
}
