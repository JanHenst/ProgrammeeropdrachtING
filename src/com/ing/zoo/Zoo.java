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
        animals.put("bart", new Giraffe("bart")); //new animal 1
        animals.put("rick", new Bear("rick")); //new animal 2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        boolean commandFound = false;
        //Check if the input contains the command "hello"
        if (input.contains(commands[0])) {
            //Split the input, so that we can separate the name from the command
            String[] parts = input.split(" ");
            String animalName = parts.length > 1 ? parts[1] : null;

            //If the input only contains the command "hello", log the hello text of every animal
            if (input.equals(commands[0])) {
                commandFound = true;
                for (Animal animal : animals.values()) {
                    animal.sayHello();
                }
            }
            //If the input also has a name, check if there is an animal with that name and log its hello text
            else {
                if (animalName != null) {
                    Animal animal = animals.get(animalName);
                    if (animal != null) {
                        commandFound = true;
                        animal.sayHello();
                    }
                }
            }
        }

        //If command 1 is given, log the eatLeaves text of all the herbivore and omnivores
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

        //If command 2 is given, log the eatMeat text of all the carnivore and omnivores
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

        //If command 3 is given, log the trick of all the animals that can perform one
        if (input.equals(commands[3])) {
            commandFound = true;
            for (Animal animal : animals.values()) {
                if (animal instanceof PerformTrickAnimal) {
                    ((PerformTrickAnimal) animal).performTrick();
                }
            }
        }

        //If no command was found, log an error message
        if (!commandFound) {
            System.out.println("Unknown command: " + input);
        }
    }
}
