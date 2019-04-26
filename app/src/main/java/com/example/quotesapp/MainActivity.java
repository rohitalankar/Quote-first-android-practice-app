package com.example.quotesapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button quote_button;
    private TextView quote_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quote_button = findViewById(R.id.show_quote_button);
        quote_text_view = findViewById(R.id.quote_text);

        quote_button.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                quote_text quote = new quote_text();
                quote_text_view.setText(quote.random_text());
                System.out.println("Hello rohit");
            }
        });
    }
}
