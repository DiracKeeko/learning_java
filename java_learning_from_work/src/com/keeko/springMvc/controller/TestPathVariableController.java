package com.keeko.springMvc.controller;


import com.keeko.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/get")
public class TestPathVariableController {

    // case3.1
    @GetMapping("/collection/delete/{id}")
    public void deleteCollection(@PathVariable Integer id) {
        System.out.println("id->" + id);
    }

    // case3.2 不推荐
    // 使用 @PostMapping 接收路径参数  (与 @RequestBody 搭配使用)
    @PostMapping("/update/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User userRequest) {
        System.out.println("Updating User ID: " + id);
        System.out.println("New Name: " + userRequest.getName());
    }

}
