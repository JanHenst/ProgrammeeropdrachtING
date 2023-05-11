package com.ing.zoo.animalTypes;

public abstract class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }

    public abstract void eatMeat();
}