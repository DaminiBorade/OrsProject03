package in.co.rays.project3.exception;


/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 *
 * @author Damini
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 *
 */


public class ApplicationException extends Exception{
	public ApplicationException(String msg) {
        super(msg);
    }

}
