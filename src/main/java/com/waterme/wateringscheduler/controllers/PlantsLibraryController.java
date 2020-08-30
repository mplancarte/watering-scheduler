package com.waterme.wateringscheduler.controllers;

import com.waterme.wateringscheduler.models.data.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantsLibraryController {

    @Autowired
    private PlantRepository plantRepository;


    @GetMapping("/plant-library")
    public String index(Model model) {
        model.addAttribute("title", "Plant Library");
        model.addAttribute("plants", plantRepository.findAll());

        return "plant-library";
    }

}
