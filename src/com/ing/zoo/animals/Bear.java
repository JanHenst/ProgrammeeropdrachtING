package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Omnivore;
import com.ing.zoo.animalTypes.PerformTrickAnimal;

import java.util.Random;

public class Bear extends Omnivore implements PerformTrickAnimal {
    public String name;
    public String eatText;
    public String trick;

    public Bear(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("groowww");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munchy berry good";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom fishhhhh";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "tap dances";
        }
        else
        {
            trick = "juggles four fish";
        }
        System.out.println(trick);
    }
}
