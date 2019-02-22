package com.accp.exception;

public class MyException extends RuntimeException {
	
	private String excode;
	
	private String exmsg;
	
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	

	public MyException(String exmsg) {
		super(exmsg);
		this.exmsg = exmsg;
	}

	public MyException(String excode, String exmsg) {
		super();
		this.excode = excode;
		this.exmsg = exmsg;
	}




	public String getExcode() {
		return excode;
	}

	public void setExcode(String excode) {
		this.excode = excode;
	}

	public String getExmsg() {
		return exmsg;
	}

	public void setExmsg(String exmsg) {
		this.exmsg = exmsg;
	}
	
	

}
