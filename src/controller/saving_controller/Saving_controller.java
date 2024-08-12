package controller.saving_controller;

import service.payment_service.IPayment_service;
import service.payment_service.Payment_service;
import service.saving_service.ISaving_service;
import service.saving_service.Saving_service;

public class Saving_controller {
    public static void main(String[] args) {
        ISaving_service saving_service = new Saving_service();
        System.out.println(saving_service.getAllSavings());;
    }
}
