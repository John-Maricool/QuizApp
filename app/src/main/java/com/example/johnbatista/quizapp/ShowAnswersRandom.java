package com.example.johnbatista.quizapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowAnswersRandom extends Fragment {

    public ShowAnswersRandom() {
        // Required empty public constructor
    }

    TextView textView;
    public static  String RIGHTANSWERS;

    public static  String TOTALQUESTIONS;
    int rightAnswers;
    int totalQuestion;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_catholic_correction, container, false);
        textView = v.findViewById(R.id.answer);

        rightAnswers = getArguments().getInt("RIGHTONES");
        totalQuestion = getArguments().getInt(TOTALQUESTIONS);
        textView.setText("Your score is: \n" + rightAnswers + " over " + totalQuestion);
        return v;
    }

    public static ShowAnswersRandom newInstance(int rA, int cQ){
        Bundle args = new Bundle();
        ShowAnswersRandom showAns = new ShowAnswersRandom();
        args.putInt("RIGHTONES", rA);
        args.putInt(TOTALQUESTIONS, cQ);
        showAns.setArguments(args);
        return showAns;
    }
}