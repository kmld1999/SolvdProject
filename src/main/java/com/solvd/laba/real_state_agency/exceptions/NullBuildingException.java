package com.solvd.laba.real_state_agency.exceptions;

public class NullBuildingException extends RuntimeException {
	public NullBuildingException(){
		super("No buildings avaible");
	}
}
