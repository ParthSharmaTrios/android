package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class listFragment extends Fragment {


    public listFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Toast.makeText(getActivity(), "HELLO", Toast.LENGTH_SHORT).show();

        TextView tv = (TextView) getView().findViewById(R.id.textView);

        tv.setText("YOYOYYOYOYOYO");
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

}
