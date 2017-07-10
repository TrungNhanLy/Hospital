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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.pn.service.ClpSerializer;
import org.pn.service.DrugLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class DrugClp extends BaseModelImpl<Drug> implements Drug {
	public DrugClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Drug.class;
	}

	@Override
	public String getModelClassName() {
		return Drug.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id_drug;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_drug(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_drug;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_drug", getId_drug());
		attributes.put("name_medicine", getName_medicine());
		attributes.put("quantity", getQuantity());
		attributes.put("price", getPrice());
		attributes.put("expiration_date", getExpiration_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_drug = (Long)attributes.get("id_drug");

		if (id_drug != null) {
			setId_drug(id_drug);
		}

		String name_medicine = (String)attributes.get("name_medicine");

		if (name_medicine != null) {
			setName_medicine(name_medicine);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Date expiration_date = (Date)attributes.get("expiration_date");

		if (expiration_date != null) {
			setExpiration_date(expiration_date);
		}
	}

	@Override
	public long getId_drug() {
		return _id_drug;
	}

	@Override
	public void setId_drug(long id_drug) {
		_id_drug = id_drug;

		if (_drugRemoteModel != null) {
			try {
				Class<?> clazz = _drugRemoteModel.getClass();

				Method method = clazz.getMethod("setId_drug", long.class);

				method.invoke(_drugRemoteModel, id_drug);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName_medicine() {
		return _name_medicine;
	}

	@Override
	public void setName_medicine(String name_medicine) {
		_name_medicine = name_medicine;

		if (_drugRemoteModel != null) {
			try {
				Class<?> clazz = _drugRemoteModel.getClass();

				Method method = clazz.getMethod("setName_medicine", String.class);

				method.invoke(_drugRemoteModel, name_medicine);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		_quantity = quantity;

		if (_drugRemoteModel != null) {
			try {
				Class<?> clazz = _drugRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", int.class);

				method.invoke(_drugRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrice() {
		return _price;
	}

	@Override
	public void setPrice(String price) {
		_price = price;

		if (_drugRemoteModel != null) {
			try {
				Class<?> clazz = _drugRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", String.class);

				method.invoke(_drugRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExpiration_date() {
		return _expiration_date;
	}

	@Override
	public void setExpiration_date(Date expiration_date) {
		_expiration_date = expiration_date;

		if (_drugRemoteModel != null) {
			try {
				Class<?> clazz = _drugRemoteModel.getClass();

				Method method = clazz.getMethod("setExpiration_date", Date.class);

				method.invoke(_drugRemoteModel, expiration_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDrugRemoteModel() {
		return _drugRemoteModel;
	}

	public void setDrugRemoteModel(BaseModel<?> drugRemoteModel) {
		_drugRemoteModel = drugRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _drugRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_drugRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DrugLocalServiceUtil.addDrug(this);
		}
		else {
			DrugLocalServiceUtil.updateDrug(this);
		}
	}

	@Override
	public Drug toEscapedModel() {
		return (Drug)ProxyUtil.newProxyInstance(Drug.class.getClassLoader(),
			new Class[] { Drug.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DrugClp clone = new DrugClp();

		clone.setId_drug(getId_drug());
		clone.setName_medicine(getName_medicine());
		clone.setQuantity(getQuantity());
		clone.setPrice(getPrice());
		clone.setExpiration_date(getExpiration_date());

		return clone;
	}

	@Override
	public int compareTo(Drug drug) {
		long primaryKey = drug.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrugClp)) {
			return false;
		}

		DrugClp drug = (DrugClp)obj;

		long primaryKey = drug.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id_drug=");
		sb.append(getId_drug());
		sb.append(", name_medicine=");
		sb.append(getName_medicine());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", expiration_date=");
		sb.append(getExpiration_date());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Drug");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_drug</column-name><column-value><![CDATA[");
		sb.append(getId_drug());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name_medicine</column-name><column-value><![CDATA[");
		sb.append(getName_medicine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiration_date</column-name><column-value><![CDATA[");
		sb.append(getExpiration_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id_drug;
	private String _name_medicine;
	private int _quantity;
	private String _price;
	private Date _expiration_date;
	private BaseModel<?> _drugRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}