package org.example.model;

public class Supply extends Entity<Long>{
    private int AstronautId;
    private int day;
    private SupplyType type;
    private int value;

    public Supply() {}

    public Supply(int AstronautId, int day, SupplyType type, int value) {
        this.AstronautId = AstronautId;
        this.day = day;
        this.type = type;
        this.value = value;
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

    public SupplyType getType() {
        return type;
    }

    public void setType(SupplyType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
