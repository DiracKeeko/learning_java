package com.keeko.springMvc.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/get")
public class TestGetController {
    // 用 RequestMapping 处理GET请求
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list() {
        System.out.println("list");
    }

    // 用 GetMapping 处理GET请求
    // @GetMapping("/rank") // 也可以
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


    // 通过 @RequestParam 获取 GET 请求中的 query 参数 1个参数;  ( /productRank?type=fund )
    @GetMapping(value = "/productRank")
    public void productRank(@RequestParam(value = "type") String type) {
        System.out.println("type ->" + type);
    }

    // 通过 @RequestParam 获取 GET 请求中的 query 参数 2个参数; /productDetail?type=fund&id=111
    @GetMapping(value = "/productDetail")
    public void productDetail(@RequestParam(value = "type") String type,
                              @RequestParam(value = "id") String id) {
        System.out.println("type ->" + type);
        System.out.println("id ->" + id);
    }

    // 通过 @RequestParam 获取 GET 请求中的 query 参数 有默认值"fund"
    // 设置 "defaultValue"
    @GetMapping(value = "/query")
    public void query(@RequestParam(value = "type", defaultValue = "fund") String type) {
        System.out.println("type ->" + type);
    }

    // 通过 @RequestParam 获取 GET 请求中的 query 参数，共有2个参数，其中一个为可选参数
    // 设置 required = false;
    /*
        说明：
            1. 如果required = false，且未提供此参数，该参数的值将为 null。
            2. required 和 defaultValue 可以同时存在
     */
    @GetMapping(value = "/search")
    public void search(@RequestParam(value = "type") String type,
                       @RequestParam(value = "id", required = false) String id) {
                       // @RequestParam(value = "id", required = false, defaultValue = "defaultId") String id) {
        System.out.println("type ->" + type);
    }
}
