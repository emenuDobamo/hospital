package com.example.emenu.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emenu on 6/3/2016.
 */
public class tile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container , Bundle savedInstanceState){

        return inflator.inflate(R.layout.tile,null);
    }
}
