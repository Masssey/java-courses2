package ru.masssey.veteinar;


import java.util.List;
import java.util.ArrayList;
public class Clinic
{
    //private List <_clients>;

    List<Client> _clients;
    Clinic()
    {
        _clients = new ArrayList<Client>();
    }

    public void addClient( Client client)
    {
        _clients.add(client);
    }
    public Client findClientByPetName(String name)
    {
        try
        {
           for (Client client : _clients)
           {
               if (client.getPet().getName() == name)
                   return client;
           }
        }
        catch (Exception ex)
        {
            System.out.println("Что-то случилось!");
        }
        return new Client(0, new Cat("Нема"));

    }

}
