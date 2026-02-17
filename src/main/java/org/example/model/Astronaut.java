package org.example.model;

public class Astronaut extends Entity<Long> {

    private String name;
    private String spacecraft;
    private AstronautStatus status;
    private int experienceLevel;

    public Astronaut() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpacecraft() {
        return spacecraft;
    }

    public void setSpacecraft(String spacecraft) {
        this.spacecraft = spacecraft;
    }

    public AstronautStatus getStatus() {
        return status;
    }

    public void setStatus(AstronautStatus status) {
        this.status = status;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public String toString() {
        return "[#" + getId() + "] " + name + " | " + spacecraft + " | " + status + " | exp=" + experienceLevel;
    }
}