package cn.chatbot.api.domain.zsxq;

import java.io.IOException;

/**
 * 知识星球的API接口
 */
public interface IZsxqApi {
    Object queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId,String cookie,String topicId,String text,boolean silenced) throws IOException;
}
