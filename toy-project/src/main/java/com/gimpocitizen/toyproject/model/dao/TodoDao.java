package com.gimpocitizen.toyproject.model.dao;

import com.gimpocitizen.toyproject.model.vo.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDao {

    private SqlSession session;

    @Autowired
    public void setSession(SqlSession session) {
        this.session = session;
    }

    public void insertTodo(Todo todo){
        session.insert("todo.InsertTodo", todo);
    }

    public void deleteTodo(Long todo_no){
        session.delete("todo.DeleteTodo", todo_no);
    }

    public void updateTodo(Todo todo){
        session.update("todo.UpdateTodo", todo);
    }

    public Todo selectTodo(Long todo_no){
        return session.selectOne("todo.SelectTodo", todo_no);
    }

    public List<Todo> selectTodoList(){
        return session.selectList("todo.SelectTodoList");
    }
}
