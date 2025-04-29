package Repositories;

import Components.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientRepo {
    public Map<Client, String> repo = new HashMap<>();
    public void addClient(Client client, String ip){
        repo.put(client, ip);
    }
}
