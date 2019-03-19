package edu.shu.service.impl;

import edu.shu.mapper.UserMapper;
import edu.shu.entity.User;
import edu.shu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUser(User user) {
        return userMapper.selUser(user.getsID(), user.getsPass());
    }
}
