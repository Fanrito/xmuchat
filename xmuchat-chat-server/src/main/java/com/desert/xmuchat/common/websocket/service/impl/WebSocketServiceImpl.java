package com.desert.xmuchat.common.websocket.service.impl;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;

import com.desert.xmuchat.common.websocket.domain.dto.WSChannelExtraDTO;
import com.desert.xmuchat.common.websocket.domain.vo.req.WSAuthorize;
import com.desert.xmuchat.common.websocket.domain.vo.resp.WSBaseResp;
import com.desert.xmuchat.common.websocket.service.WebSocketService;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class WebSocketServiceImpl implements WebSocketService {
    @Override
    public void handleLoginReq(Channel channel) {

    }

    @Override
    public void connect(Channel channel) {

    }

    @Override
    public void removed(Channel channel) {

    }

    @Override
    public void authorize(Channel channel, WSAuthorize wsAuthorize) {

    }

    @Override
    public Boolean scanLoginSuccess(Integer loginCode, Long uid) {
        return null;
    }

    @Override
    public Boolean scanSuccess(Integer loginCode) {
        return null;
    }

    @Override
    public void sendToAllOnline(WSBaseResp<?> wsBaseResp, Long skipUid) {

    }

    @Override
    public void sendToAllOnline(WSBaseResp<?> wsBaseResp) {

    }

    @Override
    public void sendToUid(WSBaseResp<?> wsBaseResp, Long uid) {

    }
}
