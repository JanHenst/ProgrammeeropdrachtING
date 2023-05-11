package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Carnivore;

public class Lion extends Carnivore {
    public String name;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
