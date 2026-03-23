package cl.bancoxyz.transferencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaController {

    @GetMapping("/Hola")
    public String holamundo(){
        return "Hola Mundo";
    }

    @GetMapping("/chavalin")
    public String chavalin(){
        return "iepa";
    }
}


