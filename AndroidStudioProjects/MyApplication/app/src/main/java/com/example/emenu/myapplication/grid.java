package com.example.emenu.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by emenu on 6/3/2016.
 */
public class grid extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup contaniner, Bundle savedInstanceState){

        return inflater.inflate(R.layout.grid,null);
    }
}
