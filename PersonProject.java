package com.example.demo3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonProject {
    ArrayList<String> user=new ArrayList<>();


      @GetMapping("/name")
    public ArrayList getusers() {
          return user ;
      }

    @PostMapping ("/name")
    public String addTodo(@RequestBody String todo){
        user.add (user);
        return "Post new name";
    }

    @PutMapping("/user/{index}")
    public String updateUser(@PathVariable int index,@RequestBody String name) {
        user.set(index, name);
        return "User updated";
    }
    @DeleteMapping("/user/{index}")
    public String deleteTodo(@PathVariable int index) {
        user.remove(index);
        return "Todo deleted from the list";
    }







}
