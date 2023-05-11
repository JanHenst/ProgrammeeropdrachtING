package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Herbivore;

public class Hippo extends Herbivore {
    public String name;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
