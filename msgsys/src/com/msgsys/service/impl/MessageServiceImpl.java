package com.msgsys.service.impl;

import com.msgsys.dao.MessageDao;
import com.msgsys.dao.impl.MessageDaoImpl;
import com.msgsys.entity.Message;
import com.msgsys.service.MessageService;

import java.util.List;

/**
 * 作者：czw
 * 日期: 2020/11/27 1:28
 * 描述:
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessageDaoImpl();

    public List<Message> queryMessageByToUid(Integer id) {
        return messageDao.queryMessageByToUid(id);
    }

    public Message queryMessageById(Integer id) {
        return messageDao.queryMessageById(id);
    }
}
