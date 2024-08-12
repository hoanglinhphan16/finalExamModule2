package repository.saving_repo;

import model.SavingAccount;
import utils.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class Saving_repo implements ISaving_repo {
    private static List<SavingAccount> savingAccounts = new ArrayList<>();

    static {
        savingAccounts = FileHandler.readFile(new SavingAccount());
    }

    @Override
    public List getAllSavings() {
        return savingAccounts;
    }
}
