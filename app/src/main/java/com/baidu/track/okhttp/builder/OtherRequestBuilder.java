package com.baidu.track.okhttp.builder;

import com.baidu.track.okhttp.request.OtherRequest;
import com.baidu.track.okhttp.request.RequestCall;

import okhttp3.RequestBody;

/**
 * DELETE、PUT、PATCH等其他方法
 */
public class OtherRequestBuilder extends OkHttpRequestBuilder<OtherRequestBuilder>
{
    private RequestBody requestBody;
    private String method;
    private String content;

    public OtherRequestBuilder(String method)
    {
        this.method = method;
    }

    @Override
    public RequestCall build()
    {
        return new OtherRequest(requestBody, content, method, url, android.R.attr.tag, params, headers, android.R.attr.id).build();
    }

    public OtherRequestBuilder requestBody(RequestBody requestBody)
    {
        this.requestBody = requestBody;
        return this;
    }

    public OtherRequestBuilder requestBody(String content)
    {
        this.content = content;
        return this;
    }


}
