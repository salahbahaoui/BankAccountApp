package org.sid.BankAccountApp.service;

import org.sid.BankAccountApp.dto.BankAccountRequestDTO;
import org.sid.BankAccountApp.dto.BankAccountResponseDTO;
import org.sid.BankAccountApp.entities.BankAccount;
import org.sid.BankAccountApp.enums.AccountType;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
