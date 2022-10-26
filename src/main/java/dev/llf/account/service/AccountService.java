package dev.llf.account.service;

import dev.llf.client.service.ClientService;

public class AccountService {
    private final ClientService clientService;

    public AccountService(ClientService clientService) {
        this.clientService = clientService;
    }
}
