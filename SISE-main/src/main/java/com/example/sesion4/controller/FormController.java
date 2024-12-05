
package com.example.sesion4.controller;

import com.example.sesion4.model.RegistroVenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("registroVenta", new RegistroVenta());
        return "form";
    }

    @PostMapping("/register")
    public String processForm(@ModelAttribute RegistroVenta registroVenta, Model model) {
        // Puedes procesar los datos aquí si es necesario
        model.addAttribute("datos", registroVenta);
        return "success";
    }
}
