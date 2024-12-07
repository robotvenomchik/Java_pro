package Homeworks.Homework26;

class UserManager {
    public User createUser(String name) {
        return new User(name);
    }

    public void updateUserAddress(User user, String street, String city, String country) {
        if (user.hasAddress()) {
            user.getAddress().setStreet(street);
            user.getAddress().setCity(city);
            user.getAddress().setCountry(country);
        } else {
            user.setAddress(new Address(street, city, country));
        }
    }

    public void printUserDetails(User user) {
        System.out.println(user);
    }
}
