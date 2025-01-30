package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location must not be empty.")
    @Size(min = 3, max = 50)
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {
    }

    public @NotNull @Size(min = 3, max = 50) String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(min = 3, max = 50) String location) {
        this.location = location;
    }
}
