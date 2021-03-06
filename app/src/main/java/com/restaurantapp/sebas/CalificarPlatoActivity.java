package com.restaurantapp.sebas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class CalificarPlatoActivity extends Activity {

    LinearLayout rating;
    CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar_plato);

        rating=findViewById(R.id.ratingservices);
        for (int i=1;i<=5;i++){
            star=(CheckBox)rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);

        }

    }

    private View.OnClickListener starsListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int tag = Integer.valueOf((String) view.getTag());

            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }

        }

    };
}
