package com.chainsys.employeeapp.dao;

import java.util.ArrayList;

import com.chainsys.employeeapp.model.bloodmodel;

public interface bloodDAO {
	
	ArrayList<bloodmodel> Findempbloodgrp(String BloodGroup) throws Exception;
	
	

}
