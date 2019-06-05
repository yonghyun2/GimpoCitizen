package com.gimpocitizen.toyproject.model.service;

import com.gimpocitizen.toyproject.model.dao.TodoDao;
import com.gimpocitizen.toyproject.model.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoDao todoDao;

    @Autowired
    public void setTodoDao(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public boolean createTodo(Todo todo){
        if(todoDao.selectTodo(todo.getTodo_no())!=null){
            return false;
        }
        todoDao.insertTodo(todo);
        return true;
    }

    public boolean removeTodo(Long todo_no){
        if (todoDao.selectTodo(todo_no)==null){
            return false;
        }
        todoDao.deleteTodo(todo_no);
        return true;
    }

    public boolean updateTodo(Todo todo){

    }
}
