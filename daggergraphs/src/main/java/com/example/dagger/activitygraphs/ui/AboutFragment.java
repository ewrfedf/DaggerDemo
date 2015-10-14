package com.example.dagger.activitygraphs.ui;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dagger.activitygraphs.DemoBaseFragment;
import com.example.dagger.activitygraphs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends DemoBaseFragment {

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

        // Fragments should not modify things outside of their own view. Use an external controller to
        // ask the activity to change its title.
        titleController.setTitle("Home Fragment");
    }

}
