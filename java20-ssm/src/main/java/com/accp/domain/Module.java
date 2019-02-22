package com.accp.domain;

import java.util.List;

public class Module {
    private Integer id;

    private String name;

    private String url;

    private Integer parentid;

    private Integer catalog;

    private String enname;
    
    
    private List<Module> mlist;
    
    

    public List<Module> getMlist() {
		return mlist;
	}

	public void setMlist(List<Module> mlist) {
		this.mlist = mlist;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }
}