package org.sid.BankAccountApp.mappers;

import org.sid.BankAccountApp.dto.BankAccountRequestDTO;
import org.sid.BankAccountApp.dto.BankAccountResponseDTO;
import org.sid.BankAccountApp.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
