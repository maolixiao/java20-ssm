package com.accp.domain;

import java.util.List;

public class Clazz {
    private Integer id;

    private String name;
    
    private List<Student> stuList;
    
    

    public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
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
}