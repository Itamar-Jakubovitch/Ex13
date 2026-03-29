package com.example.ex13;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author      Itamar Jakubovitch ItamarJakubovitch@gmail.com
 * @version     1.0
 * @since       30/3/2026
 *
 * An app with a Switch and a RadioGroup.
 * The background color changes based on the selected radio button.
 */
public class MainActivity extends AppCompatActivity {

    private Switch sW;
    private RadioGroup rG;
    private View main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sW = findViewById(R.id.sW);
        rG = findViewById(R.id.rG);
        main = findViewById(R.id.main);

        rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (sW.isChecked()) {
                    changeColor(checkedId);
                }
            }
        });
    }

    /**
     * Changes the background color based on the selected radio button.
     *
     * @param checkedId the id of the selected radio button
     */
    private void changeColor(int checkedId) {
        if (checkedId == R.id.rB1) {
            main.setBackgroundColor(Color.RED);
        } else if (checkedId == R.id.rB2) {
            main.setBackgroundColor(Color.BLUE);
        } else if (checkedId == R.id.rB3) {
            main.setBackgroundColor(Color.GREEN);
        } else if (checkedId == R.id.rB4) {
            main.setBackgroundColor(Color.YELLOW);
        }
    }

    /**
     * Reads the selected radio button and changes the background color.
     *
     * @param view the button that was clicked
     */
    public void clicked(View view) {
        changeColor(rG.getCheckedRadioButtonId());
    }
}