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
public class RoomPatientSoap implements Serializable {
	public static RoomPatientSoap toSoapModel(RoomPatient model) {
		RoomPatientSoap soapModel = new RoomPatientSoap();

		soapModel.setRoom_no(model.getRoom_no());
		soapModel.setStatus(model.getStatus());
		soapModel.setId_patient(model.getId_patient());

		return soapModel;
	}

	public static RoomPatientSoap[] toSoapModels(RoomPatient[] models) {
		RoomPatientSoap[] soapModels = new RoomPatientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomPatientSoap[][] toSoapModels(RoomPatient[][] models) {
		RoomPatientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomPatientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomPatientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomPatientSoap[] toSoapModels(List<RoomPatient> models) {
		List<RoomPatientSoap> soapModels = new ArrayList<RoomPatientSoap>(models.size());

		for (RoomPatient model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomPatientSoap[soapModels.size()]);
	}

	public RoomPatientSoap() {
	}

	public long getPrimaryKey() {
		return _room_no;
	}

	public void setPrimaryKey(long pk) {
		setRoom_no(pk);
	}

	public long getRoom_no() {
		return _room_no;
	}

	public void setRoom_no(long room_no) {
		_room_no = room_no;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public long getId_patient() {
		return _id_patient;
	}

	public void setId_patient(long id_patient) {
		_id_patient = id_patient;
	}

	private long _room_no;
	private String _status;
	private long _id_patient;
}