package com.smartoffice.hr.service.users;

import com.smartoffice.hr.model.Users;
import java.util.List;

/**
 * Created by Muslimbek on 5/5/2017.
 */
public interface UsersService {
    void insertUser(Users user);
    Users getUserByUsername(String username);
    Users getUserById(int id);
    List<Users> getAllUsers();
}
