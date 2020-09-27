package com.waterme.wateringscheduler.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Plant extends AbstractEntity {

    @ManyToOne
    private PlantType plantType;

    @NotBlank
    @Size(max = 500, message = "Please enter a description using 500 characters or less.")
    private String description;

    private int daysBetweenWatering;

    public Plant() {}

    public Plant(PlantType aPlantType) {
        super();
        this.plantType = aPlantType;
    }

    public PlantType getPlantType() { return plantType; }

    public void setPlantType(PlantType plantType) { this.plantType = plantType; }

    public void setDescription(String description) { this.description = description; }

    public String getDescription() { return description; }

    public int getDaysBetweenWatering() { return daysBetweenWatering; }

    public void setDaysBetweenWatering(int daysBetweenWatering) { this.daysBetweenWatering = daysBetweenWatering; }

}
