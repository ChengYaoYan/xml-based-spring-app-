package dev.llf.service.locator;

import dev.llf.account.service.AccountService;
import dev.llf.client.service.ClientService;

public class ServiceLocator {
    private int year;
    private String ultimateAnswer;
    private ClientService clientService;
    private AccountService accountService;

    public ServiceLocator(int year, String ultimateAnswer) {
        this.year = year;
        this.ultimateAnswer = ultimateAnswer;
        this.clientService =  new ClientService(year, ultimateAnswer);
        this.accountService =  new AccountService(clientService);
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }

    public int getYear() {
        return year;
    }

    public String getUltimateAnswer() {
        return ultimateAnswer;
    }
}
