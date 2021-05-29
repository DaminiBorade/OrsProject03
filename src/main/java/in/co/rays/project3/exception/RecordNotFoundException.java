package in.co.rays.project3.exception;

/**
 * RecordNotFoundException thrown when a record not found occurred
 *
 * @author Damini
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 *
 */



public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(String msg){
		super(msg);
	}

}
