package com.oopex.inheritanceEx;

public class BoatInstance {
    public static void main(String[] args) {
        CrewMan[] crew1 = new CrewMan[2];
        CrewMan[] crew2 = new CrewMan[2];
        Frigate firstFrigate;
        Frigate secondFrigate;

        for (int i = 0; i < crew2.length ; i++) {
            crew1[i] = new CrewMan("tomm number " + i);
            crew2[i] = new CrewMan("Maikel number " + i);
        }


        // nota: la extension de radar se podría programar como un Value Object.
        firstFrigate = new Frigate("Lilttle Betsy", 200.0d, crew1,22.2d,5);
        secondFrigate = new Frigate("Good Helen", 500.0d, crew2,10.2d,10);

        System.out.println(firstFrigate.toString());
        System.out.println(secondFrigate.toString());
    }
}
