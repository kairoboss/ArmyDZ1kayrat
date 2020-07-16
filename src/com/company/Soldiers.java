package com.company;

public class Soldiers extends Army {
    private int age;
    private int militaryServiceExperience;
    private String rank;
    private BaseLocation location;
    private Countries country;

    public Soldiers() {
    }

    public int getAge() {
        return age;
    }

    public int getMilitaryServiceExperience() {
        return militaryServiceExperience;
    }

    public String getRank() {
        return rank;
    }

    public BaseLocation getLocation() {
        return location;
    }

    public Countries getCountry() {
        return country;
    }

    public void stopService(String month, int day) {
        System.out.println("Дата ухода в отставку " + day + month);
    }

    final public void stopService(int day, String month) {
        System.out.println("Дата ухода в отставку " + day + month);
    }

    public void soldierInfo() {
        System.out.println("Возраст служащего " + age +
                "\nОпыт службы " + militaryServiceExperience +
                "\nВоенное звание " + rank +
                "\nМестоположение базы " +location+
                "\nСтрана "+country);
    }

}
