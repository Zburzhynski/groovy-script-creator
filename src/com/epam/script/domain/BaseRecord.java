package com.epam.script.domain;

/**
 * Base entity for FilePath, DocPath, WorkFileDocument.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: Jun 27, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class BaseRecord {

    /**
     * Autor constant.
     */
    private static final String AUTOR = "uladzimir_zburzhynski@epam.com";

    /**
     * Default datetime constant.
     */
    private static final String DEFAULT_DATETIME = "now()";

    /**
     * Record version constant.
     */
    private static final String RECORD_VERSION = "1";

    /**
     * Record version.
     */
    private String recordVersion;

    /**
     * Created by user.
     */
    private String createdByUser;

    /**
     * Created datetime.
     */
    private String createdDateTime;

    /**
     * Updated by user.
     */
    private String updatedByUser;

    /**
     * Updated datetime.
     */
    private String updatedDateTime;

    /**
     * Default constructor.
     */
    public BaseRecord() {
        recordVersion = RECORD_VERSION;
        createdByUser = AUTOR;
        createdDateTime = DEFAULT_DATETIME;
        updatedByUser = AUTOR;
        updatedDateTime = DEFAULT_DATETIME;
    }

    /**
     * @return the recordVersion
     */
    public String getRecordVersion() {
        return recordVersion;
    }

    /**
     * @param recordVersion the recordVersion to set
     */
    public void setRecordVersion(String recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * @return the createdByUser
     */
    public String getCreatedByUser() {
        return createdByUser;
    }

    /**
     * @param createdByUser the createdByUser to set
     */
    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    /**
     * @return the createdDateTime
     */
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * @param createdDateTime the createdDateTime to set
     */
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * @return the updatedByUser
     */
    public String getUpdatedByUser() {
        return updatedByUser;
    }

    /**
     * @param updatedByUser the updatedByUser to set
     */
    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    /**
     * @return the updatedDateTime
     */
    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    /**
     * @param updatedDateTime the updatedDateTime to set
     */
    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

}
