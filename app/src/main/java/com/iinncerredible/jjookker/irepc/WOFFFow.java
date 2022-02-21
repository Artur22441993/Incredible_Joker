package com.iinncerredible.jjookker.irepc;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class WOFFFow extends Fragment {

    WebView oiuij;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View uim = inflater.inflate(R.layout.fragment_w_o_f_f_fow, container, false);

        oiuij = uim.findViewById(R.id.oiuij);
        oiuij.loadUrl(IJ.ddddeee("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49OTd3QnBRME1IY1RNMDZnVEI5UXVDZUVEN0NrSXdPbVE="));

        return uim;
    }

    public static String[] spli(String udha){
        String [] iujsj = udha.split("\\\u007C");
        return iujsj;
    }
}