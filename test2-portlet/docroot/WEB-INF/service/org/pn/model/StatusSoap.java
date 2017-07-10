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
public class StatusSoap implements Serializable {
	public static StatusSoap toSoapModel(Status model) {
		StatusSoap soapModel = new StatusSoap();

		soapModel.setStatus_no(model.getStatus_no());
		soapModel.setStatus_detail(model.getStatus_detail());
		soapModel.setId_patient(model.getId_patient());

		return soapModel;
	}

	public static StatusSoap[] toSoapModels(Status[] models) {
		StatusSoap[] soapModels = new StatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatusSoap[][] toSoapModels(Status[][] models) {
		StatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatusSoap[] toSoapModels(List<Status> models) {
		List<StatusSoap> soapModels = new ArrayList<StatusSoap>(models.size());

		for (Status model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatusSoap[soapModels.size()]);
	}

	public StatusSoap() {
	}

	public long getPrimaryKey() {
		return _status_no;
	}

	public void setPrimaryKey(long pk) {
		setStatus_no(pk);
	}

	public long getStatus_no() {
		return _status_no;
	}

	public void setStatus_no(long status_no) {
		_status_no = status_no;
	}

	public String getStatus_detail() {
		return _status_detail;
	}

	public void setStatus_detail(String status_detail) {
		_status_detail = status_detail;
	}

	public long getId_patient() {
		return _id_patient;
	}

	public void setId_patient(long id_patient) {
		_id_patient = id_patient;
	}

	private long _status_no;
	private String _status_detail;
	private long _id_patient;
}