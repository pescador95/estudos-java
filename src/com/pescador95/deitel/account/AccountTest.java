package com.pescador95.deitel.account;

import com.pescador95.deitel.account.dto.InputDTO;
import com.pescador95.deitel.account.entity.Account;
import com.pescador95.deitel.account.interfaces.payments.Payments;

public class AccountTest {

    public static void main(String[] args) {

        Account account, account2;

        Double depositAmount = 777.00;

        account = new Account("Pescador95", 1000.0);

        Payments.printAccount(account);

        account2 = createNewAccount();

        account2.deposit(depositAmount);

        Payments.printAccount(account2);

        }
        public static Account createNewAccount() {

            Account account = new Account();

            InputDTO inputDTO = account.insert();

            account = account.createAccount(inputDTO.getName(), inputDTO.getBalance());

            Payments.printAccount(account);

            return account;
        }
    }
