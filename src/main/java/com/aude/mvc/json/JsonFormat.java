package com.aude.mvc.json;

/**
 * Created by IntelliJ IDEA.
 * User: audestick@gmail.com
 * Date: 2016/11/17 0017
 * To change this template use File | Settings | File Templates.
 */
public class JsonFormat {

    private boolean ignoreNull = false;

    private String locked;


    private String DateFormat;


    public String getLocked() {
        return locked == null ? "" : locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getDateFormat() {
        return DateFormat;
    }

    public void setDateFormat(String dateFormat) {
        DateFormat = dateFormat;
    }

    public boolean isIgnoreNull() {

        return ignoreNull;
    }

    public void setIgnoreNull(boolean ignoreNull) {
        this.ignoreNull = ignoreNull;
    }
}
