package com.pyz;

import java.io.IOException;
import java.io.Writer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CController {

    private static Logger logger=Logger.getLogger(CController.class);
    
    @Autowired
    CService cser;
    
    @RequestMapping("/ctrl/abc")
    public String helloWorld(){
       cser.saveCuser();
       return "home";
    }
    
    @RequestMapping(value="/login")
    @ResponseBody
    public CUser login(@RequestBody CUser user){
        logger.info("访问了login");
        return user;
    }
}
