package service.saving_service;

import repository.saving_repo.ISaving_repo;
import repository.saving_repo.Saving_repo;

import java.util.List;

public class Saving_service implements ISaving_service{
    private static ISaving_repo saving_repo = new Saving_repo();

    @Override
    public List getAllSavings() {
        return saving_repo.getAllSavings();
    }
}
