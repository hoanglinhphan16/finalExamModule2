package utils;

import model.PaymentAccount;
import model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String PATH = "E:\\Codegym\\module2\\examModule2\\src\\data\\bank_accounts.csv";

    public static <E> List readFile(E e) {
        List listPayment = new ArrayList<E>();
        List listSaving = new ArrayList<E>();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    PaymentAccount paymentAccount = PaymentAccount.fromCSVRow(line);
                    listPayment.add(paymentAccount);
                } else {
                    SavingAccount savingAccount = SavingAccount.fromCSVRow(line);
                    listSaving.add(savingAccount);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return (e instanceof SavingAccount) ? listSaving : listPayment;
    }

    public static List readAllRecords() {
        List list = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static <E> void writeFile(E e, boolean writeMode) {
        System.out.println(e);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, writeMode))) {
            if (e instanceof PaymentAccount) {
                bw.newLine();
                bw.write(((PaymentAccount) e).toCSVRow());
            } else if (e instanceof SavingAccount) {
                bw.newLine();
                bw.write(((SavingAccount) e).toCSVRow());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static <E> void writeListToFile(List<E> elements, String path, boolean writeMode) {
        if (elements.isEmpty()) {
            System.out.println("List is empty. Nothing to write.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, writeMode))) {
            // Write data
            for (E element : elements) {
                if (element instanceof PaymentAccount) {
                    bw.write(((PaymentAccount) element).toCSVRow());
                    bw.newLine();
                } else if (element instanceof SavingAccount) {
                    bw.write(((SavingAccount) element).toCSVRow());
                    bw.newLine();
                }
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
