package com.employee.mail;

import java.util.ArrayList;
import com.employee.model.bloodmodel;

public interface bloodDAO {
	
	ArrayList<bloodmodel> blood(String BloodGroup) throws Exception;
	
	

}
