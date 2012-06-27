package com.epam.script.domain;

import java.util.UUID;

/**
 * DocPathRecord class represent document path.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: Jun 27, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class DocPathRecord extends BaseRecord {

    /**
     * Document path uid.
     */
    private String docPathUID;

    /**
     * Document path.
     */
    private String docPath;

    /**
     * Default constructor.
     */
    public DocPathRecord() {
        super();
        docPathUID = UUID.randomUUID().toString();
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
     * @return the docPath
     */
    public String getDocPath() {
        return docPath;
    }

    /**
     * @param docPath the docPath to set
     */
    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

}
