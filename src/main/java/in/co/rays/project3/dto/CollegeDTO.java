package in.co.rays.project3.dto;

import java.sql.Timestamp;

/**
 * Collage DTO classes
 *
 * @author Damini
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 *
 */


public class CollegeDTO extends BaseDTO implements DropdownList {
	
	
	

	     /**
	     * Name of College
	     */
//	    private String name;
//	    /**
//	     * Address of College
	    
	    private String address;
	    /**
	     * State of College
	     */
	    private String state;
	    /**
	     * City of College
	     */
	    private String city;
	    /**
	     * Phoneno of College
	     */
	    private String phoneNo;

	    private String CollegeName;
	    
	    
	    
	    /**
	     * accessor
	     */
//	    public String getName() {
//	        return name;
//	    }
//
//	    public void setName(String name) {
//	        this.name = name;
//	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getPhoneNo() {
	        return phoneNo;
	    }

	    public void setPhoneNo(String phoneNo) {
	        this.phoneNo = phoneNo;
	    }

		public String getCollegeName() {
			return CollegeName;
		}

		public void setCollegeName(String CollegeName) {
			this.CollegeName = CollegeName;
		}

		

	    public String getkey() {
	        return id + "";
	    }

	    public String getvalue() {
	        return CollegeName;
	    }

		
	}



