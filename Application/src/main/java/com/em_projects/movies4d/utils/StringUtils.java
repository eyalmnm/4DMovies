package com.em_projects.movies4d.utils;

public class StringUtils {

    /**
     * Check whether the given string is null or empty
     *
     * @param str the string to be checked
     * @return true if the given string in null or empty
     */
    public static boolean isNullOrEmpty(String str) {
        if (str == null)
            return true;
        str = str.replaceAll("\\?", "").replaceAll("<", "").replaceAll(">", "")
                .replaceAll("&", "").replaceAll("\"", "").replaceAll("\'", "")
                .replaceAll(";", "").replaceAll("\n", "").replaceAll("\r", "")
                .replaceAll("\t", "").trim();
        if (str.trim().length() == 0)
            return true;
        return false;
    }
}
