package com.harrisonog.commute_time.utils;

import android.text.format.DateUtils;

/**
 * Created by harrisonoglesby on 7/11/17.
 */

public class DateTimeUtils {

    /**
     * Converts time between input time and current time to a relative time span string
     *
     * @param time epoch time in seconds. ie: 1394851823
     * @return relative time span compared with current time.  ie: 5 minutes ago
     */
    public static String formatRelativeTime(long time) {
        return DateUtils.getRelativeTimeSpanString(time * 1000, System.currentTimeMillis(), DateUtils.MINUTE_IN_MILLIS).toString();
    }
}
