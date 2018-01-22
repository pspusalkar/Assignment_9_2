package com.example.poojajoshi.assignment_9_2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.LayoutInflater.Factory;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(Menu.NONE, 1, Menu.NONE, "Computer");
        menu.add(Menu.NONE, 2, Menu.NONE, "Gamepad");
        menu.add(Menu.NONE, 3, Menu.NONE, "Camera");
        menu.add(Menu.NONE, 4, Menu.NONE, "Video");
        menu.add(Menu.NONE, 5, Menu.NONE, "Email");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == 1) {
            Toast.makeText(getApplicationContext(), "Computer", Toast.LENGTH_SHORT);
            return true;
        } else  if (id == 2) {
            Toast.makeText(getApplicationContext(), "Gamepad", Toast.LENGTH_SHORT);
            return true;
        } else  if (id == 3) {
            Toast.makeText(getApplicationContext(), "Camera", Toast.LENGTH_SHORT);
            return true;
        } else  if (id == 4) {
            Toast.makeText(getApplicationContext(), "Video", Toast.LENGTH_SHORT);
            return true;
        } else  if (id == 5) {
            Toast.makeText(getApplicationContext(), "Email", Toast.LENGTH_SHORT);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setMenuBackground() {
        /*
        getLayoutInflater().setFactory(new LayoutInflater.Factory() {
            // @Override
            public View onCreateView(final String name,
                                     final Context context,
                                     final AttributeSet attributeSet) {

                if (name.equalsIgnoreCase
                        ("com.android.internal.view.menu.IconMenuItemView")) {

                    final LayoutInflater f = getLayoutInflater();
                    final View view = f.createView(name, null, attributeSet);

                    new Handler().post(new Runnable() {
                        public void run() {
                            view.setBackgroundResource(
                                    R.drawable.menu_selector);
                        }
                    });
                    return view;
                }
                return null;
            }
        });
        */

        getLayoutInflater().setFactory(new Factory() {
            @Override
            public View onCreateView(String name, Context context, AttributeSet attributeSet) {
                if (name.equalsIgnoreCase
                        ("com.android.internal.view.menu.IconMenuItemView")) {
                    try {
                        final LayoutInflater f = getLayoutInflater();
                        final View view = f.createView(name, null, attributeSet);

                        new Handler().post(new Runnable() {
                            public void run() {
                                view.setBackgroundResource(
                                        R.drawable.menu_selector);
                            }
                        });
                        return view;
                    } catch (final Exception e){
                        Log.e("##Menu##",
                                "Could not create a custom view for menu: "
                                        + e.getMessage(), e);
                    }
                }
                return null;
            }
        });
    }
}
