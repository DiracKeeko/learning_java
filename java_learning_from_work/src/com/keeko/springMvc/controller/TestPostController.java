package com.keeko.springMvc.controller;


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

            @RequestMapping(value = "/list", method = RequestMethod.POST)

            @PostMapping(value = "/list")

                @PostMapping("/list") // 与 @PostMapping(value = "/list") 完全登记

        总结：
            优先使用@PostMapping
    */

}
