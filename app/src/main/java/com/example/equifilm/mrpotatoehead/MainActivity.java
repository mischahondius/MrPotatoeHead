package com.example.equifilm.mrpotatoehead;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void checkBoxClicked(View view) {
        //declare img imageview
        ImageView img;

        // check if checkbox is checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.arms_Checkbox:
                //Get arms view
                img = (ImageView) findViewById(R.id.arms);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.ears_Checkbox:
                //Get ears view
                img = (ImageView) findViewById(R.id.ears);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrows_Checkbox:
                //Get arms view
                img = (ImageView) findViewById(R.id.eyebrows);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;


            case R.id.eyes_Checkbox:
                //Get eyes view
                img = (ImageView) findViewById(R.id.eyes);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glasses_Checkbox:
                //Get glasses view
                img = (ImageView) findViewById(R.id.glasses);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hat_Checkbox:
                //Get arms view
                img = (ImageView) findViewById(R.id.hat);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouth_Checkbox:
                //Get mouth view
                img = (ImageView) findViewById(R.id.mouth);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustache_Checkbox:
                //Get mustache view
                img = (ImageView) findViewById(R.id.mustache);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.nose_Checkbox:
                //Get arms nose
                img = (ImageView) findViewById(R.id.nose);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoes_Checkbox:
                //Get shoes view
                img = (ImageView) findViewById(R.id.shoes);

                if (checked) {
                    //Set visibility to visible
                    img.setVisibility(View.VISIBLE);
                } else {
                    //Set visibility to visible
                    img.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }

}