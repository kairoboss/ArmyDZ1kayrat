package com.company;

public class Army {
    private int tanksNumber = 18000;
    private int airplanesNumber = 15000;
    private BaseLocation location;
    private Countries country;
    public int getTanksNumber(){
        return tanksNumber;
    }
    public int getAirplanesNumber(){
        return airplanesNumber;
    }
    public BaseLocation getLocation(){
        return location;
    }
    public Countries getCountry(){
        return country;
    }
}
