package com.etnetera.hr.data;

import javax.persistence.*;

/**
 * Simple data entity describing basic properties of every JavaScript framework.
 *
 * @author Etnetera
 */
@Entity
public class JavaScriptFramework {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String version;

    @Column(nullable = false)
    private Integer hypeLevel;

    @Column(nullable = false, length = 30)
    private String deprecationDate;

    public JavaScriptFramework() {
    }

    public JavaScriptFramework(String name) {
        this.name = name;
    }

    public JavaScriptFramework(String name, String version, Integer hypeLevel, String deprecationDate) {
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
