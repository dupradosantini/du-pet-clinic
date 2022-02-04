package dupradosantini.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")//Prefixing to everything
@Controller
public class OwnerController {
    @RequestMapping({"/","/index", "/index.html", ""})//Everything is prefixed with owners
    public String listOwners(){
        return "/owners/index";
    }
}
