package com.mapping.hibernate_many_to_one_mapping.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mapping.hibernate_many_to_one_mapping.dao.CollegeUniversittyDao;
import com.mapping.hibernate_many_to_one_mapping.dto.College;
import com.mapping.hibernate_many_to_one_mapping.dto.University;

public class InsertCollegeUniversitesController {

	public static void main(String[] args) {
		
		// ------ FOR COLLEGE AND UNIVERSITY SAVE DATA -----
		
		/*
		 CollegeUniversittyDao collegeUniversittyDao = new CollegeUniversittyDao();
		

		
		//University university = new University(123, "RGVP", "MadhyaPradesh");

		// College college1 = new College(420 ,"LNCT" ,"Engineerinng","lnct@gmail.com",
		// "Bhopal", university) ;
//College college2 = new College(421, "TIT", "Engineerinng", "Tit@gmail.com", "Bhopal", university);
      List<College> colleges = new ArrayList<College>(Arrays.asList(college1, college2));

		collegeUniversittyDao.saveCollegeUniversityDao(colleges, university);
		
		
		*/
		
		
		// ----- FOR COLLAGE ADD ---------------------------------------
		
		CollegeUniversittyDao collegeUniversittyDao = new CollegeUniversittyDao();
		University university = new University(123, "RGVP", "MadhyaPradesh");


		
        College college1 = new College(422 ,"IPS" ,"Engineerinng","ips@gmail.com", "Indore" ,university) ;
		


		List<College> colleges = new ArrayList<College>(Arrays.asList(college1));

		collegeUniversittyDao.saveCollegeyDao(colleges, 123);
		
		

		/*

		//colleege ID Delete Code 
		CollegeUniversittyDao collegeUniversittyDao = new CollegeUniversittyDao();

		boolean  b = collegeUniversittyDao.deleteCollegeById(427) ;
		
		 String msg = b ? "College deleted successfully." : "Failed to delete college ";
	        System.out.println(msg);
	        */		

	
		

	}

	
}
