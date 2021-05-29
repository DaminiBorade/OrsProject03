package in.co.rays.project3.dto;

/**
 * role Marksheet DTO classes
 *
 * @author  Damini
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 *
 */
import java.sql.Timestamp;

public class RoleDTO  extends BaseDTO implements DropdownList{
	 /**
     * Predefined Role constants
     */
    public static final int ADMIN = 1;
    public static final int STUDENT = 2;
    public static final int COLLEGE_SCHOOL = 3;
    public static final int KIOSK = 4;

    /**
     * Role Name
     */

    private String Name;

    /**
     * Role Description
     */
    private String Description;
    

    /**
     * accessor
     */

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

	public String getkey() {
		// TODO Auto-generated method stub
		return id + "";
	}

	public String getvalue() {
		// TODO Auto-generated method stub
		return Name;
	}

	
	


   
}
