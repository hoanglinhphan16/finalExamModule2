package repository.payment_repo;

import model.PaymentAccount;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class Payment_repo implements IPayment_repo{
    private static List<PaymentAccount> payment_accounts = new ArrayList<>();

    static {
        payment_accounts = FileHandler.readFile(new PaymentAccount());
    }

    @Override
    public List getAllPayments() {
        return payment_accounts;
    }

    @Override
    public void addPaymentAccount(PaymentAccount paymentAccount) {
        payment_accounts.add(paymentAccount);
        FileHandler.writeFile(new PaymentAccount(), true);
    }
}
