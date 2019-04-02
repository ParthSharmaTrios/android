package com.example.audioproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void playBtn(View v){

        int rId = v.getId();

        String actual_Id = v.getResources().getResourceEntryName(rId);

        int mediaId = getResources().getIdentifier(actual_Id,"raw","com.example.audioproject");

     //   Toast.makeText(this, "You clicked "+ actual_Id, Toast.LENGTH_SHORT).show();


      MediaPlayer mp = MediaPlayer.create(this,mediaId);

      mp.start();
    }
}
