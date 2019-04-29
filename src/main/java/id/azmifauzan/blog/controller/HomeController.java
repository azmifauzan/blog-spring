package id.azmifauzan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model)
    {
        model.addAttribute("judul","Fauzan Azmi Blog");
        return "home";
    }
}
