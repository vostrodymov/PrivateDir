package ru.android.privatedir.ru.android.privatedir.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SVVostrodymov on 11.07.14.
 */
public class Folder
{
    private String _path;
    private String _name;
    private List<File> _files;
    private List<Folder> _folders;

    public Folder()
    {
        _files = new ArrayList<File>();
        _folders = new ArrayList<Folder>();
    }

}
