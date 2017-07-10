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
public class BillsSoap implements Serializable {
	public static BillsSoap toSoapModel(Bills model) {
		BillsSoap soapModel = new BillsSoap();

		soapModel.setBill_no(model.getBill_no());
		soapModel.setPatient_name(model.getPatient_name());
		soapModel.setDoctor_name(model.getDoctor_name());
		soapModel.setBill_date(model.getBill_date());
		soapModel.setAmount(model.getAmount());
		soapModel.setId_patient(model.getId_patient());

		return soapModel;
	}

	public static BillsSoap[] toSoapModels(Bills[] models) {
		BillsSoap[] soapModels = new BillsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BillsSoap[][] toSoapModels(Bills[][] models) {
		BillsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BillsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BillsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BillsSoap[] toSoapModels(List<Bills> models) {
		List<BillsSoap> soapModels = new ArrayList<BillsSoap>(models.size());

		for (Bills model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BillsSoap[soapModels.size()]);
	}

	public BillsSoap() {
	}

	public long getPrimaryKey() {
		return _bill_no;
	}

	public void setPrimaryKey(long pk) {
		setBill_no(pk);
	}

	public long getBill_no() {
		return _bill_no;
	}

	public void setBill_no(long bill_no) {
		_bill_no = bill_no;
	}

	public String getPatient_name() {
		return _patient_name;
	}

	public void setPatient_name(String patient_name) {
		_patient_name = patient_name;
	}

	public String getDoctor_name() {
		return _doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		_doctor_name = doctor_name;
	}

	public Date getBill_date() {
		return _bill_date;
	}

	public void setBill_date(Date bill_date) {
		_bill_date = bill_date;
	}

	public int getAmount() {
		return _amount;
	}

	public void setAmount(int amount) {
		_amount = amount;
	}

	public long getId_patient() {
		return _id_patient;
	}

	public void setId_patient(long id_patient) {
		_id_patient = id_patient;
	}

	private long _bill_no;
	private String _patient_name;
	private String _doctor_name;
	private Date _bill_date;
	private int _amount;
	private long _id_patient;
}