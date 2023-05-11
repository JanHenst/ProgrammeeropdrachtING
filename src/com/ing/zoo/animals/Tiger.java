package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Carnivore;
import com.ing.zoo.animalTypes.PerformTrickAnimal;

import java.util.Random;

public class Tiger extends Carnivore implements PerformTrickAnimal {
    public String name;
    public String eatText;
    public String trick;

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
