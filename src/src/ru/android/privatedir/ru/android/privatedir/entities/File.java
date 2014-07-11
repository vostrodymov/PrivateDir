package ru.android.privatedir.ru.android.privatedir.entities;

/**
 * Created by SVVostrodymov on 11.07.14.
 */
public class File
{
    private String _filePath;
    private String _fileName;
    private String _fileExtension;
    private long _size;


    public File(String filePath)
    {
        java.io.File iFile = new java.io.File(filePath);

        _filePath = getPath(filePath);
        _fileName = getName(iFile.getName());
        _fileExtension = getExtension(iFile.getName());
        _size = (Long)(iFile.length()/1024);
    }

    public String getFileName()
    {
        return _fileName;
    }
    public String getFileExtension()
    {
        return _fileExtension;
    }
    public String getFilePath()
    {
        return _filePath;
    }
    public String getAbsolutePath()
    {
        return _filePath + _fileName + _fileExtension;
    }





    private String getExtension(String fileName)
    {
        int pos = fileName.lastIndexOf(".");
        if(pos != -1)
        {
            return fileName.substring(pos).trim();
        }
        return null;
    }

    private String getName(String fileName)
    {
        int pos = fileName.lastIndexOf(".");
        if(pos != -1)
        {
            return fileName.substring(0, pos).trim();
        }
        return null;
    }
    private String getPath(String filePath)
    {
        int pos = filePath.lastIndexOf("/");
        if(pos != -1)
        {
            return filePath.substring(0, pos+1).trim();
        }
        return null;
    }
}
