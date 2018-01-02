package lib.smdeveloper.errorutil;

import android.util.Log;

/**
 * Created by sathish kumar on 02-01-2018.
 */

public class ErrorDebug {
    private static final String TAG = "SUPER_AWESOME_APP";
    public static void e(String message)
    {
        Log.e(TAG, message);
    }
}
