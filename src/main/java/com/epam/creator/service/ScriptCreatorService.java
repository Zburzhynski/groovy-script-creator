package com.epam.creator.service;

import com.epam.creator.domain.DocPathRecord;
import com.epam.creator.domain.FilePathRecord;
import com.epam.creator.domain.WorkFileDocumentRecord;
import com.epam.creator.template.IWorkItemTemplate;
import com.epam.creator.template.IWorkTemplate;
import com.epam.creator.template.MappingHelper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class which allows to create file_path, doc_path, mapper, loader_mapper
 * groovy scripts.
 * <p/>
 * Copyright (C) 2012 copyright.com
 * <p/>
 * Date: May 7, 2012
 *
 * @author Uladzimir Zburzhynski
 */
public class ScriptCreatorService {

    /**
     * Loader uid for creating loader_mapper.groovy script.
     */
    private static final String LOADER_UID = "c0587fa6-5278-4b52-a8b5-b05db0320304";

    /**
     * Password for connecting to database.
     */
    private static final String PASSWORD = "***";

    /**
     * Url for connecting to database.
     */
    private static final String URL = "jdbc:postgresql:works";

    /**
     * User name for connecting to database.
     */
    private static final String USERNAME = "works";

    /**
     * Connection to database, which contain FilePath, DocPath.
     */
    private final Connection connection;

    /**
     * List of DocPathRecord objects.
     */
    private List<DocPathRecord> docPathScript;

    /**
     * List of FilePathRecord objects.
     */
    private List<FilePathRecord> filePathScript;

    /**
     * List of WorkFileDocumentRecord objects.
     */
    private List<WorkFileDocumentRecord> mapperScript;

    /**
     * Writer for creating groovy scripts.
     */
    private BufferedWriter writer;

    /**
     * Default constructor.
     *
     * @throws Exception if any.
     */
    public ScriptCreatorService() throws Exception {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    /**
     * Creates doc_path.groovy script.
     *
     * @throws Exception if any.
     */
    public void createDocPathScript() throws Exception {
        writer = new BufferedWriter(new FileWriter("build/doc_path_script.txt"));
        for (DocPathRecord record : docPathScript) {
            writer.write("insert(tableName: 'doc_path') {");
            writer.newLine();
            writer.write("    column(name: 'doc_path_uid', value: '" + record.getDocPathUID()
                + "')");
            writer.newLine();
            writer
                .write("    column(name: 'doc_path_value', value: '" + record.getDocPath() + "')");
            writer.newLine();
            writer.write("    column(name: 'record_version', value: " + record.getRecordVersion()
                + ")");
            writer.newLine();
            writer.write("    column(name: 'created_by_user', value: '" + record.getCreatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'created_datetime', valueDate: '"
                + record.getCreatedDateTime() + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_by_user', value: '" + record.getUpdatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_datetime', valueDate: '"
                + record.getUpdatedDateTime() + "')");
            writer.newLine();
            writer.write("}");
            writer.newLine();
        }
        writer.newLine();
        writer.write("Number of records:" + docPathScript.size());
        writer.close();
        System.out.println("Creating doc path script done.");
    }

    /**
     * Creates file_path.groovy script.
     *
     * @throws Exception if any.
     */
    public void createFilePathScript() throws Exception {
        writer = new BufferedWriter(new FileWriter("build/file_path_script.txt"));
        for (FilePathRecord record : filePathScript) {
            writer.write("insert(tableName: 'file_path') {");
            writer.newLine();
            writer.write("    column(name: 'file_path_uid', value: '" + record.getFilePathUID()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'file_path_value', value: '" + record.getFilePath()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'record_version', value: " + record.getRecordVersion()
                + ")");
            writer.newLine();
            writer.write("    column(name: 'created_by_user', value: '" + record.getCreatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'created_datetime', valueDate: '"
                + record.getCreatedDateTime() + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_by_user', value: '" + record.getUpdatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_datetime', valueDate: '"
                + record.getUpdatedDateTime() + "')");
            writer.newLine();
            writer.write("}");
            writer.newLine();
        }
        writer.newLine();
        writer.write("Number of records:" + filePathScript.size());
        writer.close();
        System.out.println("Creating file path script done.");
    }

    /**
     * Creates loader_mapper.groovy script.
     *
     * @throws Exception if any.
     */
    public void createLoaderMapperScript() throws Exception {
        writer = new BufferedWriter(new FileWriter("build/loader_mapper_script.txt"));
        for (WorkFileDocumentRecord record : mapperScript) {
            writer.write("insert(tableName: 'loader_mapper') {");
            writer.newLine();
            writer.write("    column(name: 'loader_uid', value: '" + LOADER_UID + "')");
            writer.newLine();
            writer.write("    column(name: 'mapper_uid', value: '"
                + record.getWorkFileDocumentUID() + "')");
            writer.newLine();
            writer.write("    column(name: 'record_version', value: " + record.getRecordVersion()
                + ")");
            writer.newLine();
            writer.write("    column(name: 'created_by_user', value: '" + record.getCreatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'created_datetime', valueDate: '"
                + record.getCreatedDateTime() + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_by_user', value: '" + record.getUpdatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_datetime', valueDate: '"
                + record.getUpdatedDateTime() + "')");
            writer.newLine();
            writer.write("}");
            writer.newLine();
        }
        writer.newLine();
        writer.write("Number of records:" + mapperScript.size());
        writer.close();
        System.out.println("Creating loader mapper script done.");
    }

    /**
     * Creates mapper.groovy script.
     *
     * @throws Exception if any.
     */
    public void createMapperScript() throws Exception {
        writer = new BufferedWriter(new FileWriter("build/mapper_script.txt"));
        for (WorkFileDocumentRecord record : mapperScript) {
            writer.write("insert(tableName: 'mapper') {");
            writer.newLine();
            writer.write("    column(name: 'mapper_uid', value: '"
                + record.getWorkFileDocumentUID() + "')");
            writer.newLine();
            writer.write("    column(name: 'doc_path_uid', value: '" + record.getDocPathUID()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'file_path_uid', value: '" + record.getFilePathUID()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'record_version', value: " + record.getRecordVersion()
                + ")");
            writer.newLine();
            writer.write("    column(name: 'created_by_user', value: '" + record.getCreatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'created_datetime', valueDate: '"
                + record.getCreatedDateTime() + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_by_user', value: '" + record.getUpdatedByUser()
                + "')");
            writer.newLine();
            writer.write("    column(name: 'updated_datetime', valueDate: '"
                + record.getUpdatedDateTime() + "')");
            writer.newLine();
            writer.write("}");
            writer.newLine();
        }
        writer.newLine();
        writer.write("Number of records:" + mapperScript.size());
        writer.close();
        System.out.println("Creating file document script done.");
    }

    /**
     * Create all necessary groovy scripts, for adding data into database.
     *
     * @throws Exception if any.
     */
    public void createScripts() throws Exception {
        process();
        createFilePathScript();
        createDocPathScript();
        createMapperScript();
        createLoaderMapperScript();
    }

    /**
     * Gets document path by doc path name.
     *
     * @param docPath name of doc path.
     * @return doc path uid.
     * @throws Exception if any.
     */
    private String getDocPathUUIDByName(String docPath) throws Exception {
        for (DocPathRecord record : docPathScript) {
            if (record.getDocPath().equals(docPath))
                return record.getDocPathUID();
        }
        String sql = "SELECT doc_path_uid FROM public.doc_path WHERE doc_path_value=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, docPath);
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            return result.getString("doc_path_uid");
        }
        return null;
    }

