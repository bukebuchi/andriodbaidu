package com.baidu.track.okhttp.builder;

import com.baidu.track.okhttp.OkHttpUtils;
import com.baidu.track.okhttp.request.OtherRequest;
import com.baidu.track.okhttp.request.RequestCall;


/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
