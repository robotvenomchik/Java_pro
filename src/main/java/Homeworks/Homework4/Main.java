package Homeworks.Homework4;

// Виправлений клас
public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() + ", phone " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        // Пропишіть значення для об'єкту Customer
        return new String[]{"pepa pig", "+0962341241421525351"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
