package DTNsShop.poly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class t {

    @GetMapping("/test")
    public String test(){
        return "account/t";
    }
}