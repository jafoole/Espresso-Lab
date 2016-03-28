package com.example.jafoole.espressolab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileDetailsActivity extends AppCompatActivity {

    TextView mUserProfileName;
    TextView mEmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        mUserProfileName = (TextView) findViewById(R.id.userProfileName);
        mEmailAddress = (TextView) findViewById(R.id.emailAddress);

        String displayName = getIntent().getStringExtra("DISPLAYNAME");

        mUserProfileName.setText(displayName);
        mEmailAddress.setText(displayName + "@gmail.com");
    }
}
