package com.accp.domain;

import java.util.List;

public class Role {
    private Integer id;

    private String name;
    
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
}