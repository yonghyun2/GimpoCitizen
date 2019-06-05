package com.gimpocitizen.toyproject.model.vo;

import com.gimpocitizen.toyproject.model.service.TodoService;

public class Todo {

    private long todo_no;
    private String todo_date;
    private String todo_title;
    private String todo_desc;
    private String todo_category;
    private boolean todo_iscomplete;
    private boolean todo_isdel;

    public Todo() {
        TodoService ts = new TodoService();
        ts.fightingJusung();
    }

    public Todo(long todo_no, String todo_date, String todo_title, String todo_desc, String todo_category, boolean todo_iscomplete, boolean todo_isdel) {
        this.todo_no = todo_no;
        this.todo_date = todo_date;
        this.todo_title = todo_title;
        this.todo_desc = todo_desc;
        this.todo_category = todo_category;
        this.todo_iscomplete = todo_iscomplete;
        this.todo_isdel = todo_isdel;
    }

    public Todo(String todo_date, String todo_title, String todo_desc, String todo_category) {
        this.todo_date = todo_date;
        this.todo_title = todo_title;
        this.todo_desc = todo_desc;
        this.todo_category = todo_category;
    }

    public long getTodo_no() {
        return todo_no;
    }

    public void setTodo_no(long todo_no) {
        this.todo_no = todo_no;
    }

    public String getTodo_date() {
        return todo_date;
    }

    public void setTodo_date(String todo_date) {
        this.todo_date = todo_date;
    }

    public String getTodo_title() {
        return todo_title;
    }

    public void setTodo_title(String todo_title) {
        this.todo_title = todo_title;
    }

    public String getTodo_desc() {
        return todo_desc;
    }

    public void setTodo_desc(String todo_desc) {
        this.todo_desc = todo_desc;
    }

    public String getTodo_category() {
        return todo_category;
    }

    public void setTodo_category(String todo_category) {
        this.todo_category = todo_category;
    }

    public boolean isTodo_iscomplete() {
        return todo_iscomplete;
    }

    public void setTodo_iscomplete(boolean todo_iscomplete) {
        this.todo_iscomplete = todo_iscomplete;
    }

    public boolean isTodo_isdel() {
        return todo_isdel;
    }

    public void setTodo_isdel(boolean todo_isdel) {
        this.todo_isdel = todo_isdel;
    }
}
