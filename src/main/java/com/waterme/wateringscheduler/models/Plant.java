package com.waterme.wateringscheduler.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Plant extends AbstractEntity {

    @NotBlank
    @Size(max = 500, message = "Please enter a description using 500 characters or less.")
    private String description;

    public Plant() {}

    public String getDescription() { return description; }

    public void setDescription() { this.description = description; }

}
