package com.example.axity.dymamicforms.captureflow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.axity.dymamicforms.R;
import com.example.axity.dymamicforms.formsdesigner.ElementMaker;

/**
 * Created by javierrodriguez on 4/5/18.
 */

public class FragmentOne extends FragmentManager {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.general_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.SetUpView(view);

        LinearLayout containerLayOut = view.findViewById(R.id.container);
        ElementMaker elementMaker = new ElementMaker(getContext());
        containerLayOut.addView(elementMaker.createTextBox("Hola"));
    }

    private void SetUpView(View view) {
        super.SetUpUI(view);

    }


    public static FragmentOne newInstance() {

        Bundle args = new Bundle();

        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void OnNextButtonPressed() {

        FragmentTwo fragmentTwo = FragmentTwo.newInstance();
        this.navigateToFragment(fragmentTwo, true);
    }

    @Override
    public void OnPreviousButtonPressed() {
        this.getFragmentManager().popBackStack();
    }
}
