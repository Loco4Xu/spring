package com.develop.service.serviceImpl;

import com.develop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p class="detail">
 * 功能：
 * </p>
 *
 * @author Loco
 * @date 2017/1/9
 * @return
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserMapper userMapper;

    @Override
    public String hao() {
//        userMapper.selectByPrimaryKey(1);
        return "hao";
    }
}
