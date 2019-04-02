package com.example.listview;

import android.content.Intent;

import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    //String users[] = {"John","Jane","Sam","Alex","Peter","Robert"};



    ArrayList<String> users = new ArrayList<String>(Arrays.asList("John"));




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateList();

    }



    public void addUser(View v){

        EditText newUser = (EditText)findViewById(R.id.editText);

       // users.add(newUser.getText().toString());

        DBHelper dbH = new DBHelper(this);

        boolean result = dbH.addUser(newUser.getText().toString());

        updateList();
    }

    public void updateList(){



        ListView lv = (ListView)findViewById(R.id.UsersListView);
        ArrayList<String> userDataFromDB = new ArrayList<>();

        DBHelper dbH = new DBHelper(this);

        Cursor data = dbH.getData();

        while(data.moveToNext()){

            userDataFromDB.add(data.getString(1));

        }






        ArrayAdapter<String> userData = new ArrayAdapter<String>(this, R.layout.activity_users_list, R.id.userName,userDataFromDB);

        lv.setAdapter(userData);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, users.get(position), Toast.LENGTH_SHORT).show();

               // users.remove(position);
                Intent profile = new Intent(MainActivity.this, UserProfile.class);
                 profile.putExtra("UserName",users.get(position));

                startActivity(profile);


            }
        });
    }





}
