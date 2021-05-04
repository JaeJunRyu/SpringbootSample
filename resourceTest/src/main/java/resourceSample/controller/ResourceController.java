package resourceSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {

    @GetMapping(value = "/index")
    public String resourceTest(){
        return "test";
    }

}
