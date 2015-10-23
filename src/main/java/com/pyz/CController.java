package com.pyz;

import java.io.IOException;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CController {

    @Autowired
    CService cser;
    
    @RequestMapping("/ctrl/abc")
    public String helloWorld(){
       cser.saveCuser();
       return "home";
    }
    
    @RequestMapping(value="/login",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String login(){
        return "哈";
    }
}
