package DataAccess.Concretes;

import DataAccess.abstracts.UserDao;
import Entity.concretes.User;

import java.util.List;

public class GoogleUserDao implements UserDao {
    List<User> users;

    @Override
    public void add(User user) {
        System.out.println("kullanıcı google hesabi ile giriş yaptı: "+ user.getFirstName());

    }

    @Override
    public void update(User user) {
        System.out.println("kullanıcı google hesabi ile güncelleme yaptı: "+ user.getFirstName());


    }

    @Override
    public void delete(User user) {
        System.out.println("kullanıcı google hesabi ile sildi: "+ user.getFirstName());


    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
