package org.example;

public class Main {
    public static void main(String[] args) {

        String team1 = "Cats";
        int cat1 = 6;
        int cat2 = 13;
        int cat3 = 9;
        int cat4 = 32;
        int cat5 = 10;
        int CatsResult = (cat1+cat2+cat3+cat4+cat5);

        String team2 = "Dogs";
        int dog1 = 12;
        int dog2 = 31;
        int dog3 = 5;
        int dog4 = 19;
        int dog5 = 19;
        int DogsResult = (dog1+dog2+dog3+dog4+dog5);

        if (CatsResult>DogsResult) {
            System.out.println("Перемогла команда " + team1 + " - набрала " + CatsResult + " очків");
        } else {
            System.out.println("Перемогла команда " + team2 + " - набрала " + DogsResult + " очків");
        }

    }
}