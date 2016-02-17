package com.example.alumnos.mimenusf3;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragment_c extends Fragment{
    public static Fragment newIntance (Context context){
        fragment_c frag=new fragment_c();
        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root=(ViewGroup) inflater.inflate(R.layout.fragment_c ,null);
        return root;
    }
}
