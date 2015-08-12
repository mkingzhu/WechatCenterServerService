package com.mkingzhu.wechat.center.server.webservice.facade;

import javax.jws.WebService;

import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;

@WebService
public interface WechatTokenService {
    public String getAppId();

    public String getAccessToken() throws WxErrorException;

    public String getJsapiTicket() throws WxErrorException;

    public WxJsapiSignature createJsapiSignature(String url) throws WxErrorException;
}
