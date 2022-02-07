package dupradosantini.controllers;

import dupradosantini.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")//Prefixing to everything
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"/","/index", "/index.html", ""})//Everything is prefixed with owners
    public String listOwners(Model model){

        model.addAttribute("owners",ownerService.findAll());

        return "/owners/index";
    }
}
