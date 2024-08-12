package repository.payment_repo;

import model.PaymentAccount;

import java.util.List;

public interface IPayment_repo {
    List getAllPayments();
    void addPaymentAccount(PaymentAccount paymentAccount);
}
