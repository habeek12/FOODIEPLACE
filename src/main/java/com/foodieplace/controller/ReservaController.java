package com.foodieplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {
    @GetMapping("/reserva")
    public String reservaForm(Model model) {
        model.addAttribute("message", "Reserva tu mesa");
        return "reserva";
    }
}