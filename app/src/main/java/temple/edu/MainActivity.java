package temple.edu;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Layout layout;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("cyan");
        colors.add("green");
        colors.add("yellow");
        colors.add("magenta");
        colors.add("maroon");
        colors.add("aqua");
        colors.add("lime");
        colors.add("purple");

        spinner = findViewById(R.id.spinner);
        constraintLayout = findViewById(R.id.constraintLayout);
        ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("white"));

               //constraintLayout.setBackgroundColor(Color.parseColor(((TextView)view).getText().toString()));
                constraintLayout.setBackgroundColor(Color.parseColor(parent.getItemAtPosition(position).toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
