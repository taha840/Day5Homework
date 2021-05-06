package DataAccess.Concretes;

import DataAccess.abstracts.UserDao;
import Entity.concretes.User;

import java.util.List;

public class StandartUserDao implements UserDao {
    List<User> users;

    @Override
    public void add(User user) {
        System.out.println("kullanıcı standart bir şekilde giriş yaptı: "+ user.getFirstName());


    }

    @Override
    public void update(User user) {
        System.out.println("kullanıcı standart bir şekilde ile güncelleme yaptı: "+ user.getFirstName());


    }

    @Override
    public void delete(User user) {
        System.out.println("kullanıcı standart bir şekilde sildi: "+ user.getFirstName());


    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
