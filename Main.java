import DataAccess.Concretes.GithubUserDao;
import Entity.concretes.User;
import businnes.abstracts.UserService;
import businnes.concretes.UserManager;
import core.ConfirmLinkService;
import core.EmailConfirmLinkService;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new GithubUserDao(), new EmailConfirmLinkService());
        User user = new User();
        user.setFirstName("taha");
        user.setLastName("öksüz");
        user.setEmail("taha@hotmail.com");
        user.setPassword("1234567");
        userService.register(user);

        userService.login(user);


        userService.logout(user);

    }
}
