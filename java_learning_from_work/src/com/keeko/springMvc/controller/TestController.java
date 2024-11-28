package com.keeko.springMvc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    // 用 RequestMapping 处理GET请求
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public void list() {
        System.out.println("list");
    }

    // 用 GetMapping 处理GET请求
    @GetMapping(value = "/rank")
    public void rank() {
        System.out.println("rank");
    }

    /*
        说明：
        @GetMapping 是基于 @RequestMapping 实现的，功能上没有本质区别。以下两个注解的作用完全等价：

            @RequestMapping(value = "/list", method = RequestMethod.GET)

            @GetMapping(value = "/list")

        @GetMapping更语义化，直接表明这是一个处理 GET 请求 的方法，简洁清晰。

        @RequestMapping适合处理多种 HTTP 请求的场景，比如需要同时支持 GET 和 POST。

        总结：
            优先使用@GetMapping
    */

}
