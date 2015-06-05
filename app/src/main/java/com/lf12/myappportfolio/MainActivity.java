package com.lf12.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void btn1click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to the Spotify Streamer App!", Toast.LENGTH_SHORT).show();
    }

    public void btn2click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to the Scores App", Toast.LENGTH_SHORT).show();
    }

    public void btn3click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to the Library App", Toast.LENGTH_SHORT).show();
    }

    public void btn4click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to the Build it bigger App", Toast.LENGTH_SHORT).show();
    }

    public void btn5click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to the XYZ Reader", Toast.LENGTH_SHORT).show();
    }

    public void btn6click(View view) {
        Toast.makeText(getApplicationContext(), "Clicking here will take you to my own Capstone App", Toast.LENGTH_SHORT).show();
    }
}
