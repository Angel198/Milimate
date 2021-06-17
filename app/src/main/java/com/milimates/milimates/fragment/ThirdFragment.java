package com.milimates.milimates.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.milimates.milimates.LoginActivity;
import com.milimates.milimates.MainActivity;
import com.milimates.milimates.R;


public class ThirdFragment extends Fragment {

    TextView next;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        next = (TextView) view.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}