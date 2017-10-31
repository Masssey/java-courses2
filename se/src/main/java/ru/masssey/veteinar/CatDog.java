package ru.masssey.veteinar;

public class CatDog implements  Pet
{
    Cat cat;
    Dog dog;
    CatDog( Cat cat, Dog dog)
    {
        this.cat = cat;
        this.dog = dog;

    }

    public void makeSound()
    {
        System.out.println(" Miy gav!!!");
    }

    public String  getName()
    {
        String str = String.format("%s-%s", cat.getName(), dog.getName());
        return str;
    }
}
