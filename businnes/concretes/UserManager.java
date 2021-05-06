package businnes.concretes;

import DataAccess.abstracts.UserDao;
import Entity.concretes.User;
import businnes.abstracts.UserService;
import core.ConfirmLinkService;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    private ConfirmLinkService confirmLinkService;
    List<User> users;

    public UserManager(UserDao userDao,ConfirmLinkService confirmLinkService){
        this.confirmLinkService = confirmLinkService;
        this.userDao = userDao;
        this.users = userDao.getAll();
    }


    @Override
    public void register(User user) {
        if (user.getPassword().length() <= 6){
            System.out.println("şifre 6 karakterden küçük olamaz");
            return;
        }
        if (user.getFirstName().length() <= 2 || user.getLastName().length() <= 2){
            System.out.println("isim ve soyisim 2 karakterden küçük olamaz");
        }
        if (user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            System.out.println("email formu doğru değil");
        }
        this.userDao.add(user);
        this.confirmLinkService.confirmLİnk("kayıt gerçekleşti");

    }

    @Override
    public void login(User user) {
        for (User item: users){
            if (item.getEmail().length() <= 6 && item.getPassword().equals(user.getPassword())) {
                System.out.println("giriş yaptı: "+ user.getFirstName());


            }
        }

    }

    @Override
    public void logout(User user) {
        System.out.println("çıkış yaptı: "+ user.getFirstName());

    }

    @Override
    public List<User> getAll() {
        return this.userDao.getAll();
    }
}
