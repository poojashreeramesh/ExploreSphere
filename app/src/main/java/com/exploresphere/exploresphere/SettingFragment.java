package com.exploresphere.exploresphere;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

public class SettingFragment extends Fragment  {
    public SettingFragment() {
        // require a empty public constructor
    }
    RelativeLayout homeRelativeLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_dashboard, container, false);

    }
}
