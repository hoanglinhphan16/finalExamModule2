package view;


import controller.payment_controller.Payment_controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)\n" +
                    "1. Thêm mới\n" +
                    "2. Xoá\n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        int choice1 = -1;
                        System.out.println("Chọn tài khoản muốn thêm mới\n" +
                                "1. Tài khoản tiết kiệm\n" +
                                "2. Tài khoản thanh toán\n");
                        try {
                            choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:

                                    break;
                                case 2:
                                    new Payment_controller().addNewPayment();
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:

                        break;
                    case 3:
//                        new BookingController().displayBookingFunc();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid selection.");
            }
        } while (true);
    }
}