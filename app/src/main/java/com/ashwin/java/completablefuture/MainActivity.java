package com.ashwin.java.completablefuture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Presenter presenter = new Presenter(getApplicationContext(), new Service());
        presenter.setObserver();
        presenter.loadWords();
    }
}