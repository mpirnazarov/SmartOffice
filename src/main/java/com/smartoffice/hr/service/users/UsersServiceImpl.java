package com.smartoffice.hr.service.users;

import com.smartoffice.hr.mappers.UsersMapper;
import com.smartoffice.hr.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Muslimbek on 5/5/2017.
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersMapper usersMapper;

    @Transactional
    public void insertUser(Users user) {
        usersMapper.insertUser(user);
    }

    @Override
    public Users getUserByUsername(String username) {
        return usersMapper.getUserByUsername(username);
    }

    @Override
    public Users getUserById(int id) {
        return usersMapper.getUserById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }
}
