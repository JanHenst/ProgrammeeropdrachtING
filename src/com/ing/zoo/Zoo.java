package com.ing.zoo;

import com.ing.zoo.animalTypes.*;
import com.ing.zoo.animals.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Map<String, Animal> animals = new HashMap<>();
        animals.put("henk", new Lion("henk"));
        animals.put("elsa", new Hippo("elsa"));
        animals.put("dora", new Pig("dora"));
        animals.put("wally", new Tiger("wally"));
        animals.put("marty", new Zebra("marty"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        boolean commandFound = false;
        if (input.contains(commands[0])) {
            String[] parts = input.split(" ");
            String animalName = parts.length > 1 ? parts[1] : null;

            if (input.equals(commands[0])) {
                commandFound = true;
                for (Animal animal : animals.values()) {
                    animal.sayHello();
                }
            } else {
                if (animalName != null) {
                    Animal animal = animals.get(animalName);
                    if (animal != null) {
                        commandFound = true;
                        animal.sayHello();
                    }
                }
            }
        }

        if (input.equals(commands[1])) {
            commandFound = true;
            for (Animal animal : animals.values()) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                } else if (animal instanceof Omnivore) {
                    ((Omnivore) animal).eatLeaves();
                }
            }
        }

        if (input.equals(commands[2])) {
            commandFound = true;
            for (Animal animal : animals.values()) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                } else if (animal instanceof Omnivore) {
                    ((Omnivore) animal).eatMeat();
                }
            }
        }

        if (input.equals(commands[3])) {
            commandFound = true;
            for (Animal animal : animals.values()) {
                if (animal instanceof PerformTrickAnimal) {
                    ((PerformTrickAnimal) animal).performTrick();
                }
            }
        }

        if (!commandFound) {
            System.out.println("Unknown command: " + input);
        }
    }
}
