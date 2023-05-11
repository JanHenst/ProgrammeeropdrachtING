package com.ing.zoo.animalTypes;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}