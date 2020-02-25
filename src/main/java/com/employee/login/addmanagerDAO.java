package com.employee.login;

import com.employee.model.addman;

public interface addmanagerDAO {
	
	boolean addmanager(addman add) throws Exception;
    boolean login(String managerName,String passWord)throws Exception;
}
