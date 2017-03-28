package com.example.norman.android_hw2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    TextView result;
    Button submit;
    EditText input;
    private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.et_input);
        submit = (Button) findViewById(R.id.btn_submit);

        submit.setOnClickListener(calcResult);

    }
    private View.OnClickListener calcResult = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String input_str = input.getText().toString();
            Toast.makeText(MainActivity.this, "Hi:    " + input_str, Toast.LENGTH_SHORT).show();
            input.setText("");
        }
    };

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
        switch(item.getItemId()) {
            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("about this app");
                ad.setMessage("Author  : 葉主光");
                DialogInterface.OnClickListener listener =
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface di, int i)
                            {}};
                ad.setPositiveButton("ok",listener);
                ad.show();
                break;
            case R.id.action_reset:
                input.setText("");
        };
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    }


