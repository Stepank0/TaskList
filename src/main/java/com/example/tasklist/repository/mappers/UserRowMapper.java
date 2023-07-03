package com.example.tasklist.repository.mappers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRowMapper {

    @SneakyThrows
    public static User mapRow(ResultSet resultSet){
        Set<Role> roles = new HashSet<>();
        while (resultSet.next()){
            roles.add(Role.valueOf(resultSet.getString("user_role_role")));
        }
        resultSet.beforeFirst();
        List<Task> tasks = TaskRowMapper.mapRows(resultSet);
        if (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getLong("user_id"));
            user.setName(resultSet.getString("user_name"));
            user.setName(resultSet.getString("user_username"));
            user.setName(resultSet.getString("user_password"));
            user.setRoles(roles);
            user.setTacks(tasks);
            return user;
        } else {
            return null;
        }
    }
}
