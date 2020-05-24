package com.example.demo.model;

import java.io.File;

public class UploadBean {
    private String token;
    private File file;
    private String name;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
