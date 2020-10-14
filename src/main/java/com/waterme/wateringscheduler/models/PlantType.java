package com.waterme.wateringscheduler.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlantType extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 60, message = "Enter a valid name between 3 and 60 characters.")
    private String name;

    @OneToMany
    @JoinColumn
    private final List<Plant> plants = new ArrayList<>();

    @NotBlank
    private String description;

    public PlantType() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Plant> getPlants() { return plants; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
