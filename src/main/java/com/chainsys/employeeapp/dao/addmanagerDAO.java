package com.chainsys.employeeapp.dao;

import com.chainsys.employeeapp.model.manager;

public interface addmanagerDAO {
	
	boolean addmanager(manager add) throws Exception;
    boolean login(String managerName,String passWord)throws Exception;
}