    /**
     * Gets file path uid by file path name.
     *
     * @param filePath name of file path.
     * @return file path uid.
     * @throws Exception if any.
     */
    private String getFilePathUUIDByName(String filePath) throws Exception {
        for (FilePathRecord record : filePathScript) {
            if (record.getFilePath().equals(filePath))
                return record.getFilePathUID();
        }
        String sql = "SELECT file_path_uid FROM public.file_path WHERE file_path_value=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, filePath);
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            return result.getString("file_path_uid");
        }
        return null;
    }

    /**
     * Process WorkTemplate and gets FilePath, DocPath and WorkFileDocument
     * object.
     *
     * @throws Exception if any.
     */
    private void process() throws Exception {
        filePathScript = new ArrayList<>();
        docPathScript = new ArrayList<>();
        mapperScript = new ArrayList<>();

        IWorkTemplate workTemplate = MappingHelper.buildCustomOnixTemplate();
        for (Map.Entry<String, List<IWorkItemTemplate>> entry : workTemplate
            .getWorkItemTemplateValues().entrySet()) {

            for (IWorkItemTemplate itemTemplate : entry.getValue()) {

                String filePath = entry.getKey();
                String docPath = itemTemplate.getValue();
                boolean requiredFlag = itemTemplate.isRequired();

                WorkFileDocumentRecord workFileDocumentRecord = new WorkFileDocumentRecord();

                String filePathUUID = getFilePathUUIDByName(filePath);
                if (filePathUUID == null) {
                    FilePathRecord filePathRecord = new FilePathRecord();
                    filePathRecord.setFilePath(filePath);
                    filePathScript.add(filePathRecord);
                    workFileDocumentRecord.setFilePathUID(filePathRecord.getFilePathUID());
                } else {
                    workFileDocumentRecord.setFilePathUID(filePathUUID);
                }

                String docPathUUID = getDocPathUUIDByName(docPath);
                if (docPathUUID == null) {
                    DocPathRecord docPathRecord = new DocPathRecord();
                    docPathRecord.setDocPath(docPath);
                    docPathScript.add(docPathRecord);
                    workFileDocumentRecord.setDocPathUID(docPathRecord.getDocPathUID());
                } else {
                    workFileDocumentRecord.setDocPathUID(docPathUUID);
                }

                workFileDocumentRecord.setRequiredFlag(new Boolean(requiredFlag).toString());
                mapperScript.add(workFileDocumentRecord);
            }
        }
    }

}
