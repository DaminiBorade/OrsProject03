package in.co.rays.project3.model;





import java.util.List;

import in.co.rays.project3.dto.CollegeDTO;
import in.co.rays.project3.dto.CourseDTO;
import in.co.rays.project3.dto.SubjectDTO;
import in.co.rays.project3.exception.ApplicationException;
import in.co.rays.project3.exception.DatabaseException;
import in.co.rays.project3.exception.DuplicateRecordException;

/**
 * Data Access Object of Cousre
 * 
 *
 * @author Damini
 * @version 1.0
 * @Copyright (c) SUNRAYS Technologies
 */


public interface CourseModelInt {
	
	

	    /**
	     * Add a Course
	     *
	     * @param dto
	     * @throws ApplicationException
	     * @throws DuplicateRecordException
	     *             : throws when college already exists
	     */
	    public long add(CourseDTO dto) throws ApplicationException,
	            DuplicateRecordException;

	    /**
	     * Update a Course
	     *
	     * @param dto
	     * @throws ApplicationException
	     * @throws DuplicateRecordException
	     *             : if updated user record is already exist
	     */
	    public void update(CourseDTO dto) throws ApplicationException,
	            DuplicateRecordException;

	    /**
	     * Delete a Cousre
	     *
	     * @param dto
	     * @throws ApplicationException
	     */
	    public void delete(CourseDTO dto) throws ApplicationException;

	    /**
	     * Find Cousre by Name
	     *
	     * @param name
	     *            : get parameter
	     * @return dto
	     * @throws ApplicationException
	     */
	    public CourseDTO findByName(String name) throws ApplicationException;

	    /**
	     * Find Cousre by PK
	     *
	     * @param pk
	     *            : get parameter
	     * @return dto
	     * @throws ApplicationException
	     */
	    public CourseDTO findByPK(long pk) throws ApplicationException;

	    /**
	     * Search Cousre with pagination
	     *
	     * @return list : List of Faculty
	     * @param dto
	     *            : Search Parameters
	     * @param pageNo
	     *            : Current Page No.
	     * @param pageSize
	     *            : Size of Page
	     * @throws ApplicationException
	     */
	    public List search(CourseDTO dto, int pageNo, int pageSize)
	            throws ApplicationException;

	    /**
	     * Search Cousre
	     *
	     * @return list : List of Subject
	     * @param dto
	     *            : Search Parameters
	     * @throws ApplicationException
	     */
	    public List search(CourseDTO dto) throws ApplicationException;

	    /**
	     * Gets List of Cousre
	     *
	     * @return list : List of College
	     * @throws DatabaseException
	     */
	    public List list() throws ApplicationException;

	    /**
	     * get List of Cousre with pagination
	     *
	     * @return list : List of Faculty
	     * @param pageNo
	     *            : Current Page No.
	     * @param pageSize
	     *            : Size of Page
	     * @throws ApplicationException
	     */
	    public List list(int pageNo, int pageSize) throws ApplicationException;

	}



