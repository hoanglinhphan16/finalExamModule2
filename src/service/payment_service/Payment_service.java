package service.payment_service;

import model.PaymentAccount;
import repository.payment_repo.IPayment_repo;
import repository.payment_repo.Payment_repo;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class Payment_service implements IPayment_service{
    private static IPayment_repo payment_repo = new Payment_repo();

    @Override
    public List<PaymentAccount> getPaymentAccounts() {
        return payment_repo.getAllPayments();
    }

    @Override
    public void addPaymentAccount(PaymentAccount paymentAccount) {
        payment_repo.addPaymentAccount(paymentAccount);
    }
}
