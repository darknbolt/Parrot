package Services;

import Components.Client;
import Views.UsernamePanel;

public class ClientGeneratorService {
    public Client generate(){
        return new Client(new UsernamePanel().getNickname());
    }
}