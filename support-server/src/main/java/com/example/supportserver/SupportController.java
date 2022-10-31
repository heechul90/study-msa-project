package com.example.supportserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupportController {

    @GetMapping("/test/{param}")
    public String support(@PathVariable("param") String param) {
        if (param.equals("fail")) {
            throw new RuntimeException("failed");
        }
        return "Call Success Msa Support Param : " + param;
    }
}
