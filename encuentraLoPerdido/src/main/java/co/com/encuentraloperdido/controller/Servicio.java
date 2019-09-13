package co.com.encuentraloperdido.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/calculadora")
public class Servicio {
    @GetMapping("/{numero1}/{numero2}/suma")
    public int sumar(@PathVariable("numero1") int numero1,@PathVariable("numero2")  int numero2){
        return numero1+numero2;
    }


}
