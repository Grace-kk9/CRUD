public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Create Users
        userService.createUser(new User("john_doe", "password123", true));
        userService.createUser(new User("jane_doe", "password456", true));

        // Get User
        System.out.println("Get User: " + userService.getUser("john_doe"));

        // Get All Users
        System.out.println("All Users: " + userService.getAllUsers());

        // Update User
        userService.updateUser("john_doe", new User("john_doe", "newpassword", false));
        System.out.println("Updated User: " + userService.getUser("john_doe"));

        // Delete User
        userService.deleteUser("jane_doe");
        System.out.println("All Users after deletion: " + userService.getAllUsers());
    }
}
