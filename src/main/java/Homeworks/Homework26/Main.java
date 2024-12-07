package Homeworks.Homework26;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user = userManager.createUser("Budanov");

        userManager.printUserDetails(user);

        userManager.updateUserAddress(user, "Stepana Bendery Street", "Donetsk", "UKRAINE");
        userManager.printUserDetails(user);

        userManager.updateUserAddress(user, "Psa Patrona street", "Kyiv", "UKRAINE");
        userManager.printUserDetails(user);
    }
}
