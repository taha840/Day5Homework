package businnes.abstracts;

import Entity.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user);
    void login(User user);
    void logout(User user);
    List<User> getAll();
}
