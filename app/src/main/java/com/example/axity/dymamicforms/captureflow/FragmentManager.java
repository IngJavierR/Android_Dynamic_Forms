package com.example.axity.dymamicforms.captureflow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.example.axity.dymamicforms.R;

/**
 * Created by javierrodriguez on 4/5/18.
 */

public abstract class FragmentManager extends Fragment {

    Button btnPrev;
    Button btnNext;

    public abstract void OnNextButtonPressed();

    public abstract void OnPreviousButtonPressed();

    protected void SetUpUI(View view){

        btnPrev = view.findViewById(R.id.btnPrev);
        btnNext = view.findViewById(R.id.btnNext);

        SetUpEvents();
    }

    private void SetUpEvents() {
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager.this.OnPreviousButtonPressed();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager.this.OnNextButtonPressed();
            }
        });
    }

    /**
     * Método para navegar a siguientes fragments
     */
    protected void navigateToFragment(Fragment toFragment, boolean addToBackStack) {

        FragmentTransaction transaction = this.getFragmentManager().beginTransaction();

        transaction.replace(R.id.rogaContainer, toFragment);

        createNavigation(transaction, addToBackStack);

    }

    private void createNavigation(FragmentTransaction transaction, boolean addToBackStack) {

        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        if (addToBackStack) {
            transaction.addToBackStack(null);
        }

        transaction.commit();
    }
}
