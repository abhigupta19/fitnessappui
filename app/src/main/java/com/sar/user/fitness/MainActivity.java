package com.sar.user.fitness;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title=findViewById(R.id.textView);
        Animation animation1=AnimationUtils.loadAnimation(this,R.anim.img);
        Animation animation2=AnimationUtils.loadAnimation(this,R.anim.button);
        Animation animation3=AnimationUtils.loadAnimation(this,R.anim.view);
        Animation animation4=AnimationUtils.loadAnimation(this,R.anim.text);
       // Animation animation3=AnimationUtils.loadAnimation(this,R.anim.button);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Vidaloka.ttf");
        title.setTypeface(typeface);
        TextView title1=findViewById(R.id.k);

       // TextView title2=findViewById(R.id.k);
        Typeface typeface1=Typeface.createFromAsset(getAssets(),"MMedium.ttf");
        Typeface typeface2=Typeface.createFromAsset(getAssets(),"MLight.ttf");
        title1.setTypeface(typeface1);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.startAnimation(animation1);
        title.startAnimation(animation2);
        title1.startAnimation(animation2);
        View view=findViewById(R.id.view2);
        TextView textView=findViewById(R.id.textView2);
        textView.setTypeface(typeface2);

        view.startAnimation(animation3);
        View view2=findViewById(R.id.view);
        textView.startAnimation(animation4);
        view2.startAnimation(animation3);


    }
}
