package nl.bestego.barebone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World by Team Blue";
    }

}
