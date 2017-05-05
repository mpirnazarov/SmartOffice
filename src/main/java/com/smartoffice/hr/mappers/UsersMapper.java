package com.smartoffice.hr.mappers;

import com.smartoffice.hr.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Muslimbek on 5/5/2017.
 */
public interface UsersMapper {

    @Insert("INSERT INTO hr.users(username, phone_mobile, phone_home, email_company, email_personal, " +
            "date_of_birth, status_id, password_hash, hiring_date, chief_id, political, passport, " +
            "enabled, role_id, first_name, last_name, fathers_name, address, birth_place) VALUES" +
            "(#{username}, #{phoneMobile}, #{phoneHome}, #{emailCompany}, #{emailPersonal}, " +
            "#{dateOfBirth}, #{statusId}, #{passwordHash}, #{hiringDate}, #{chiefId}, #{political}, " +
            "#{passport}, #{enabled}, #{roleId}, #{firstName}, #{lastName}, #{fathersName}, #{address}, #{birthPlace})")
    @Options(useGeneratedKeys = true, keyProperty = "id", flushCache = true, keyColumn = "id")
    public void insertUser(Users user);

    @Select("SELECT * FROM hr.users WHERE username = #{username}")
    public Users getUserByUsername(String username);

    @Select("SELECT * FROM hr.users WHERE id = #{id}")
    public Users getUserById(int id);

    @Select("SELECT * FROM hr.users")
    public List<Users> getAllUsers();

}
