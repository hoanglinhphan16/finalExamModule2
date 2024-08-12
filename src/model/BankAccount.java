package model;

import java.time.LocalDate;

public abstract class BankAccount {
    private int id;
    private String codeAccount;
    private String bankName;
    private LocalDate startDate;

    public BankAccount() {}

    public BankAccount(int id, String codeAccount, String bankName, LocalDate startDate) {
        this.id = id;
        this.codeAccount = codeAccount;
        this.bankName = bankName;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", codeAccount='" + codeAccount + '\'' +
                ", bankName='" + bankName + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
