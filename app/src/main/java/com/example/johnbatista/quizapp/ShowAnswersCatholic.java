package com.example.johnbatista.quizapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowAnswersCatholic extends Fragment {

    public ShowAnswersCatholic() {
        // Required empty public constructor
    }

    TextView textView;
    private static final String TAG = "ShowAnswers";

    public static  String TOTALQ;
    public   String RIGHTONES;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_catholic_correction, container, false);
        textView = v.findViewById(R.id.answer);

        int rightAnswers = getArguments().getInt("RIGHTONES");
            int totalQuestion = getArguments().getInt(TOTALQ);

        textView.setText("Your score is: \n" + rightAnswers + " over " + totalQuestion);
        return v;
    }

    public static ShowAnswersCatholic newInstance(int rA, int cQ){
        ShowAnswersCatholic showAns = new ShowAnswersCatholic();
        Bundle argsCatholic = new Bundle();
        argsCatholic.putInt("RIGHTONES", rA);
        argsCatholic.putInt(TOTALQ, cQ);
        showAns.setArguments(argsCatholic);
        return showAns;
    }

}