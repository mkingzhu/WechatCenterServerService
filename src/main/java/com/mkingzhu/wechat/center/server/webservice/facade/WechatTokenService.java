package com.mkingzhu.wechat.center.server.webservice.facade;

import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;

public interface WechatTokenService {
    public String getAccessToken() throws WxErrorException;

    public String getJsapiTicket() throws WxErrorException;

    public WxJsapiSignature createJsapiSignature(String url) throws WxErrorException;
}
