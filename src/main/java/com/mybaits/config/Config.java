package com.mybaits.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lenovo
 */

@Component
@ConfigurationProperties("config")
public class Config {

    /**
     * zip 包名称
     */
    private String zipName;
    /**
     * 包路径
     */
    private String packages;
    /**
     *  网址
     */
    private String mainPath;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 用户
     */
    private String author;
    /**
     * 邮箱
     */
    private String email;
    /**
     *  表
     */
    private String tablePrefix;

    private Map<String,String> columnToJava;

    public String getZipName() {
        return zipName;
    }

    public void setZipName(String zipName) {
        this.zipName = zipName;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getMainPath() {
        return mainPath;
    }

    public void setMainPath(String mainPath) {
        this.mainPath = mainPath;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public Map<String, String> getColumnToJava() {
        return columnToJava;
    }

    public void setColumnToJava(Map<String, String> columnToJava) {
        this.columnToJava = columnToJava;
    }
}
