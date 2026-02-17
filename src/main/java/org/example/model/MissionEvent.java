package org.example.model;

public class MissionEvent extends Entity<Long> {
    private int AstronautId;
    private int day;
    private MissionEventType type;
    private int basePoints;

    public MissionEvent() {}

    public MissionEvent(int AstronautId, int day, MissionEventType type, int basePoints) {
        this.AstronautId = AstronautId;
        this.day = day;
        this.type = type;
        this.basePoints = basePoints;
    }

    public int getAstronautId() {
        return AstronautId;
    }

    public void setAstronautId(int astronautId) {
        AstronautId = astronautId;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MissionEventType getType() {
        return type;
    }

    public void setType(MissionEventType type) {
        this.type = type;
    }

    public int getBasePoints() {
        return basePoints;
    }

    public void setBasePoints(int basePoints) {
        this.basePoints = basePoints;
    }
}
