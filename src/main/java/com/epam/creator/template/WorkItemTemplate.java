package com.epam.creator.template;

/**
 * Implementation {@link IWorkItemTemplate} interface.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: 4/19/12
 *
 * @author Siarhei Sabetski
 */
public class WorkItemTemplate implements IWorkItemTemplate {

    /**
     * The value of work item template.
     */
    private String value;

    /**
     * The type of work item template.
     */
    private String type;

    /**
     * Shows whether work item is required.
     */
    private Boolean required;

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    public String getType() {
        return type;
    }

    /**
     * {@inheritDoc}
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * {@inheritDoc}
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * {@inheritDoc}
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

}
