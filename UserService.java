import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUser(String username);
    List<User> getAllUsers();
    User updateUser(String username, User user);
    boolean deleteUser(String username);
}
