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
public class DrugSoap implements Serializable {
	public static DrugSoap toSoapModel(Drug model) {
		DrugSoap soapModel = new DrugSoap();

		soapModel.setId_drug(model.getId_drug());
		soapModel.setName_medicine(model.getName_medicine());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setPrice(model.getPrice());
		soapModel.setExpiration_date(model.getExpiration_date());

		return soapModel;
	}

	public static DrugSoap[] toSoapModels(Drug[] models) {
		DrugSoap[] soapModels = new DrugSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DrugSoap[][] toSoapModels(Drug[][] models) {
		DrugSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DrugSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DrugSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DrugSoap[] toSoapModels(List<Drug> models) {
		List<DrugSoap> soapModels = new ArrayList<DrugSoap>(models.size());

		for (Drug model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DrugSoap[soapModels.size()]);
	}

	public DrugSoap() {
	}

	public long getPrimaryKey() {
		return _id_drug;
	}

	public void setPrimaryKey(long pk) {
		setId_drug(pk);
	}

	public long getId_drug() {
		return _id_drug;
	}

	public void setId_drug(long id_drug) {
		_id_drug = id_drug;
	}

	public String getName_medicine() {
		return _name_medicine;
	}

	public void setName_medicine(String name_medicine) {
		_name_medicine = name_medicine;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	public String getPrice() {
		return _price;
	}

	public void setPrice(String price) {
		_price = price;
	}

	public Date getExpiration_date() {
		return _expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		_expiration_date = expiration_date;
	}

	private long _id_drug;
	private String _name_medicine;
	private int _quantity;
	private String _price;
	private Date _expiration_date;
}