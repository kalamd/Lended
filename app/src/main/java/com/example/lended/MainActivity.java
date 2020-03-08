package com.example.lended;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class MainActivity extends AppCompatActivity {


    private EditText UsernameIn;
    private EditText Password;
    private TextView LoginDirections;
    private Button LoginButton;
    private ImageView HomeImage;
    private TextView WelcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameIn = (EditText)findViewById(R.id.UsernameIN);
        Password = (EditText)findViewById(R.id.Password);
        LoginButton = (Button)findViewById(R.id.LoginButton);
        LoginDirections = (TextView) findViewById(R.id.LoginDirections);
        HomeImage = (ImageView)findViewById(R.id.HomeImage);


        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser(UsernameIn.getText().toString() , Password.getText().toString());

            }
        });





    }

    private void checkUser(String username, String password)
    {
        //if username in database
        //{
        //check password matches
        Intent intent = new Intent(MainActivity.this, Homepage.class);
        startActivity(intent);
        //}
        //else: add to db
    }

}
