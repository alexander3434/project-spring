package oracle.ban.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("axe")
public class ControllerOracle {
    @GetMapping
    public String list (){
        return "hello world";
    }
}
