# XMU-chat聊天室开发日志

## 项目搭建和多环境配置

### 模块

采用maven多模块架构，主要业务在xmuchat-chat-server模块，xmu-framework模块下的若干模块提供全局所需的starter、工具类等等

多环境配置分为test环境和prod环境，目前采用test环境进行开发，中间件已经部署完毕，但代码还待开发

## WebSocket模块
本项目使用netty实现websocket
websocket的作用是实现服务端主动向客户端推送消息，这对于单聊和群聊功能来说非常重要。当一个新消息产生时，服务端必须主动向客户端发消息，客户端才能收到新消息。如果服务端不主动发的话，客户端只能使用轮询的方式，但是由于用户并不是24小时都在聊天的，不如说大部分时间都不在聊天，一直轮询非常浪费资源，因此只能采用主动推送。

websocket基于连接的应用层通信协议，是对http的升级，可以很好的实现服务端向客户端推送消息，是本项目的基础和核心。

实现细节：

1. 所有编解码器需要用到HttpServerCodec。
2. WebSocketServerProtocolHandler是netty进行websocket升级的处理器。在这期间会抹除http相关的信息，比如请求头啥的。如果想获取相关信息，需要在这之前获取。
3. HttpHeadersHandler是我们自己的处理器。赶在websocket升级之前，获取用户的ip地址，然后保存到channel的附件里。
4. NettyWebSocketServerHandler是我们的业务处理器，里面处理客户端的事件。
5. IdleStateHandler实现心跳检测。
## 用户模块

## 联系人模块

## 消息模块

## 会话模块

