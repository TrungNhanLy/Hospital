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
public class PatientsSoap implements Serializable {
	public static PatientsSoap toSoapModel(Patients model) {
		PatientsSoap soapModel = new PatientsSoap();

		soapModel.setId_patient(model.getId_patient());
		soapModel.setName(model.getName());
		soapModel.setAddress(model.getAddress());
		soapModel.setPhonenumber(model.getPhonenumber());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setSymptoms(model.getSymptoms());
		soapModel.setGender(model.getGender());
		soapModel.setId_doctor(model.getId_doctor());

		return soapModel;
	}

	public static PatientsSoap[] toSoapModels(Patients[] models) {
		PatientsSoap[] soapModels = new PatientsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PatientsSoap[][] toSoapModels(Patients[][] models) {
		PatientsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PatientsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PatientsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PatientsSoap[] toSoapModels(List<Patients> models) {
		List<PatientsSoap> soapModels = new ArrayList<PatientsSoap>(models.size());

		for (Patients model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PatientsSoap[soapModels.size()]);
	}

	public PatientsSoap() {
	}

	public long getPrimaryKey() {
		return _id_patient;
	}

	public void setPrimaryKey(long pk) {
		setId_patient(pk);
	}

	public long getId_patient() {
		return _id_patient;
	}

	public void setId_patient(long id_patient) {
		_id_patient = id_patient;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhonenumber() {
		return _phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		_phonenumber = phonenumber;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getSymptoms() {
		return _symptoms;
	}

	public void setSymptoms(String symptoms) {
		_symptoms = symptoms;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public long getId_doctor() {
		return _id_doctor;
	}

	public void setId_doctor(long id_doctor) {
		_id_doctor = id_doctor;
	}

	private long _id_patient;
	private String _name;
	private String _address;
	private String _phonenumber;
	private String _department;
	private String _symptoms;
	private String _gender;
	private long _id_doctor;
}