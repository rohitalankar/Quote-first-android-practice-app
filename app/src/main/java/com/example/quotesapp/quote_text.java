package com.example.quotesapp;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.concurrent.ThreadLocalRandom;

public class quote_text {

    String[] getquote()
    {
        String[] quote = new String[]{"rohit","jsdbj","Dada","Aai"};
        return quote;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    String random_text(){
        String quoti;
        int length = getquote().length;
        int random_num = ThreadLocalRandom.current().nextInt(length);
        quoti = getquote()[random_num];
        return quoti;
    }
}
