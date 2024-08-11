package com.example.todo_list.controller;

import com.example.todo_list.entity.Task;
import com.example.todo_list.service.TaskService;
import com.example.todo_list.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> listAllTasks(){
        try{

        }catch (Exception ex){
            return ResponseEntity.badRequest().body(null);
        }
        return null;
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<Task> listTaskById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/tasks")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        return null;
    }

    @PutMapping("/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
        return null;
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Task> deleteTaskById(@PathVariable Long id){
        return null;
    }


}
