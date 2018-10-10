package com.cg.payroll.daoServices;

import java.util.ArrayList;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate);
	Associate findOne(int associateId);
	ArrayList<Associate> findAll();
}
