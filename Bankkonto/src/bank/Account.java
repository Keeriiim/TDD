package bank;

public class Account {
    public long initialCash;
    public long accountNr;

    public Account(long initialCash, long accountNr){
        if (initialCash < 0) {
            throw new IllegalArgumentException("Initial cash cannot be negative");
        }
        else if(accountNr < 0){
            throw new IllegalArgumentException("Account number cannot be negative");
        }
        this.initialCash = initialCash;
        this.accountNr = accountNr;
    }

    public void deposit(long cash){
        if(cash < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.initialCash += cash;
    }

    public void withdraw(long cash){
        if((initialCash - cash) < 0){
            throw new IllegalArgumentException("You don't have that amount to withdraw");
        }
        else if(cash < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        else initialCash= initialCash - cash;
    }

    public long getBalance(){
        return initialCash;
    }

    public long getAccountNr(){
        return accountNr;
    }


}
