package com.example.adolfo.desfragmentar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adolfo on 23-09-2015.
 */
public class Fragmenta_a extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.fragment_a,container );
        return view;


    }
}
