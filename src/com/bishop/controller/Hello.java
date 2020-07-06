package com.bishop.controller;


import com.bishop.domain.Person;
import com.bishop.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/mvc")
public class Hello {
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("get")
    public String getTest(@RequestBody String body){
        System.out.println(body);
        return "get";
    }
    @RequestMapping("fast")
    public Object fast(@RequestBody Person person){
//        JSONObject object = (JSONObject) JSONObject.toJSON(person);
        return "object";
    }
    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping("user")
    public String userTest(User user){
        return user.toString();
    }
}
