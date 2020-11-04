package com.example.johnbatista.quizapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowAnswersChristian extends Fragment {

    public ShowAnswersChristian() {
        // Required empty public constructor
    }

    TextView textView;
    private static final String TAG = "ShowAnswers";

    public static  String TOTALQCHRIST;

    public static  String RIGHTONESCHRIST;
    int rightAnswers;
    int totalQuestion;
    static Bundle argsChristian = new Bundle();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_catholic_correction, container, false);
        textView = v.findViewById(R.id.answer);

        totalQuestion = argsChristian.getInt(TOTALQCHRIST);
        rightAnswers = argsChristian.getInt("RIGHTONESCHRIST");


        textView.setText("Your score is: \n" + rightAnswers + " over " + totalQuestion);
        argsChristian.clear();
        return v;
    }
    public static ShowAnswersChristian newInstance(int rA, int cQ){
        ShowAnswersChristian showAns = new ShowAnswersChristian();
        argsChristian.putInt("RIGHTONESCHRIST", rA);
        argsChristian.putInt(TOTALQCHRIST, cQ);
        showAns.setArguments(argsChristian);
        return showAns;
    }

}