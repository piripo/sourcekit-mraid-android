Nexage SourceKit-MRAID For Android
==================================

Nexage SourceKit-MRAID For Android is an open sourced IAB MRAID 2.0 compliant rendering engine for HTML ad creatives.

For more information on IAB MRAID 2.0 compliance please visit http://www.iab.net/guidelines/508676/mobile_guidance/mraid

**Features:**

- MRAID 2 implementation
- Handles full/fragment HTML
- Custom browser

**Requirements:**

- Android 2.3+
- Eclipse ADT

Getting Started
===============

Step 1: Import the MRAID project into your Eclipse workspace.

Step 2: Include the MRAID library in your project under Project Properties -> Android -> Library.

Step 3: Add the following Activity into AndroidManifest.xml under the <application> tag.

	<activity
		android:name="org.nexage.sourcekit.mraid.MRAIDBrowser"
		android:configChanges="orientation|keyboard|keyboardHidden|screenSize"
		android:theme="@android:style/Theme.NoTitleBar.Fullscreen" />

Step 4: Add the following permissions to the AndroidManifest.xml under the <manifest> tag.

	<uses-permission android:name="android.permission.INTERNET"></uses-permission>
	<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"></uses-permission>
	<uses-permission android:name="android.permission.WRITE_CALENDAR" />
	<uses-permission android:name="android.permission.CALL_PHONE" />
	<uses-permission android:name="android.permission.SEND_SMS" />

Step 5: Use MRAID in your project.

For a Banner:

	RelativeLayout rootView = (RelativeLayout) findViewById(R.id.root_view);

	String[] supportedNativeFeatures = {
		MRAIDNativeFeature.CALENDAR,
		MRAIDNativeFeature.INLINE_VIDEO,
		MRAIDNativeFeature.SMS,
		MRAIDNativeFeature.STORE_PICTURE,
		MRAIDNativeFeature.TEL,
	};

	MRAIDView mraidView = new MRAIDView(this, baseUrl, content, supportedNativeFeatures, this, this);
	mraidView.setLayoutParams(params);

	rootView.addView(mraidView);

Implement MRAIDViewListener and MRAIDNativeFeatureListener in your activity to listen for MRAIDView callbacks and HTML creative events.

For an Interstitial:

	String[] supportedNativeFeatures = {
		MRAIDNativeFeature.CALENDAR,
		MRAIDNativeFeature.INLINE_VIDEO,
		MRAIDNativeFeature.SMS,
		MRAIDNativeFeature.STORE_PICTURE,
		MRAIDNativeFeature.TEL,
	};

	MRAIDInterstitial mraidInterstitial = new MRAIDInterstitial(this, baseUrl, content, supportedNativeFeatures, this, this);

Implement MRAIDInterstitialListener and MRAIDNativeFeatureListener in your activity to listen for MRAIDView callbacks and HTML creative events.

The MRAIDInterstitialListener 'mraidInterstitialLoaded' callback will signal that there is an ad ready to be shown:

	mraidInterstitial.show();

**Note:** You must provide the creative content as a string along with a baseUrl for both MRAIDView and MRAIDInterstitial. The creative may be either an HTML fragment or full HTML.

That's it!


LICENSE
=======

Copyright (c) 2014, Nexage, Inc.<br/>
All rights reserved.<br/>
Provided under BSD-3 license as follows:<br/>

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:

1.  Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

2.  Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.

3.  Neither the name of Nexage nor the names of its
    contributors may be used to endorse or promote products derived from
    this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
