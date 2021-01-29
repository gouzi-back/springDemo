package eduIoc.dao.impl;

import eduIoc.dao.UserDao;
import eduIoc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:12
 * @Description:com.dao.impl
 * @Version: 1.0
 */
@Repository("userDao")
public class UserDaoIMpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户资料");

    }
}
