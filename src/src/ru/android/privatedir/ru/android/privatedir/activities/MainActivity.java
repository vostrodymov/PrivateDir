package ru.android.privatedir.ru.android.privatedir.activities;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import ru.android.privatedir.R;
import ru.android.privatedir.ru.android.privatedir.ru.android.privatedir.adapters.FileAdapter;

public class MainActivity extends ListActivity
{
    FileAdapter _adapter;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.main);



        _adapter = new FileAdapter(this);
        this.setListAdapter(_adapter);
    }
}
