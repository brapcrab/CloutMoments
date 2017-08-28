package com.android.cloutmoments;
import com.braunster.androidchatsdk.firebaseplugin.firebase.BChatcatNetworkAdapter;
import com.braunster.chatsdk.Utils.helper.ChatSDKUiHelper;
import com.braunster.chatsdk.network.BDefines;
import com.braunster.chatsdk.network.BNetworkManager;
import com.braunster.chatsdk.activities.ChatSDKLoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Elijah on 8/25/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        // This is used for the app custom toast and activity transition
        ChatSDKUiHelper.initDefault();

        // Init the network manager
        BNetworkManager.init(getApplicationContext());

        // Create a new adapter
        BChatcatNetworkAdapter adapter = new BChatcatNetworkAdapter(getApplicationContext());

        // Set the adapter
        BNetworkManager.sharedManager().setNetworkAdapter(adapter);

        Intent myIntent = new Intent(this, ChatSDKLoginActivity.class);
        startActivity(myIntent);

    }

}
