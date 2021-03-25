package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment_b extends Fragment {

    TextView firsttext,secondtext;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_b, container, false);

         firsttext=v.findViewById(R.id.fname);
        secondtext=v.findViewById(R.id.lname);
        Bundle bundle=getArguments();
        if(bundle!=null){
            String firstname =bundle.getString("Firstname");
            String lastname =bundle.getString("Lastname");
            firsttext.setText(firstname);
            secondtext.setText(lastname);

        }

        return v;

    }
}