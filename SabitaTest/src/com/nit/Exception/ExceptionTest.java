package com.nit.Exception;

public class ExceptionTest extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionTest( String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
	
	public ExceptionTest( ) {
		// TODO Auto-generated constructor stub
	}

}
