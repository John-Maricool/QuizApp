package com.example.johnbatista.quizapp;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class DetailedActivity extends AppCompatActivity implements CatholicFragment.onLastClick, ChristianFragment.onLastClickChristian
        , RandomFragment.onLastClickRandom{


    FrameLayout frameLayout;
    ChristianFragment christianFragment = new ChristianFragment();
    CatholicFragment catholicFragment = new CatholicFragment();
    RandomFragment randomFragment = new RandomFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        frameLayout = findViewById(R.id.details);

        Intent intent = getIntent();
        int position = intent.getIntExtra("Position", 0);

        switch (position) {
            case 0:
                this.getSupportFragmentManager().beginTransaction()
                        // .remove(ListQuizes)
                        .replace(R.id.frameLayout, christianFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
            case 1:
                this.getSupportFragmentManager().beginTransaction()
                        // .remove(ListQuizes)
                        .replace(R.id.frameLayout, catholicFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
            case 2:
                this.getSupportFragmentManager().beginTransaction()
                        //.remove(ListQuizes)
                        .replace(R.id.frameLayout, randomFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
        }


    }

    @Override
    public void doSomething(int rA, int cQ) {
        ShowAnswersCatholic showAnswersCatholic = ShowAnswersCatholic.newInstance(rA, cQ);
        this.getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, showAnswersCatholic)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    @Override
    public void doSomethingChristian(int rA, int cQ) {
        ShowAnswersChristian showAnswersChristian = ShowAnswersChristian.newInstance(rA, cQ);
        this.getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, showAnswersChristian)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    @Override
    public void doSomethingRandom(int rA, int cQ) {
        ShowAnswersRandom showAnswersRandom = ShowAnswersRandom.newInstance(rA, cQ);
        this.getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, showAnswersRandom)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}