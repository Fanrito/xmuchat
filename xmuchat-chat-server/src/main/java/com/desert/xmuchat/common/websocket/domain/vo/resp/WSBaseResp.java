package com.desert.xmuchat.common.websocket.domain.vo.resp;

import lombok.Data;

@Data
public class WSBaseResp<T> {
    /**
     * ws推送给前端的消息
     *
     * @see com.desert.xmuchat.common.websocket.domain.enums.WSReqTypeEnum
     */
    private Integer type;
    private T data;
}
