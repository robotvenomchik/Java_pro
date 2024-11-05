package Homeworks.Homework18;

import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        repository.addUser(new User(1, "donaldTrump@gmail.com", "Donald", "Make America Greate Birtain Again"));
        repository.addUser(new User(2, "KamalaHarris@gmail.com", "Kamala", "WE fight - WE win"));

        // a
        int searchId = 1;
        Optional<User> userById = repository.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("User found by ID: " + user),
                () -> System.out.println("User with ID " + searchId + " not found.")
        );

        //b
        String searchEmail = "KamalaHarris@gmail.com";
        Optional<User> userByEmail = repository.findUserByEmail(searchEmail);
        userByEmail.ifPresentOrElse(
                user -> System.out.println("User found by Email: " + user),
                () -> System.out.println("User with Email " + searchEmail + " not found.")
        );

        // c
        Optional<List<User>> allUsers = repository.findAllUsers();
        allUsers.ifPresentOrElse(
                users -> {
                    System.out.println("Total users: " + users.size());
                    System.out.println("Users:");
                    users.forEach(user -> System.out.println(user));
                },
                () -> System.out.println("No users found.")
        );
        // additional
        String part="fight";
        Optional<List<User>> notes = repository.searchNoteByPartial(part);
        notes.ifPresentOrElse(
                notes1 -> {
                    System.out.println("Total users: " + notes1.size());
                    System.out.println("Users:");
                    notes1.forEach(note -> System.out.println(note));
                },
                () -> System.out.println("No users found.")
        );
    }
}
