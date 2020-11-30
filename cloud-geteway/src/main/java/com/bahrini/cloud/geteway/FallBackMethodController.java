package com.bahrini.cloud.geteway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public  String userServiceFallBackMethod(){
        return "user service is taking longer than Expected"+"svp try agian later";
    }

    @GetMapping("/departmentServiceFallBack")
    public  String departmentServiceFallBackMethod(){
        return "department service is taking longer than Expected"+"svp try agian later";
    }
}
