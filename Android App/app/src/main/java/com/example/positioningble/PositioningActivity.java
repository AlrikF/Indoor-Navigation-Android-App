package com.example.positioningble;

import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;
import android.os.Bundle;
import android.widget.ImageView;

public class PositioningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positioning);
        ImageView floorimg=(ImageView)findViewById(R.id.floorimg);
        ImageView b2=(ImageView)findViewById(R.id.b2);

        if(!MainActivity.plan_link.equals(null)){
            System.out.println(MainActivity.plan_link);
        Picasso.get().load(MainActivity.plan_link).into(floorimg);

        }

    }
}
