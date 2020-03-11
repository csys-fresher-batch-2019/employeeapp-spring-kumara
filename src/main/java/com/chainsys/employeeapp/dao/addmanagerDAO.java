package com.chainsys.employeeapp.dao;

import com.chainsys.employeeapp.model.addman;

public interface addmanagerDAO {
	
	boolean addmanager(addman add) throws Exception;
    boolean login(String managerName,String passWord)throws Exception;
}
