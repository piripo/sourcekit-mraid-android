Nexage Integration SourceKit for MRAID
======================================

Nexage Integration SourceKit for MRAID is an easy to use library which implements the IAB MRAID 2.0 spec (http://www.iab.net/guidelines/508676/mobile_guidance/mraid). It is 
written for Android and works in both phone and tablet applications.

**Features:**

- MRAID 2 implementation
- Handles full/fragment HTML
- 4 level logging
- Integrates with just a few lines of code

**Requirements:**

- Android 2.3+
- Eclipse ADT

Getting Started
===============

Step 1: Include MRAID project.

Step 2: Include MRAID Library under Project Properties -> Android section

Step 3: Import these header file(s) into your project:

	import org.nexage.sourcekit.mraid.MRAIDNativeFeature;
	import org.nexage.sourcekit.mraid.MRAIDNativeFeatureListener;
	import org.nexage.sourcekit.mraid.MRAIDView;
	import org.nexage.sourcekit.mraid.MRAIDViewListener;

Step 4: Add the following Activity into AndroidManifest.xml:

	<activity
        android:name="org.nexage.sourcekit.vast.player.MRAIDPlayer"
        android:label="@string/app_name" >        
    </activity>
    
Step 5: Add the following permissions:

	<uses-permission android:name="android.permission.INTERNET"></uses-permission>
	<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"></uses-permission>
	
Step 6: Create an MRAIDView and add it to your container view, as in this example:

For a Banner:

     MRAIDView mraidView = new MRAIDView(getApplicationContext(), baseUrl, content, 
     		{MRAIDNativeFeature.CALENDAR, 
            MRAIDNativeFeature.INLINE_VIDEO, 
            MRAIDNativeFeature.SMS, 
            MRAIDNativeFeature.STORE_PICTURE, 
            MRAIDNativeFeature.TEL}, this, this);

**Note:** You must provide the creative content as a string along with a baseUrl.  The creative may be either an HTML fragment or full HTML. Implement MRAIDViewListener, MRAIDNativeFeatureListener to listen for important notifications.

For an Interstitial:
	
	interstitial = new MRAIDInterstitial(getApplicationContext(), baseUrl, content, 
     		{MRAIDNativeFeature.CALENDAR, 
     		MRAIDNativeFeature.INLINE_VIDEO, 
	        MRAIDNativeFeature.SMS, 
	        MRAIDNativeFeature.STORE_PICTURE, 
	        MRAIDNativeFeature.TEL}, this, this);

**Note:** You must provide the creative content as a string along with a baseUrl.  The creative may be either an HTML fragment or full HTML. Implement MRAIDInterstitialListener, MRAIDNativeFeatureListener to listen for important notifications.

Wait for the MRAIDInterstitialListener 'mraidInterstitialLoaded' callback and do the following when the Ad is ready to be shown on screen:

	interstitial.show();

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
