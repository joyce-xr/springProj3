package service;

import dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    //UserDao userDao = new UserDaoImpl();
    @Resource(name="userDao")
    public UserDao userDao;

    @Override
    public void delete() {
        userDao.delete();
    }
}
