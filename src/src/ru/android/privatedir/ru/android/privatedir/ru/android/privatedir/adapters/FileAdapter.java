package ru.android.privatedir.ru.android.privatedir.ru.android.privatedir.adapters;

import android.content.Context;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ru.android.privatedir.R;
import ru.android.privatedir.ru.android.privatedir.entities.File;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SVVostrodymov on 11.07.14.
 */
public class FileAdapter extends BaseAdapter
{
    private List<File> _Items = new ArrayList<File>();
    private LayoutInflater _Inflater;

    public FileAdapter(Context context)
    {
        _Inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        java.io.File root = new java.io.File("/sdcard/StxData/");

        for(java.io.File el : root.listFiles())
        {
            if (el.isDirectory()) continue;
           _Items.add(new File(el.getAbsolutePath()));
        }
    }

    @Override
    public int getCount()
    {
        return _Items.size();
    }

    @Override
    public Object getItem(int i)
    {
        return _Items.get(i);
    }
    public File getFile(int i)
    {
        return (File)getItem(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        if (view == null)
            view = _Inflater.inflate(R.layout.file_item, viewGroup, false);

        File item = getFile(i);
        TextView lblName = (TextView)view.findViewById(R.id.lblName);
        lblName.setText(item.getAbsolutePath());

        return view;
    }
}
