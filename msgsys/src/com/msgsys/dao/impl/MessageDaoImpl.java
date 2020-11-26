package com.msgsys.dao.impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：czw
 * 日期: 2020/11/27 1:08
 * 描述:
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {

    public int insert(Message message) {
        String sql = "INSERT INTO T_msg (`fromUid`,`toUid`,`mTitle`,`mContent`,`readFlag`,`createTime`) VALUES (?,?,?,?,?,?)";
        return update(sql, message.getFromUid(), message.getToUid(), message.getMtitle(), message.getMcontent(), message.getReadFlag(), message.getCreatetime());
    }

    public int update(Message message) {
        String sql = "update T_msg set fromUid=?,toUid=?,mTitle=?,mContent=?,readFlag=?,createTime=? where id=?";
        return update(sql, message.getFromUid(), message.getToUid(), message.getMtitle(), message.getMcontent(), message.getReadFlag(), message.getCreatetime(), message.getId());
    }

    public int delete(Integer id) {
        String sql = "delete from T_msg where id=?";
        return update(sql, id);
    }

    public List<Message> queryAll() {
        String sql = "select *from T_msg";
        return queryForList(Message.class, sql);
    }

    public Message queryMessageById(Integer id) {
        String sql = "select *from T_msg where id= ?";
        return queryForOne(Message.class, sql, id);
    }

    public List<Message> queryMessageByToUid(Integer id) {
        String sql = "select *from T_msg where toUid= ?";
        return queryForList(Message.class, sql, id);
    }
}
