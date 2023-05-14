package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Herbivore;
import com.ing.zoo.animalTypes.PerformTrickAnimal;

import java.util.Random;

public class Giraffe extends Herbivore implements PerformTrickAnimal {
    public String name;
    public String eatText;
    public String trick;


    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("Muuue");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "hmmm yes very good";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "shakes head";
        }
        else
        {
            trick = "stands on two legs";
        }
        System.out.println(trick);
    }
}
