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
public class DoctorsSoap implements Serializable {
	public static DoctorsSoap toSoapModel(Doctors model) {
		DoctorsSoap soapModel = new DoctorsSoap();

		soapModel.setId_doctor(model.getId_doctor());
		soapModel.setName(model.getName());
		soapModel.setAddress(model.getAddress());
		soapModel.setPosition(model.getPosition());
		soapModel.setGender(model.getGender());

		return soapModel;
	}

	public static DoctorsSoap[] toSoapModels(Doctors[] models) {
		DoctorsSoap[] soapModels = new DoctorsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DoctorsSoap[][] toSoapModels(Doctors[][] models) {
		DoctorsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DoctorsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DoctorsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DoctorsSoap[] toSoapModels(List<Doctors> models) {
		List<DoctorsSoap> soapModels = new ArrayList<DoctorsSoap>(models.size());

		for (Doctors model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DoctorsSoap[soapModels.size()]);
	}

	public DoctorsSoap() {
	}

	public long getPrimaryKey() {
		return _id_doctor;
	}

	public void setPrimaryKey(long pk) {
		setId_doctor(pk);
	}

	public long getId_doctor() {
		return _id_doctor;
	}

	public void setId_doctor(long id_doctor) {
		_id_doctor = id_doctor;
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

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	private long _id_doctor;
	private String _name;
	private String _address;
	private String _position;
	private String _gender;
}