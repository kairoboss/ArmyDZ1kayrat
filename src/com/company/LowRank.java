package com.company;

public final class LowRank extends Soldiers {
    private int age;
    private int militaryServiceExperience;
    private String rank;
    private BaseLocation location;
    private Countries country;
    public LowRank(){}
    public LowRank(int militaryServiceExperience, int age){
        this.militaryServiceExperience = militaryServiceExperience;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getMilitaryServiceExperience(){
        return militaryServiceExperience;
    }
    public String getRank(){
        return rank;
    }
    public BaseLocation getLocation(){
        return location;
    }
    public Countries getCountry(){
        return country;
    }
    @Override
    public void stopService(String month, int day){
        System.out.println("Дата ухода в отпуск " + day + month);}
}
