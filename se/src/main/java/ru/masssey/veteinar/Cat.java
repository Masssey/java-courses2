package ru.masssey.veteinar;
public class Cat implements Pet {
    //private final Pet pet;

    private String petName = "";

    public Cat(String name)
    {
        petName = name;
    }



    //@Override
    public void makeSound()
    {
      //  this.pet.makeSound();
        System.out.println( "Miy Miy!");
    }

  //  @Override
    public String getName()
    {
        return petName;
    }
}
