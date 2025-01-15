package com.keeko.springMvc.controller;


import com.keeko.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/post")
public class TestPostController {
    // 用 RequestMapping 处理Post请求
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public void list() {
        System.out.println("list");
    }

    // 用 PostMapping 处理Post请求
    // @PostMapping("/rank") // 与下面一行代码完全等价
    @PostMapping(value = "/rank")
    public void rank() {
        System.out.println("rank");
    }

    /*
        说明：
        @PostMapping 是基于 @RequestMapping 实现的，功能上没有本质区别。以下两个注解的作用完全等价：
            // case2.3
            @RequestMapping(value = "/list", method = RequestMethod.POST)

            @PostMapping(value = "/list")

                @PostMapping("/list") // 与 @PostMapping(value = "/list") 完全等价

        总结：
            优先使用@PostMapping
    */

    // case2.1
    // @PostMapping + @RequestBody 接收参数
    @PostMapping(value = "/add")
    public void add(@RequestBody User userRequest) {
        System.out.println("Received User Info:");
        System.out.println("name" + userRequest.getName());
        System.out.println("id" + userRequest.getId());
    }

    // case2.2
    /*
    @PostMapping("/add")
    public void add(@RequestBody User userRequest) {
        System.out.println("Received User Info:");
        System.out.println("name" + userRequest.getName());
        System.out.println("id" + userRequest.getId());
    }
    */

    /*
    // case2-f1
    // @PostMapping + @RequestParam 接收参数  (不建议使用)
    // 使用 @PostMapping 接收表单参数
    @PostMapping("/addForm")
    public ResponseEntity<String> addUserFromForm(@RequestParam String name,
                                                  @RequestParam String email,
                                                  @RequestParam int age) {
        System.out.println("Received User Info from Form:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        return ResponseEntity.ok("User added successfully via form");
    }
     */

    /*
        其他说明：
            1. @PostMapping 也可以像 @GetMapping 一样用 @RequestParam 接收url中query类型的参数 但这没有意义
                (都用query了，直接用GET请求啊)

            2. @PostMapping 使用@PathVariable接收 url中的路径参数，同时使用@RequestBody接收reqBody中的参数
                (会用到，比较少，大部分的情况只用 @RequestBody 就可以了 路径中的参数信息也可以放到 reqBody中)

            3. @RequestBody 也可以和 @RequestParam 混用，极其不推荐。
     */
}
