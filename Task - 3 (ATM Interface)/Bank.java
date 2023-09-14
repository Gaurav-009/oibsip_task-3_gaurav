import java.util.ArrayList;

public class Bank {

    private ArrayList<User> users;
    private User currentUser;

    public Bank() {
        this.users = new ArrayList<>();
        this.currentUser = null;
        // add some initial test users
        users.add(new User("ME1001", "1111", "Elon", "Musk", 10000.0));
        users.add(new User("GB1002", "2222", "Bill", "Gates", 15000.0));
        users.add(new User("TR1003", "3333", "Ratan", "Tata", 17000.0));
    }

    public boolean authenticateUser(String userID, String userPIN) {
        for (User user : users) {
            if (user.getUserID().equals(userID) && user.authenticate(userPIN)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User getUserByID(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }
}