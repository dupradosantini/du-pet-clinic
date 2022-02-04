package dupradosantini.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","index","index.html","/"})
    String index(){
        return "index"; //it will look for a template called index, which we created.
    }
}
