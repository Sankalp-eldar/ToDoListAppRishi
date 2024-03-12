package com.example.todolistapp.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
@Entity(tableName = "Tasks")
public class Tasks  {
    @PrimaryKey(autoGenerate = true)
    private long id = 0;

    @ColumnInfo(name = "Tasks")
    private String task;

    @ColumnInfo(name = "Status")
    private int status;
    public Tasks(String task, int status) {
        this.task = task;
        this.status = status;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Ignore
    public Tasks(){

    }
}