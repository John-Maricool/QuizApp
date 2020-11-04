package com.example.johnbatista.quizapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    NavigationView navigationView;
    AlertDialog.Builder builder;

    //The button we are using is the actionbar toggle
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we need to reference the drawer layout
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        navigationView = (NavigationView)findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        toolbar = (Toolbar)findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);
        //The Action bar toggle
        mToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);


        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        //The code below helps me to see the normal back button in my app
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        builder = new AlertDialog.Builder(this);
    }


    public void startQuiz(View view){
        Intent intent = new Intent(this, MainQuizActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_message:
                //sending an email to my mail account
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:09027901278"));
                startActivity(intent);
                break;

            case R.id.nav_help:
                intent = new Intent(this, Help.class);
                startActivity(intent);
                break;

            case R.id.share:
                intent = new Intent(Intent.ACTION_SEND);
                startActivity(intent.createChooser(intent, "Share this App..."));
                break;

            case R.id.Exit:
                builder.setTitle("Exit");
                builder.setMessage("Are you sure?");
                builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
                break;
        }

        return true;
        }
}
