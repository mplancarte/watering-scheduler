package com.waterme.wateringscheduler.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlantType extends AbstractEntity {

    @OneToMany
    @JoinColumn
    private final List<Plant> plants = new ArrayList<>();

    @NotBlank
    private String description;

    public PlantType() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Plant> getPlants() { return plants; }
}
