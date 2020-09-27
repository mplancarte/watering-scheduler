package com.waterme.wateringscheduler.controllers;

import com.waterme.wateringscheduler.models.Plant;
import com.waterme.wateringscheduler.models.PlantType;
import com.waterme.wateringscheduler.models.data.PlantRepository;
import com.waterme.wateringscheduler.models.data.PlantTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
//import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private PlantRepository plantRepository;

    @Autowired
    private PlantTypeRepository plantTypeRepository;

    @GetMapping("add")
    public String displayAddPlantForm(Model model) {
        model.addAttribute("title","Add Plant");
        model.addAttribute("plantTypes",plantTypeRepository.findAll());
        model.addAttribute(new Plant());
        return "add";
    }

    @PostMapping("add")
    public String processAddPlantForm(@ModelAttribute @Valid Plant newPlant,
                                      Errors errors, Model model, @RequestParam int plantTypeId) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Plant");
            model.addAttribute("plantTypes",plantTypeRepository.findAll());
            model.addAttribute(new Plant());
            return "add";
        }
        PlantType plantType = plantTypeRepository.findById(plantTypeId).get();
        newPlant.setPlantType(plantType);
        plantRepository.save(newPlant);
        return "redirect:";
    }
}
