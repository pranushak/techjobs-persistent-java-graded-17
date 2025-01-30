package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty(message = "Location must not be empty.")
    @Size(min = 3, max = 200)
    private String description;

    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    public @NotEmpty(message = "Location must not be empty.") @Size(min = 3, max = 200) String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty(message = "Location must not be empty.") @Size(min = 3, max = 200) String description) {
        this.description = description;
    }

}
