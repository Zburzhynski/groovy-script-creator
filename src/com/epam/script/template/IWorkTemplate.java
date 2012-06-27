package com.epam.script.template;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Represents the template for work document.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: 4/19/12
 *
 * @author Siarhei Sabetski
 */
public interface IWorkTemplate extends Serializable {

    /**
     * Returns the map of work item templates.
     *
     * @return The map of work item templates.
     */
    Map<String, List<IWorkItemTemplate>> getWorkItemTemplateValues();

    /**
     * Sets the work item templates values.
     *
     * @param workItemTemplateValues The map of work item templates.
     */
    void setWorkItemTemplateValues(Map<String, List<IWorkItemTemplate>> workItemTemplateValues);

    /**
     * Adds the work item template into work template.
     *
     * @param key              The key of work item templates.
     * @param workItemTemplate The work item template.
     */
    void addWorkItemTemplate(String key, IWorkItemTemplate workItemTemplate);

    /**
     * Creates and adds work item template into work template.
     *
     * @param key      The key of work item template.
     * @param value    The value of work item template.
     * @param type     The type of work item template.
     * @param required True if work item required.
     */
    void addWorkItemTemplate(String key, String value, String type, Boolean required);
}
