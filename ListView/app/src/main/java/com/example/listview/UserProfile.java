package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        TextView user = (TextView)findViewById(R.id.textView);

        String name = getIntent().getStringExtra("UserName");

        Toast.makeText(this, "The name is " + name, Toast.LENGTH_SHORT).show();
        user.setText(name);

    }
}
