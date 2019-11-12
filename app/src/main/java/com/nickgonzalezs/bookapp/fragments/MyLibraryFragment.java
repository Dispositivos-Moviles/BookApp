package com.nickgonzalezs.bookapp.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nickgonzalezs.bookapp.R;
import com.nickgonzalezs.bookapp.adapter.RecomendedBooksAdapter;


public class MyLibraryFragment extends Fragment {

    private AppCompatActivity appCompatActivity;

    public MyLibraryFragment() {
    }

    public static MyLibraryFragment newInstance(String title) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);

        MyLibraryFragment myLibraryFragment = new MyLibraryFragment();
        myLibraryFragment.setArguments(bundle);

        return myLibraryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_library, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if(getArguments() != null){

            String title = getArguments().getString("title");

            RecyclerView rvRecomendados = view.findViewById(R.id.rv_recomended);
            rvRecomendados.setAdapter(new RecomendedBooksAdapter(appCompatActivity));
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        appCompatActivity = (AppCompatActivity) context;
    }
}
