package com.aude.mvc.mvc;

import com.aude.mvc.error.WebErrorMessage;

/**
 * Created by IntelliJ IDEA.
 * User: audestick@gmail.com
 * Date: 2016/5/10 0010
 * To change this template use File | Settings | File Templates.
 */
public class ActionResult {
    private WebErrorMessage webErrorMessage;
    private Object resultData;
    private String resultType;

    public WebErrorMessage getWebErrorMessage() {
        return webErrorMessage;
    }

    public void setWebErrorMessage(WebErrorMessage webErrorMessage) {
        this.webErrorMessage = webErrorMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

}
