package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;

import java.util.List;

/**
 * 作者：czw
 * 日期: 2020/11/26 20:17
 * 描述:
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    public int insert(User user) {
        String sql = "INSERT INTO T_user (`username`, `password`, `email`)values(?, ?, ?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    public int update(User user) {
        String sql = "update T_user set username=?,password=?,email=? where id=?";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getId());
    }

    public int delete(Integer id) {
        String sql = "DELETE FROM 'T_user' WHERE 'id' = ?";
        return update(sql,id);
    }

    public List<User> queryAll() {
        String sql = "SELECT * FROM 'T_user'";
        return queryForList(User.class,sql);
    }

    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM 'T_user' WHERE 'id'=?";
        return queryForOne(User.class,sql,id);
    }

    public User queryUserByNameAndPassword(User user) {
        String sql = "SELECT * FROM T_user WHERE  username  = ? AND  password  = ? ";
        return queryForOne(User.class,sql,user.getUsername(),user.getPassword());
    }
}
