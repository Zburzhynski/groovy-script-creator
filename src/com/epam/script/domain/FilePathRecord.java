package com.epam.script.domain;

import java.util.UUID;

/**
 * FilePathRecord class represent file path.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: Jun 27, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class FilePathRecord extends BaseRecord {

    /**
     * File path uid.
     */
    private String filePathUID;

    /**
     * File path.
     */
    private String filePath;

    /**
     * Default constructor.
     */
    public FilePathRecord() {
        super();
        filePathUID = UUID.randomUUID().toString();
    }

    /**
     * @return the filePathUID
     */
    public String getFilePathUID() {
        return filePathUID;
    }

    /**
     * @param filePathUID the filePathUID to set
     */
    public void setFilePathUID(String filePathUID) {
        this.filePathUID = filePathUID;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
