package controller.payment_controller;

import model.PaymentAccount;
import service.payment_service.IPayment_service;
import service.payment_service.Payment_service;
import utils.FileHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Payment_controller {
    Scanner scanner = new Scanner(System.in);

    public void addNewPayment() {
        List listAllrecord = FileHandler.readAllRecords();

        System.out.println("Nhập vào mã tài khoản");
        String codeAccount = scanner.nextLine();
        System.out.println("Tên chủ tài khoản");
        String nameBank = scanner.nextLine();
        LocalDate date = LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
        System.out.println("Số thẻ");
        String accountNumber = scanner.nextLine();
        System.out.println("Số tiền trong tài khoản");
        int wallet = Integer.parseInt(scanner.nextLine());

        PaymentAccount paymentAccount = new PaymentAccount(listAllrecord.size(), codeAccount, nameBank, date, accountNumber, wallet);
        System.out.println(paymentAccount);
        new Payment_service().addPaymentAccount(paymentAccount);
    }
}
