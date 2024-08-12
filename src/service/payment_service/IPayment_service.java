package service.payment_service;

import model.PaymentAccount;

import java.util.List;

public interface IPayment_service {
    List<PaymentAccount> getPaymentAccounts();
    void addPaymentAccount(PaymentAccount paymentAccount);
}
