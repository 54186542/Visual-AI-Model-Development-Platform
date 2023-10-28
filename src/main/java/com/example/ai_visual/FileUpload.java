package com.example.ai_visual;


import org.springframework.stereotype.Component;

@Component
public class FileUpload {
    private String filename;
    private String fileDirectory;
    private String filepath;
    public enum FILE_TYPE{
        IMAGE,CSV,EXCEL,TXT
    }
    private Enum<FILE_TYPE> fileType;
    private boolean fileStatus;
    

    public void uploadFile(){

    }
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(String fileDirectory) {
        this.fileDirectory = fileDirectory;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Enum<FILE_TYPE> getFileType() {
        return fileType;
    }

    public void setFileType(Enum<FILE_TYPE> fileType) {
        this.fileType = fileType;
    }

    public boolean isFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(boolean fileStatus) {
        this.fileStatus = fileStatus;
    }
}
