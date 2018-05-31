package com.example.axity.dymamicforms.formsdesigner;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by javierrodriguez on 4/5/18.
 */

public class ElementMaker {

    private Context _context;

    public ElementMaker(Context context) {

        this._context = context;
    }

    public TextView createTextBox(String texto){

        TextView tvElem = new TextView(this._context);
        tvElem.setText(texto);
        tvElem.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        return tvElem;
    }

}
