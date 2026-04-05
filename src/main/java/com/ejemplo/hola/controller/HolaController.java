package com.ejemplo.hola.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hola")
    public Map<String, String> saludar() {
        return Map.of(
                "mensaje", "Hola mundo",
                "estado", "ok"
        );
    }
}
