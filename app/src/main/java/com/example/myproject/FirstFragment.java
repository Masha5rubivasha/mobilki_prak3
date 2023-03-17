package com.example.myproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    EditText name;
    Button button_save;

    private static final String TAG = "MyApp";

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FirstFragment() {

    }

    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onViewStateRestored");
    }
    public void onStart() {
        super.onStart();

        Button save_button = getActivity().findViewById(R.id.buttonSave);//кнопка сохранения

        Toast.makeText(getContext(), "onStart", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onStart");

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i (TAG, "Данные о пользователе сохранены");
                Toast.makeText(getActivity(),"Сохранение",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getContext(), "onPause", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getContext(), "onStop", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_LONG).show();
        Log.i("Fragment", "onDestroy");
    }

}