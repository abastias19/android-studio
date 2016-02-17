package com.example.adolfo.menu1;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adolfo on 07-10-2015.
 */
public class Fragment_b extends Fragment{
    public static Fragment newInstance (Context context){
        Fragment_b frag=new Fragment_b();
        return frag;
    }
    @Nullable
    @Override

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){
        ViewGroup root= (ViewGroup) inflater.inflate (R.layout.fragment_b,null);
        return root;
    }
}

