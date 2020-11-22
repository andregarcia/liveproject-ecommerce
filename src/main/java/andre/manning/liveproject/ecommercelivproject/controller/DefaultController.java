package andre.manning.liveproject.ecommercelivproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {


    @GetMapping(value = "/")
    public String home(final Model model){
        return "index.html";
    }

}
