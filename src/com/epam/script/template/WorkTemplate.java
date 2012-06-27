package com.epam.script.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of {@link IWorkTemplate} interface.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: 4/19/12
 *
 * @author Siarhei Sabetski
 */
public class WorkTemplate implements IWorkTemplate {

    /**
     * MAp with work item templates.
     */
    private Map<String, List<IWorkItemTemplate>> workItemTemplateValues;

    /**
     * {@inheritDoc}
     */
    public Map<String, List<IWorkItemTemplate>> getWorkItemTemplateValues() {
        return workItemTemplateValues;
    }

    /**
     * {@inheritDoc}
     */
    public void setWorkItemTemplateValues(Map<String, List<IWorkItemTemplate>>
                                                  workItemTemplateValues) {
        this.workItemTemplateValues = workItemTemplateValues;
    }

    /**
     * {@inheritDoc}
     */
    public void addWorkItemTemplate(String key, IWorkItemTemplate workItemTemplate) {
        if (null == workItemTemplateValues) {
            workItemTemplateValues = new HashMap<>();
        }
        if (null != key && null != workItemTemplate) {
            if (null == workItemTemplateValues.get(key)) {
                workItemTemplateValues.put(key, new ArrayList<IWorkItemTemplate>());
            }
            workItemTemplateValues.get(key).add(workItemTemplate);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void addWorkItemTemplate(String key, String value, String type, Boolean required) {
        IWorkItemTemplate workItemTemplate = new WorkItemTemplate();
        workItemTemplate.setValue(value);
        workItemTemplate.setType(type);
        workItemTemplate.setRequired(required);
        addWorkItemTemplate(key, workItemTemplate);
    }

}
