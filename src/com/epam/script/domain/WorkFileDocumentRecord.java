package com.epam.script.domain;

import java.util.UUID;

/**
 * WorkFileDocumentRecord represent class, which has FilePath DocPath mappings.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: Jun 27, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class WorkFileDocumentRecord extends BaseRecord {

    /**
     * Work file document uid.
     */
    private String workFileDocumentUID;

    /**
     * Format uid.
     */
    private String formatUID;

    /**
     * Required flag.
     */
    private String requiredFlag;

    /**
     * Field type uid.
     */
    private String fieldTypeUID;

    /**
     * Document path uid.
     */
    private String docPathUID;

    /**
     * File path uid.
     */
    private String filePathUID;

    /**
     * Default constructor.
     */
    public WorkFileDocumentRecord() {
        super();
        workFileDocumentUID = UUID.randomUUID().toString();
        formatUID = "2a3c519a-a09f-4df2-b9fa-b9458a77e456";
    }

    /**
     * @return the workFileDocumentUID
     */
    public String getWorkFileDocumentUID() {
        return workFileDocumentUID;
    }

    /**
     * @param workFileDocumentUID the workFileDocumentUID to set
     */
    public void setWorkFileDocumentUID(String workFileDocumentUID) {
        this.workFileDocumentUID = workFileDocumentUID;
    }

    /**
     * @return the formatUID
     */
    public String getFormatUID() {
        return formatUID;
    }

    /**
     * @param formatUID the formatUID to set
     */
    public void setFormatUID(String formatUID) {
        this.formatUID = formatUID;
    }

    /**
     * @return the requiredFlag
     */
    public String getRequiredFlag() {
        return requiredFlag;
    }

    /**
     * @param requiredFlag the requiredFlag to set
     */
    public void setRequiredFlag(String requiredFlag) {
        this.requiredFlag = requiredFlag;
    }

    /**
     * @return the fieldTypeUID
     */
    public String getFieldTypeUID() {
        return fieldTypeUID;
    }

    /**
     * @param fieldTypeUID the fieldTypeUID to set
     */
    public void setFieldTypeUID(String fieldTypeUID) {
        this.fieldTypeUID = fieldTypeUID;
    }

    /**
     * @return the docPathUID
     */
    public String getDocPathUID() {
        return docPathUID;
    }

    /**
     * @param docPathUID the docPathUID to set
     */
    public void setDocPathUID(String docPathUID) {
        this.docPathUID = docPathUID;
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

}
