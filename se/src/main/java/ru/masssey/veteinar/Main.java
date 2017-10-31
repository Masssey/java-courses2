package ru.masssey.veteinar;
public class Main
{
    public static void main(String[] arg)
    {
       // Cat cat = new Cat()
        Clinic _clinic = new Clinic();
        _clinic.addClient( new Client(0, new Cat("Феликс")) );
        _clinic.addClient( new Client(0, new Cat("Собака")) );
        _clinic.addClient( new Client(2, new CatDog(new Cat(("Кот")), new Dog("Пес"))));

        Client client1 = _clinic.findClientByPetName("Собака");
        Client client2 = _clinic.findClientByPetName("пес");
        int k = 0;
        System.out.println("дщд+");
    }
}
