package com.cmh.domain.springboot01

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {

    @RequestMapping
    def hello(){
        return "Hello World!"
    }
}
