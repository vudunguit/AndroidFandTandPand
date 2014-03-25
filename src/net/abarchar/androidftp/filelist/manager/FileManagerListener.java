package net.abarchar.androidftp.filelist.manager;

public interface FileManagerListener {

    /**
     * 
     */
    public void onFileManagerEvent(FileManager fileManager, FileManagerEvent event);
}