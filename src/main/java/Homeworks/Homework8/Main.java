package Homeworks.Homework8;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {
        balance = getBalance(); // Ініціалізуємо баланс
        validateAmount(balance, getAmount());
    }

    // Метод для отримання початкового балансу
    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    // Метод для отримання суми покупки від користувача
    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getNewBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balance);
        }
    }

    // Метод розрахунку нового балансу після покупки
    private static double getNewBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}