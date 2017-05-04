package com.example.administrator.testapplication;

/**
 * Created by Administrator on 2017/5/4.
 */

public class Tools {
    public static boolean isNotEmpty(String str){
        return  (str==null||"".equals(str)||"null".equals(str))?true:false;
    }
}
