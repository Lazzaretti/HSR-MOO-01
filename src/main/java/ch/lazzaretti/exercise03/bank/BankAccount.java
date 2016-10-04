package ch.lazzaretti.exercise03.bank;

import lombok.Getter;

/**
 * Created by Fabrizio on 04/10/2016.
 */
public class BankAccount {
    @Getter private long number;
    @Getter private long balance=0;

    public BankAccount(long number){
        this.number = number;
    }

    public boolean deposit(long value){
        if (value<=0){
            return false;
        }
        number += value;
        return true;
    }

    public boolean withdraw(long value){
        if (number<value){
            return false;
        }
        number -= value;
        return true;
    }
}
