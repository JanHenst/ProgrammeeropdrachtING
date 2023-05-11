package com.ing.zoo.animalTypes;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    public abstract void eatLeaves();
}