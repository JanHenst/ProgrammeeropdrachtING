package com.ing.zoo.animalTypes;

public abstract class Omnivore extends Animal {
    public Omnivore(String name) {
        super(name);
    }

    public abstract void eatMeat();
    public abstract void eatLeaves();
}