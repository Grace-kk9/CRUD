import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User getUser(String username) {
        Optional<User> user = users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
        return user.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User updateUser(String username, User user) {
        User existingUser = getUser(username);
        if (existingUser != null) {
            existingUser.setPassword(user.getPassword());
            existingUser.setActive(user.isActive());
            return existingUser;
        }
        return null;
    }

    @Override
    public boolean deleteUser(String username) {
        return users.removeIf(u -> u.getUsername().equals(username));
    }
}
