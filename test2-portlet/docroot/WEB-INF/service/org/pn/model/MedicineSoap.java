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
public class MedicineSoap implements Serializable {
	public static MedicineSoap toSoapModel(Medicine model) {
		MedicineSoap soapModel = new MedicineSoap();

		soapModel.setId_medicine(model.getId_medicine());
		soapModel.setBill_no(model.getBill_no());
		soapModel.setId_drug(model.getId_drug());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setRemark(model.getRemark());

		return soapModel;
	}

	public static MedicineSoap[] toSoapModels(Medicine[] models) {
		MedicineSoap[] soapModels = new MedicineSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MedicineSoap[][] toSoapModels(Medicine[][] models) {
		MedicineSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MedicineSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MedicineSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MedicineSoap[] toSoapModels(List<Medicine> models) {
		List<MedicineSoap> soapModels = new ArrayList<MedicineSoap>(models.size());

		for (Medicine model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MedicineSoap[soapModels.size()]);
	}

	public MedicineSoap() {
	}

	public long getPrimaryKey() {
		return _id_medicine;
	}

	public void setPrimaryKey(long pk) {
		setId_medicine(pk);
	}

	public long getId_medicine() {
		return _id_medicine;
	}

	public void setId_medicine(long id_medicine) {
		_id_medicine = id_medicine;
	}

	public long getBill_no() {
		return _bill_no;
	}

	public void setBill_no(long bill_no) {
		_bill_no = bill_no;
	}

	public long getId_drug() {
		return _id_drug;
	}

	public void setId_drug(long id_drug) {
		_id_drug = id_drug;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	private long _id_medicine;
	private long _bill_no;
	private long _id_drug;
	private int _quantity;
	private String _remark;
}