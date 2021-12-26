package by.overone.online_shop.dao.impl;

import by.overone.online_shop.dao.UserDAO;
import by.overone.online_shop.dao.mapper.UserRowMapper;
import by.overone.online_shop.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {

    private final static String GET_USERS_QUERY = "SELECT * FROM users";

    private final JdbcTemplate jdbcTemplate;


    @Override
    public List<User> getAllUsers() {
        List<User> users = jdbcTemplate.query(GET_USERS_QUERY, new UserRowMapper());
        return users;
    }
}
