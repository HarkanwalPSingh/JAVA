package com.cg.payroll.daoServices;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate) throws SQLException;
	Associate findOne(int associateId) throws SQLException;
	ArrayList<Associate> findAll();
}
