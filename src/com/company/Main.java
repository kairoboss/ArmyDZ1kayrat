package com.company;

public class Main {

    public static void main(String[] args) {
        Soldiers pilot = new Soldiers();
        pilot.stopService("May", 25);
        pilot.soldierInfo();
        LowRank sergeant = new LowRank();
        sergeant.stopService(5, "February");
        sergeant.soldierInfo();
        LowRank captain = new LowRank(15, 35);
        captain.stopService(6, "July");
        captain.soldierInfo();
    }
}
