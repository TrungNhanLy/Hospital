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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author thuctap
 * @generated
 */
public class DiagnosisSoap implements Serializable {
	public static DiagnosisSoap toSoapModel(Diagnosis model) {
		DiagnosisSoap soapModel = new DiagnosisSoap();

		soapModel.setDiagnosis_no(model.getDiagnosis_no());
		soapModel.setDetail(model.getDetail());
		soapModel.setRemak(model.getRemak());
		soapModel.setDiagnosis_date(model.getDiagnosis_date());
		soapModel.setId_patient(model.getId_patient());

		return soapModel;
	}

	public static DiagnosisSoap[] toSoapModels(Diagnosis[] models) {
		DiagnosisSoap[] soapModels = new DiagnosisSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DiagnosisSoap[][] toSoapModels(Diagnosis[][] models) {
		DiagnosisSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DiagnosisSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DiagnosisSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DiagnosisSoap[] toSoapModels(List<Diagnosis> models) {
		List<DiagnosisSoap> soapModels = new ArrayList<DiagnosisSoap>(models.size());

		for (Diagnosis model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DiagnosisSoap[soapModels.size()]);
	}

	public DiagnosisSoap() {
	}

	public long getPrimaryKey() {
		return _diagnosis_no;
	}

	public void setPrimaryKey(long pk) {
		setDiagnosis_no(pk);
	}

	public long getDiagnosis_no() {
		return _diagnosis_no;
	}

	public void setDiagnosis_no(long diagnosis_no) {
		_diagnosis_no = diagnosis_no;
	}

	public String getDetail() {
		return _detail;
	}

	public void setDetail(String detail) {
		_detail = detail;
	}

	public String getRemak() {
		return _remak;
	}

	public void setRemak(String remak) {
		_remak = remak;
	}

	public Date getDiagnosis_date() {
		return _diagnosis_date;
	}

	public void setDiagnosis_date(Date diagnosis_date) {
		_diagnosis_date = diagnosis_date;
	}

	public long getId_patient() {
		return _id_patient;
	}

	public void setId_patient(long id_patient) {
		_id_patient = id_patient;
	}

	private long _diagnosis_no;
	private String _detail;
	private String _remak;
	private Date _diagnosis_date;
	private long _id_patient;
}