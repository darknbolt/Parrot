package Controllers;

import Repositories.ClientRepo;
import Services.ClientGeneratorService;

public class DataController {
    private ClientGeneratorService generatorService;
    private ClientRepo clientRepo;

    public DataController(){
        this.generatorService = new ClientGeneratorService();
        this.clientRepo = new ClientRepo();
    }


    public void generateClient(){
        this.clientRepo.addClient(generatorService.generate(), "127.0.0.1");
    }
}
