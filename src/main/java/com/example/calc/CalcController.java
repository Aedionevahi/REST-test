package com.example.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping
    public String hello() {
        return "Witaj w testowej aplikacji! W pasku adresu dodaj: /calc - żeby przeprowadzić działania na dwóch liczbach lub /json - żeby zobaczyć rozkodowany obiekt json";
    }

    @GetMapping("/calc")
    public String goodbye() {
        return "Wybrałeś funkcjonalność kalkulatora. Aby rozpocząć obliczenia, dopisz w pasku adresu rządane działanie (/add | /sub | /mul | /div) oraz dwie liczby poprzedzone znakiem \"/\"";
    }

    @GetMapping("/calc/add/{numA}/{numB}")
    public String addition(
            @PathVariable("numA") long numA,
            @PathVariable("numB") long numB) {

        return numA + " + " + numB + " = " + (numA+numB);
    }

    @GetMapping("/calc/sub/{numA}/{numB}")
    public String subtraction(
            @PathVariable("numA") long numA,
            @PathVariable("numB") long numB) {

        return numA + " - " + numB + " = " + (numA-numB);
    }

    @GetMapping("/calc/mul/{numA}/{numB}")
    public String multiplication(
            @PathVariable("numA") long numA,
            @PathVariable("numB") long numB) {

        return numA + " x " + numB + " = " + (numA*numB);
    }

    @GetMapping("/calc/div/{numA}/{numB}")
    public String division(
            @PathVariable("numA") long numA,
            @PathVariable("numB") long numB) {

        return numA + " : " + numB + " = " + (numA/numB);
    }

}
