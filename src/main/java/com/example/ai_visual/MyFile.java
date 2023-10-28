package com.example.ai_visual;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFile {
    private String filename;
    private MultipartFile file;

    public MyFile() {
    }

    public MyFile(String filename, MultipartFile file) {
        this.filename = filename;
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String downloadFile(String url){
        try {
            Pattern compile = Pattern.compile("\\.[\\w^\\d]+$");
            Matcher matcher = compile.matcher(this.file.getOriginalFilename());
            matcher.find();
            this.file.transferTo(new File(url+matcher.group()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "文件下载成功";
    }
}
