package com.eight.glyxyxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Kele-Bing
 * @Create 2021/8/24 16:06
 * @Version 1.0
 */
@Controller
@RequestMapping("/eight")
public class IndexController {
    
    @RequestMapping(value = {"/","index"})
    @ResponseBody
    public String index(){
        return "第八组 报修系统.....";
    }
}
