package io.ionic.starter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginHandle;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;

import java.util.ArrayList;

import cap.twitter.plugin.TwitterPlugin;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializes the Bridge
        this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
            // Additional plugins you've installed go here
            // Ex: add(TotallyAwesomePlugin.class);
            //
            // add the plugin to capacitor
            add(TwitterPlugin.class);
        }});
    }




//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        // Pass the activity result to the auth client.
//        Log.d("DEBUG MAIN", String.valueOf(requestCode));
//
//        super.onActivityResult(requestCode, resultCode, data);
//
//
//
//
//
//        // authClient.onActivityResult(requestCode, resultCode, data);
//
//    }
}