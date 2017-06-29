package com.developer.aashish.exampleoffregment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.developer.aashish.exampleoffregment.R.id.fg;


public class MainActivity extends Activity {
Button btn;

    boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        public void onChange(View view)
    {

        android.app.Fragment fragment;
        if(view==findViewById(R.id.b1))
        {
            fragment=new one();
            android.app.FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fg,fragment);
            ft.commit();

        }
        if(view==findViewById(R.id.b2))
        {
            fragment=new two();
            android.app.FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fg,fragment);
            ft.commit();
        }
    }



}
