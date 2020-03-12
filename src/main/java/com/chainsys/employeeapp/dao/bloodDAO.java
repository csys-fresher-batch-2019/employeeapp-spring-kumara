package com.chainsys.employeeapp.dao;

import java.util.ArrayList;

import com.chainsys.employeeapp.model.SearchBlood;

public interface bloodDAO {

	ArrayList<SearchBlood> Findempbloodgrp(String BloodGroup) throws Exception;

}
