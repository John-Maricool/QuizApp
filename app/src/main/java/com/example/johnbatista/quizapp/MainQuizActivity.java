package com.example.johnbatista.quizapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainQuizActivity extends AppCompatActivity implements ItemFragment.callClickListener, CatholicFragment.onLastClick, ChristianFragment.onLastClickChristian
, RandomFragment.onLastClickRandom{

    FrameLayout frameLayout;
    ItemFragment ListQuizes;
    View others;
    ChristianFragment christianFragment = new ChristianFragment();
    CatholicFragment catholicFragment = new CatholicFragment();
    RandomFragment randomFragment = new RandomFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        ListQuizes = new ItemFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, ListQuizes);
        fragmentTransaction.commit();
    }

    @Override
    public void callClick(int position) {
       others = (FrameLayout)findViewById(R.id.others);

        if (others != null){

        switch (position) {
            case 0:
                this.getSupportFragmentManager().beginTransaction()
                        // .remove(ListQuizes)
                        .replace(R.id.others, christianFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
            case 1:
                this.getSupportFragmentManager().beginTransaction()
                        // .remove(ListQuizes)
                        .replace(R.id.others, catholicFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
            case 2:
                this.getSupportFragmentManager().beginTransaction()
                        //.remove(ListQuizes)
                        .replace(R.id.others, randomFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
                break;
        }
        }
        else {
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
    }


    @Override
    public void doSomething(int rA, int cQ) {
        ShowAnswersCatholic showAnswersCatholic = ShowAnswersCatholic.newInstance(rA, cQ);
      replaceAnswerFragments(showAnswersCatholic);
    }

    @Override
    public void doSomethingChristian(int rA, int cQ) {
        ShowAnswersChristian showAnswersChristian = ShowAnswersChristian.newInstance(rA, cQ);
    replaceAnswerFragments(showAnswersChristian);
        }


    @Override
    public void doSomethingRandom(int rA, int cQ) {
        ShowAnswersRandom showAnswersRandom = ShowAnswersRandom.newInstance(rA, cQ);
      replaceAnswerFragments(showAnswersRandom);
    }



    public void replaceAnswerFragments(Fragment fragment){
        if(others != null) {
            this.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, fragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }else{
            this.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, fragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }
    }
}