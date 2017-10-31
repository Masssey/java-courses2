package ru.masssey.veteinar;
public class Dog implements Pet {
    //private final Pet pet;

    private String petName = "";

    public Dog(String name)
    {
        petName = name;
    }




    //@Override
    public void makeSound()
    {
        //  this.pet.makeSound();
        System.out.println( "Gav Gav!");
    }

    //  @Override
    public String getName()
    {
        return petName;
    }
}
