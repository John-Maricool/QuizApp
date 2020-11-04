package com.example.johnbatista.quizapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class ChristianFragment extends Fragment {

    private int i = 20;
    private boolean running = true;
    private int[] rand = Quiz.getQuestionIndex();
    private TextView questions;
    private RadioGroup radGroup;
    private RadioButton[] option = new RadioButton[4];
    private int clicks = 0;
    private Button Next;
    private  TextView timer;
    private int countQuestions = 0;
    private int rightAnswers = 0;
    private TextView displayQuestions;
    private ProgressBar progressBar;
    private onLastClickChristian lastClick;



     interface onLastClickChristian{
        void  doSomethingChristian(int rA, int cQ);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_random, container, false);

        displayQuestions = (TextView)v. findViewById(R.id.display_questions);
        questions = (TextView)v. findViewById(R.id.questions);
        radGroup = (RadioGroup) v.findViewById(R.id.radGroup);
        Next = (Button)v.findViewById(R.id.Next);
        timer = (TextView) v.findViewById(R.id.timer);
        progressBar = (ProgressBar)v.findViewById(R.id.determinate_progress);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicks == 9) {
                    running = false;
                    CheckCorrectAnswers();
                    lastClick.doSomethingChristian(rightAnswers, countQuestions);
                } else {
                    i = 20;
                    progressBar.setProgress(20);
                    timer.setTextColor(getResources().getColor(R.color.green));
                    countQuestions++;
                   CheckCorrectAnswers();
                    clicks++;

                    option = displayQuestions(rand[clicks]);
                    displayQuestions.setText("question " + countQuestions + " out of 10");
                }

                UnTick();

            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CheckTimer();
        if(savedInstanceState != null){
            clicks = savedInstanceState.getInt("clicks");
            countQuestions = savedInstanceState.getInt("countQuestions");
            rightAnswers = savedInstanceState.getInt("rightAnswers");

            option = displayQuestions(rand[clicks]);
            displayQuestions.setText("question" + countQuestions + " out of 10");
        }

        else {
            option = displayQuestions(rand[0]);
            countQuestions = 1;
            displayQuestions.setText("question" + countQuestions + " out of 10");
        }
    }


    public RadioButton[] displayQuestions(int i) {

        View v = getView();
        option[0] = (RadioButton) v.findViewById(R.id.option0);
        option[1] = (RadioButton) v.findViewById(R.id.option1);
        option[2] = (RadioButton) v.findViewById(R.id.option2);
        option[3] = (RadioButton) v.findViewById(R.id.option3);
        Quiz QUIZ = Quiz.quiz[i];
        String Question = QUIZ.getQuestions();
        questions.setText(Question);

        String[] Options = QUIZ.getOptions();
        for (int j = 0; j < option.length; j++) {
            option[j].setText(Options[j]);
            option[j].setTextColor(getResources().getColor(R.color.Blue));
        }
        return option;
    }

    private void UnTick() {
        //This code clears the radio btn from all previously checked buttons
        radGroup.clearCheck();
    }


    private void CheckCorrectAnswers() {

        String[] Option = new String[4];
        String ans = Quiz.quiz[rand[clicks]].getCorrectAnswer();
        int id = radGroup.getCheckedRadioButtonId();

        switch (id) {

            case R.id.option0:
                //option[0] = v.findViewById(id);
                Option[0] = option[0].getText().toString();
                if (Option[0].equals(ans)) {
                    rightAnswers++;
                    break;
                }


            case R.id.option1:
                //option[1] = v.findViewById(id);
                Option[1] = option[1].getText().toString();
                if (Option[1].equals(ans)) {
                    rightAnswers++;
                    break;
                }


            case R.id.option2:
                //option[2] = v.findViewById(id);
                Option[2] = option[2].getText().toString();
                if (Option[2].equals(ans)) {
                    rightAnswers++;

                    break;
                }


            case R.id.option3:
                //option[3] = v.findViewById(id);
                Option[3] = option[3].getText().toString();
                if (Option[3].equals(ans)) {
                    rightAnswers++;
                    break;
                }
        }
    }



    private void CheckTimer() {

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
            @Override
            public void run() {

                String time = String.valueOf(i);
                timer.setText(time);
                progressBar.setProgress(Integer.parseInt(time));
                if (running) {
                    i--;

                }
                if(i == 9){
                    timer.setTextColor(getResources().getColor(R.color.red));
                }
                if(i == -1){
                    Next.callOnClick();
                    timer.setTextColor(getResources().getColor(R.color.green));

                }
                handler.postDelayed(this, 1000);
            }

        });

    }

    @Override
    public void onPause() {
        super.onPause();
        running = false;
    }

    @Override
    public void onResume() {
        super.onResume();

        running = true;
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("clicks", clicks);
        savedInstanceState.putInt("countQuestions", countQuestions);
        savedInstanceState.putInt("rightAnswers", rightAnswers);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        lastClick = (onLastClickChristian) context;
    }
}