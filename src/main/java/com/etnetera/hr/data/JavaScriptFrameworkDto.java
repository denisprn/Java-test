package com.etnetera.hr.data;

/**
 * Simple data entity describing basic properties of every JavaScript framework.
 *
 * @author Etnetera
 */
public class JavaScriptFrameworkDto {

    private Long id;
    private String name;
    private String version;
    private Integer hypeLevel;
    private String deprecationDate;

    public JavaScriptFrameworkDto() {
    }

    public JavaScriptFrameworkDto(String name) {
        this.name = name;
    }

    public JavaScriptFrameworkDto(String name, String version, Integer hypeLevel, String deprecationDate) {
        this.name = name;
        this.version = version;
        this.hypeLevel = hypeLevel;
        this.deprecationDate = deprecationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getHypeLevel() {
        return hypeLevel;
    }

    public void setHypeLevel(Integer hypeLevel) {
        this.hypeLevel = hypeLevel;
    }

    public String getDeprecationDate() {
        return deprecationDate;
    }

    public void setDeprecationDate(String deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    @Override
    public String toString() {
        return "JavaScriptFramework [id = " + id + ", name = " + name + ", version = " + version
                + ", hype level = " + hypeLevel + ", deprecation date = " + deprecationDate + "]";
    }
}
