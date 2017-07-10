/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.pn.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author thuctap
 * @generated
 */
public class StaffsSoap implements Serializable {
	public static StaffsSoap toSoapModel(Staffs model) {
		StaffsSoap soapModel = new StaffsSoap();

		soapModel.setId_staff(model.getId_staff());
		soapModel.setName(model.getName());
		soapModel.setGender(model.getGender());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setPhonenumber(model.getPhonenumber());
		soapModel.setId_doctor(model.getId_doctor());

		return soapModel;
	}

	public static StaffsSoap[] toSoapModels(Staffs[] models) {
		StaffsSoap[] soapModels = new StaffsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StaffsSoap[][] toSoapModels(Staffs[][] models) {
		StaffsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StaffsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StaffsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StaffsSoap[] toSoapModels(List<Staffs> models) {
		List<StaffsSoap> soapModels = new ArrayList<StaffsSoap>(models.size());

		for (Staffs model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StaffsSoap[soapModels.size()]);
	}

	public StaffsSoap() {
	}

	public long getPrimaryKey() {
		return _id_staff;
	}

	public void setPrimaryKey(long pk) {
		setId_staff(pk);
	}

	public long getId_staff() {
		return _id_staff;
	}

	public void setId_staff(long id_staff) {
		_id_staff = id_staff;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getPhonenumber() {
		return _phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		_phonenumber = phonenumber;
	}

	public long getId_doctor() {
		return _id_doctor;
	}

	public void setId_doctor(long id_doctor) {
		_id_doctor = id_doctor;
	}

	private long _id_staff;
	private String _name;
	private String _gender;
	private String _department;
	private String _phonenumber;
	private long _id_doctor;
}