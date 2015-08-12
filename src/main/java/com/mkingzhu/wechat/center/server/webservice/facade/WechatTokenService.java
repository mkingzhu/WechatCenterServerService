package com.mkingzhu.wechat.center.server.webservice.facade;

public interface WechatTokenService {
    public String getAccessToken();

    public String getJsapiTicket();
}
