package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// spring4之后新添加的注解，原来返回json需要@ResponseBody和@Controller
@RestController
// 配置url映射
@RequestMapping(value = "hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    // @PathVariable 获取url中的数据 http://127.0.0.1:8080/hello/say/5
    // 注意@PathVariable("id")内的变量名（id）必须和 @GetMapping(value = "/say/{id}")中的变量名一致
    // GetMapping 组合注解
    @GetMapping(value = "/say/{id}")
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

    // @RequestParam 获取请求参数的值 http://127.0.0.1:8080/hello/say1?id=10
    // 给默认值要给字符串
    @GetMapping(value = "/say1")
    public String say1(@RequestParam(value = "id", required = false, defaultValue = "3") Integer id) {
        return "id: " + id;
    }
}
