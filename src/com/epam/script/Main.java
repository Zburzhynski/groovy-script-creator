package com.epam.script;

import com.epam.script.service.ScriptCreator;

/**
 * Main class for launching application.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: Jun 27, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class Main {

    /**
     * For creating groovy scripts you must perform the following steps:
     * 1. Add you add WorkTemplate for necessary format into MappingHelper object.
     * 2. Change method process of ScriptCreator class, line 98 and change "PASSWORD" constant.
     * 3. Invoke main method. All scripts will be created in the root of project.
     * 4. Copy-past it into you grovvy scripts.
     * 4. Enjoy.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) throws Exception {
        ScriptCreator creator = new ScriptCreator();
        creator.createScripts();
    }

}
