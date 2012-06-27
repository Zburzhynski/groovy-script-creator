package com.epam.creator.template;

import java.io.Serializable;

/**
 * Represents the Template for items.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: 4/19/12
 *
 * @author Siarhei Sabetski
 */
public interface IWorkItemTemplate extends Serializable {
    /**
     * Gets the value of Work Item.
     *
     * @return The value.
     */
    String getValue();

    /**
     * Sets the value of Work Item.
     *
     * @param value The value.
     */
    void setValue(String value);

    /**
     * Gets the type of Work Item.
     *
     * @return The type of Work Item.
     */
    String getType();

    /**
     * Sets the type of Work Item.
     *
     * @param type The type of Work Item.
     */
    void setType(String type);

    /**
     * Returns true if work item is required, false otherwise.
     *
     * @return True if work item is required, false otherwise.
     */
    Boolean isRequired();

    /**
     * Sets true if work item is required, false otherwise.
     *
     * @param required True if work item is required, false otherwise.
     */
    void setRequired(Boolean required);
}
