package com.ing.zoo.animals;

import com.ing.zoo.animalTypes.Herbivore;

public class Zebra extends Herbivore {
    public String name;
    public String eatText;

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("zebra zebra");
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
