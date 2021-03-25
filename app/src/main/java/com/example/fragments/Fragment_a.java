package com.example.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment_a extends Fragment {

    EditText text1,text2;
    Button button;



public Fragment_a(){

}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_a, container, false);
        text1=v.findViewById(R.id.editText);
        text2=v.findViewById(R.id.editText2);
        button=v.findViewById(R.id.buttonsend);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname=text1.getText().toString();
                String lastname=text2.getText().toString();


                Bundle bundle=new Bundle();
                bundle.putString("Firstname",firstname);
                bundle.putString("Lastname",lastname);
                fragment_b fragmentB=new fragment_b();
                fragmentB.setArguments(bundle);

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.mail_container,new fragment_b());
                fragmentTransaction.commit();

            }
        });

                return v;

    }


}
