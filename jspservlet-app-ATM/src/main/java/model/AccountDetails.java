package model;

public class AccountDetails {
    private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;

    // Generate appropriate getters and setters
    // Getter and setter methods for accountType
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Getter and setter methods for withdrawOrDepositAmount
    public double getWithdrawOrDepositAmount() {
        return withdrawOrDepositAmount;
    }
    public void setWithdrawOrDepositAmount(double withdrawOrDepositAmount) {
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
    }

    // Getter and setter methods for availableBalance
    public double getAvailableBalance() {
        return availableBalance;
    }
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    // Getter and setter methods for pin
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Generate the constructor
    public AccountDetails(String accountType, double availableBalance, int pin) {
        this.accountType = accountType;
        this.availableBalance = availableBalance;
        this.pin = pin;
    }
}
