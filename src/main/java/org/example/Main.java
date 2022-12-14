package org.example;

public class Main {
    public static void main(String[] args) {

        String team1 = "Cats";
        int cat1 = 15;
        int cat2 = 8;
        int cat3 = 9;
        int cat4 = 10;
        int cat5 = 31;
        double CatsAverage = (cat1+cat2+cat3+cat4+cat5)/5;
        double CatsResult = (cat1+cat2+cat3+cat4+cat5);
        System.out.println("Cереднє арифметичне команди " + team1 + " " + CatsAverage);

        String team2 = "Dogs";
        int dog1 = 35;
        int dog2 = 8;
        int dog3 = 9;
        int dog4 = 10;
        int dog5 = 31;
        double DogsAverege = (dog1+dog2+dog3+dog4+dog5)/5;
        double DogsResult = (dog1+dog2+dog3+dog4+dog5);
        System.out.println("Cереднє арифметичне команди " + team2 + " " + DogsAverege);

        if (CatsResult>DogsResult) {
            System.out.println("Перемогла команда " + team1 + " - набрала " + CatsResult + " очків");
        } else if (CatsResult<DogsResult) {
            System.out.println("Перемогла команда " + team2 + " - набрала " + DogsResult + " очків");
        } else if (CatsResult == DogsResult) {
            System.out.println("Нічия");
        }

    }
}