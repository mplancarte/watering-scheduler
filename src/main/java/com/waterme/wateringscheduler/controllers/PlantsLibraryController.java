package com.waterme.wateringscheduler.controllers;

import com.waterme.wateringscheduler.models.Plant;
import com.waterme.wateringscheduler.models.data.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

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

    @GetMapping("/view/{plantId}")
    public String displayViewPlant (Model model, @PathVariable int plantId) {
        Optional<Plant> optPlant = plantRepository.findById(plantId);
        if (optPlant.isPresent()) {
            Plant plant = (Plant) optPlant.get();
            model.addAttribute("plant", plant);
            return "view";
        } else {
            return "redirect:../";
        }
    }

}
