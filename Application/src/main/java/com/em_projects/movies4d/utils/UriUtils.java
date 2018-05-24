package com.em_projects.movies4d.utils;

import android.net.Uri;


// Ref: https://stackoverflow.com/questions/17356312/converting-of-uri-to-string

public class UriUtils {

    public static String Uri2String(Uri uri) {
        if (null == uri) return null;
        return uri.toString();
    }

    public static Uri Str2Uri(String str) {
        if (true == StringUtils.isNullOrEmpty(str)) return null;
        return Uri.parse(str);
    }
}
