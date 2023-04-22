package cn.chatbot.api.domain.zsxq.model.aggregates;

import cn.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * 未回答问题的聚合信息
 */
public class UnAnsweredQuestionsAggregates {
    private boolean succeedeed;
    private RespData resp_data;

    public boolean isSucceedeed() {
        return succeedeed;
    }

    public void setSucceedeed(boolean succeedeed) {
        this.succeedeed = succeedeed;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }
}
