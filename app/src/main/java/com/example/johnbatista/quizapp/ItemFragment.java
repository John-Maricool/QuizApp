package com.example.johnbatista.quizapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class ItemFragment extends ListFragment {


     static interface callClickListener {
        void callClick(int position);
    }
    int[] images = {
            R.drawable.christian,
            R.drawable.catholi,
            R.drawable.random
    };

    private callClickListener listener;

    String[] names = {
            "Christian",
            "Catholic",
            "Random"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setListAdapter(new CustomAdapter());
        return super.onCreateView(inflater, container, savedInstanceState);
        }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (callClickListener) context;
    }



    class CustomAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @SuppressLint("ViewHolder")
            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                view = getLayoutInflater().inflate(R.layout.custom_listview, null);

                ImageView mImageview = view.findViewById(R.id.imageView);
                TextView mTextView = view.findViewById(R.id.textView);

                mImageview.setImageResource(images[position]);
                mTextView.setText(names[position]);
                return view;
            }
        }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
           // getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
            listener.callClick(position);
    }
}