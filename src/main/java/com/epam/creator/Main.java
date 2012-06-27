package com.epam.creator;

import com.epam.creator.service.ScriptCreatorService;

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
     * 2. Change method process of ScriptCreator class, line 98,change "PASSWORD",
     * "LOADER_UID" constants.
     * 3. Invoke main method. All scripts will be created in the root of project
     * with a corresponding names
     * 4. Copy-past it into you grovvy scripts.
     * 5. Enjoy.
     *
     * @param args command line arguments.
     * @throws Exception if any.
     */
    public static void main(String[] args) throws Exception {
        ScriptCreatorService creator = new ScriptCreatorService();
        creator.createScripts();
    }

}
