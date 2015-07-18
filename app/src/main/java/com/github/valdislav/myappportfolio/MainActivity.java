package com.github.valdislav.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    protected volatile Toast currentToast;

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

    /** Called when the user touches the button */
    public void runApplication(View view) {
        //TODO: code that will run application will be here
        if (view instanceof Button) {
            if (currentToast != null) {
                currentToast.cancel();
            }

            currentToast = Toast.makeText(
                    view.getContext(),
                    makeStubText(((Button) view).getText()),
                    Toast.LENGTH_SHORT
            );
            currentToast.show();
        }

    }

    private CharSequence makeStubText(CharSequence buttonText) {
        return buttonText.length() > 0 ? "This button will launch " + buttonText : "Error";
    }
}
