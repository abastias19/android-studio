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
public class Fragment_a extends Fragment{
    public static Fragment newInstance (Context context){
        Fragment_a frag=new Fragment_a();
        return frag;
    }
    @Nullable
    @Override

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){
        ViewGroup root= (ViewGroup) inflater.inflate (R.layout.fragment_a,null);
        return root;
    }
}
