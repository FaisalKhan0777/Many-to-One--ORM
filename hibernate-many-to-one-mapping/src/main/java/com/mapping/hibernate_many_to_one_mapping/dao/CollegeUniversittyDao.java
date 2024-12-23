package com.mapping.hibernate_many_to_one_mapping.dao;

import java.util.List;

import com.mapping.hibernate_many_to_one_mapping.dto.College;
import com.mapping.hibernate_many_to_one_mapping.dto.University;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CollegeUniversittyDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et = em.getTransaction();

	
	// SAVE COLLEGES AND UNIVERSITY 
	public  List<College> saveCollegeUniversityDao(List<College> colleges, University university) {

		try {

			et.begin();
			em.persist(university);
			for (College college : colleges)
			{
				em.persist(college);
			}
			et.commit();
			return colleges;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}
	

	
	// SAVE COLLEGES 
	public  List<College> saveCollegeyDao(List<College> colleges, int universityId) {

		try {

			University university = em.find(University.class, universityId) ;
			
			if(university!=null)
			{
				et.begin();
				for (College college : colleges)
				{
		            em.remove(college);
					em.persist(college);
				}
				et.commit();
				return colleges;
			}
			else
			{
				
				System.out.println("University ID Is not Present ");
				return null ;
				
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}
	
	
	
	// DELETE COLLEGE 
	   public boolean deleteCollegeById(int collegeId) {
	    try {
	        College college = em.find(College.class, collegeId);

	        if (college != null) {
	            et.begin();
	            em.remove(college);
	            et.commit();
	            return true;
	        } else {
	            System.out.println("College ID not found");
	            return false;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	

}
