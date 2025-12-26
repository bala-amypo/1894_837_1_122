public interface UserService {

    User register(User user);

    String login(User user);

    List<User> getAllUsers();

    User findByEmail(String email);

    User findById(Long id);
}
