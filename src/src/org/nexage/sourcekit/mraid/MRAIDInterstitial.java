package org.nexage.sourcekit.mraid;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint("ViewConstructor")
public class MRAIDInterstitial extends MRAIDView {
	
	private final static String TAG = "MRAIDInterstitial";
	
	public MRAIDInterstitial(
        Context context,
        String baseUrl,
        String data,
        String[] supportedNativeFeatures,
		MRAIDViewListener viewListener,
        MRAIDNativeFeatureListener nativeFeatureListener
    ) {
		super(context, baseUrl, data, supportedNativeFeatures, viewListener, nativeFeatureListener, true);
	}
	
	public void show() {
		this.showAsInterstitial();
	}
}
