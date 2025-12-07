package com.example.test.pismo.utils;

import com.example.test.pismo.application.dto.request.AccountDTO;
import com.example.test.pismo.domain.entities.AccountEntity;

public class AccountFactory {
    public static AccountDTO createAccountDTO(String documentNumber) {
        return new AccountDTO(documentNumber);
    }

    public static AccountEntity create(Integer id, String documentNumber) {
        return new AccountEntity(id, documentNumber);
    }
}
