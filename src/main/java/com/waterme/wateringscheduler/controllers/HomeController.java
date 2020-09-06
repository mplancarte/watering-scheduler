package com.waterme.wateringscheduler.controllers;

import com.waterme.wateringscheduler.models.Plant;
import com.waterme.wateringscheduler.models.data.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private PlantRepository plantRepository;

    @GetMapping("add")
    public String displayAddPlantForm(Model model) {
        model.addAttribute("title", "Add Plant");
        model.addAttribute("plants", plantRepository.findAll());
        model.addAttribute(new Plant());
        return "add";
    }

    @PostMapping("add")
    public String processAddPlantForm(@ModelAttribute @Valid Plant newPlant,
                                      Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Plant");
            return "add";
        } else {
            plantRepository.save(newPlant);
            return "redirect:";
        }
    }

}
