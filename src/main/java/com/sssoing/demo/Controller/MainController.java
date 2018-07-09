package com.sssoing.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {
//    @Autowired
//    @Qualifier("BoardService")
//    private BoardService boardService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model, final HttpSession session){


        return "main";

    }


}
