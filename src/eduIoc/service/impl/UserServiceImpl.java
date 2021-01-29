package eduIoc.service.impl;

import eduIoc.dao.UserDao;
import eduIoc.entity.User;
import eduIoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:17
 * @Description:com.service.impl
 * @Version: 1.0
 */
@Service("usService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")//通过@Resource进行装配
    private UserDao dao;
    //为dao赋值的有参构造方法
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    //无参构造
    public UserServiceImpl() {
    }

  /*  public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }*/

    @Override
    public void addNewUser(User user) {
        dao.save(user);
    }
}
