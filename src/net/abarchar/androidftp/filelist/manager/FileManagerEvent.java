package net.abarchar.androidftp.filelist.manager;

public enum FileManagerEvent {
    
    /** Connection messages */
    WILL_CONNECT,
    DID_CONNECT,
    ERROR_CONNECTION,
    LOST_CONNECTION,

    /** */
    INITIAL_LIST_FILES, 

    /** List files changed */
    WILL_LOAD_LIST_FILES,
    DID_LOAD_LIST_FILES;
}
