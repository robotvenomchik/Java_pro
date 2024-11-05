package Homeworks.Homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public Optional<User> findUserById(int id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return userList.isEmpty() ? Optional.empty() : Optional.of(new ArrayList<>(userList));
    }
    public Optional<List<User>> searchNoteByPartial(String query) {
        List<User> result = userList.stream()
                .filter(user -> user.getNote() != null && user.getNote().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());

        return result.isEmpty() ? Optional.empty() : Optional.of(result);
    }


}