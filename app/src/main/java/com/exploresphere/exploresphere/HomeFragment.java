package com.exploresphere.exploresphere;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements View.OnClickListener {
    public HomeFragment() {
        // require a empty public constructor
    }
RelativeLayout homeRelativeLayout;
    RelativeLayout imagelayout;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layoutView = inflater.inflate(R.layout.layout_dashboard, container, false);
        homeRelativeLayout = layoutView.findViewById(R.id.layout_home);
        imageView = layoutView.findViewById(R.id.data_button);
        imagelayout=layoutView.findViewById(R.id.layout_image);
        homeRelativeLayout.setOnClickListener(this);
        imagelayout.setOnClickListener(this);
        imageView.setOnClickListener(this);
        return layoutView;

    }

    @Override
    public void onClick(View view) {
        if( view.getId() == R.id.layout_home) {
            imageView.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.layout_white_black_border));
            GradientDrawable highlightDrawable = new GradientDrawable();
            //  highlightDrawable.s(ContextCompat.getDrawable(SplashScreen.this, R.drawable.));
//imagelayout.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.layout_white_black_border));
// Apply the new drawable as the background
            // logInButton.setBackground(highlightDrawable);

// Set a delay or duration for the highlight effect (optional)
            int duration = 500; // in milliseconds
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Restore the original background (optional)
                    imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.ic_bali));
                    imageView.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.layout_edittext));
                    // Perform the login button click action or any other desired action
                    // loginButton.performClick();
                }
            }, duration);
        } else if (view.getId() == R.id.data_button) {


            Intent loginScreenIntent = new Intent(getContext(),
                  BaliScreen.class);

           startActivity(loginScreenIntent);
            getActivity().finish();
        }

    }


}