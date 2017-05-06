package com.example.dell.intentex;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*

    The Google page will open with user requested data search.

 */
public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }


    /*
        on clicking the button using intent will open the google page with passed string using putextra method
     */

    public void onSearchClick(View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String string = editText.getText().toString();
        intent.putExtra(SearchManager.QUERY,string);
        startActivity(intent);
    }
}
