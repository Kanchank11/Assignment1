package com.te.hibernate.jpql;
@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{

	String msg ;

	public IdNotFoundException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}

