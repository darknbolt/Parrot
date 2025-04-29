package Services;

import Components.Client;
import Views.ClientDialog;

public class ClientGeneratorService {
    public Client generate(){
        return new Client(new ClientDialog().getNickname());
    }
}