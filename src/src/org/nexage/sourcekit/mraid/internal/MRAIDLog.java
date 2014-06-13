package org.nexage.sourcekit.mraid.internal;

import android.util.Log;

public class MRAIDLog {
	private static final String TAG = "MRAID";

	public static void d(String msg) {
		Log.d(TAG, msg);
	}

	public static void e(String msg) {
		Log.e(TAG, msg);
	}

	public static void i(String msg) {
		Log.i(TAG, msg);
	}

	public static void v(String msg) {
		Log.v(TAG, msg);
	}

	public static void w(String msg) {
		Log.w(TAG, msg);
	}

	public static void d(String subTag, String msg) {
		msg = "[" + subTag + "] " + msg;
		Log.d(TAG, msg);
	}

	public static void e(String subTag, String msg) {
		msg = "[" + subTag + "] " + msg;
		Log.e(TAG, msg);
	}

	public static void i(String subTag, String msg) {
		msg = "[" + subTag + "] " + msg;
		Log.i(TAG, msg);
	}

	public static void v(String subTag, String msg) {
		msg = "[" + subTag + "] " + msg;
		Log.v(TAG, msg);
	}

	public static void w(String subTag, String msg) {
		msg = "[" + subTag + "] " + msg;
		Log.w(TAG, msg);
	}

}
