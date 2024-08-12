package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SavingAccount extends BankAccount{
    private int savingMoney;
    private LocalDate spentDate;
    private int interest;
    private int profitTerm;

    public SavingAccount() {}

    public SavingAccount(int savingMoney, LocalDate spentDate, int interest, int profitTerm) {
        this.savingMoney = savingMoney;
        this.spentDate = spentDate;
        this.interest = interest;
        this.profitTerm = profitTerm;
    }

    public SavingAccount(int id, String codeAccount, String bankName, LocalDate startDate, int savingMoney, LocalDate spentDate, int interest, int profitTerm) {
        super(id, codeAccount, bankName, startDate);
        this.savingMoney = savingMoney;
        this.spentDate = spentDate;
        this.interest = interest;
        this.profitTerm = profitTerm;
    }

    public int getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(int savingMoney) {
        this.savingMoney = savingMoney;
    }

    public LocalDate getSpentDate() {
        return spentDate;
    }

    public void setSpentDate(LocalDate spentDate) {
        this.spentDate = spentDate;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getProfitTerm() {
        return profitTerm;
    }

    public void setProfitTerm(int profitTerm) {
        this.profitTerm = profitTerm;
    }

    public static SavingAccount fromCSVRow(String csvRow) {
        String[] data = csvRow.split(",");
        int id = Integer.parseInt(data[0]);
        String codeAccount = data[1];
        String bankName = data[2];
        LocalDate startDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int savingMoney = Integer.parseInt(data[4]);
        LocalDate spentDate = LocalDate.parse(data[5], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int interest = Integer.parseInt(data[6]);
        int profitTerm = Integer.parseInt(data[7]);

        return new SavingAccount(id, codeAccount, bankName, startDate, savingMoney, spentDate, interest, profitTerm);
    }

    public String toCSVRow() {
        System.out.println(super.getId() + "," + super.getCodeAccount() + "," + super.getBankName() + "," + super.getStartDate() + "," + savingMoney + "," + spentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "," + interest + "," + profitTerm);
        return super.getId() + "," + super.getCodeAccount() + "," + super.getBankName() + "," + super.getStartDate() + "," + savingMoney + "," + spentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "," + interest + "," + profitTerm;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "savingMoney=" + savingMoney +
                ", spentDate=" + spentDate +
                ", interest=" + interest +
                ", profitTerm=" + profitTerm +
                '}';
    }
}
