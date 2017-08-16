package com.liangyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 描述：
 *
 * @author tony
 * @创建时间 2017-08-16 10:06
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("hello", "您好");
        return "index";
    }
}
