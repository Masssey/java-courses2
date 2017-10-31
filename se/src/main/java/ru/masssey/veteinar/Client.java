package ru.masssey.veteinar;
public class Client
{
    private final int _id;
    private final Pet _pet;
    public Client(int id, Pet pet)
    {
        this._id = id;
        this._pet = pet;
    }

    public Pet getPet()
    {
        return this._pet;
    }


}
