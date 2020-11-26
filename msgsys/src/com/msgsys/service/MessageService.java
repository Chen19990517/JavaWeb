package com.msgsys.service;

import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：czw
 * 日期: 2020/11/27 1:23
 * 描述:
 */
public interface MessageService {

    List<Message> queryMessageByToUid(Integer id);

    Message queryMessageById(Integer id);
}
