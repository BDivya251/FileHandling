package com.app.process1;

public interface AccountService {
    boolean exists(String accountNumber);
    double getBalance(String accountNumber);
    boolean debit(String accountNumber, double amount);
    boolean credit(String accountNumber, double amount);
}
