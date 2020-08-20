package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author wyq
 * @create 2020-08-19-16:10
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }


}
