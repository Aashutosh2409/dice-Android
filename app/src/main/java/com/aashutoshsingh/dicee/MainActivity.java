package com.aashutoshsingh.dicee;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.btn1);
        final TextView tv = (TextView) findViewById(R.id.num);
//          2 ways of assigning...final -> we are not going to change the content inside in another part of this app
//        final ImageView ileft = (ImageView) findViewById(R.id.il);
//        ImageView iright = (ImageView) findViewById(R.id.ir);

         final ImageView ileft,iright;
        ileft=(ImageView)findViewById(R.id.il);
        iright=(ImageView)findViewById(R.id.ir);
        final int[] arrayImg ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollbutton.setOnClickListener(new View.OnClickListener() {
//                                          int count;
            @Override
            public void onClick(View v) {
//
//                if (count==3)
//                {
//                    Log.d("no","count exceeded 3 times");
//
//                }
//                else{
                Log.d("Dice", "Button has been pressed");
//                count++;
//                }
                //initializing random type
                Random rand =new Random();
                int n=rand.nextInt(6);
//                int k=rand.nextInt(6);
                int p=n+1;
                Log.d("randomNumber1","generating Number is : " +p);

                ileft.setImageResource(arrayImg[n]);

                n=rand.nextInt(6);
                int j=n+1;
                Log.d("randomNumber2","generating Number is : " +j);
                iright.setImageResource(arrayImg[n]);
                int l=p+j;
                tv.setText(java.text.NumberFormat.getInstance().format(l));
            }
        });
    }
}