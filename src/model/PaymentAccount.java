package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PaymentAccount extends BankAccount {
    private String accountNumber;
    private int wallet;

    public PaymentAccount() {
    }

    public PaymentAccount(String accountNumber,int wallet) {
        this.wallet = wallet;
        this.accountNumber = accountNumber;
    }

    public PaymentAccount(int id, String codeAccount, String bankName, LocalDate startDate, String accountNumber, int wallet) {
        super(id, codeAccount, bankName, startDate);
        this.accountNumber = accountNumber;
        this.wallet = wallet;
    }

    public static PaymentAccount fromCSVRow(String csvRow) {
        String[] data = csvRow.split(",");
        int id = Integer.parseInt(data[0]);
        String codeAccount = data[1];
        String bankName = data[2];
        LocalDate startDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String accountNumber = data[4];
        int wallet = Integer.parseInt(data[5]);

        return new PaymentAccount(id, codeAccount, bankName, startDate, accountNumber, wallet);
    }

    public String toCSVRow() {
        return super.getId() + "," + super.getCodeAccount() + "," + super.getBankName() + "," + super.getStartDate() + "," + accountNumber + "," + wallet;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
