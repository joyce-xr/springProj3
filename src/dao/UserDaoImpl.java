package dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void delete() {
        System.out.println("这里调用UserDaoImpl的 delete方法");
    }
}
