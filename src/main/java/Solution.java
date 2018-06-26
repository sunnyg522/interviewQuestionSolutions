

import java.text.MessageFormat;
import java.util.*;

/**
 * @project q
 * @authore dgunda on 6/17/18
 */
class Solution {
//    public static class Account{
//        int units;
//        int currency;
//        String accountType;
//    }
//    public static class BankAccount{
//        int units;
//        int currency;
//        String accountType;
//        Account account;
//        public  BankAccount(String accountType, int currency){
//
//        }
//    }
//    public static class SavingsAccount extends Account{
//        public SavingsAccount(){
//
//        }
//    }
//    public static class CheckingAccount extends Account{
//
//    }
//    public static class BrokerageAccount extends Account{
//
//    }


    private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format(TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                })));
    }



    private static class SavingsAccount extends BankAccount {
        public SavingsAccount(String currency, int i) {
            super.setCurrency(currency);
            super.setUnits(i);
            super.setAccountType(new AccountType("SavingAccount"));
        }
    }

    private static class CheckingAccount extends BankAccount {
        public CheckingAccount(String currency, int i) {
            super.setCurrency(currency);
            super.setUnits(i);
            super.setAccountType(new AccountType("BankingAccount"));
        }
    }

    private static class BrokerageAccount extends BankAccount {
        public BrokerageAccount(String currency, int i) {
            super.setCurrency(currency);
            super.setUnits(i);
            super.setAccountType(new AccountType("BrokerageAccount"));
        }
    }

    private static class BankAccount {
        String currency;
        int units;
        AccountType accountType;

        public AccountType getAccountType() {
            return accountType;
        }

        public void setAccountType(AccountType accountType) {
            this.accountType = accountType;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getUnits() {
            return units;
        }

        public void setUnits(int units) {
            this.units = units;
        }
    }
    private static class AccountType{
        String name;

        public AccountType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
