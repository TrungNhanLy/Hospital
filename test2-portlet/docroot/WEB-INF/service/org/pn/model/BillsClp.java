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

import org.pn.service.BillsLocalServiceUtil;
import org.pn.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class BillsClp extends BaseModelImpl<Bills> implements Bills {
	public BillsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Bills.class;
	}

	@Override
	public String getModelClassName() {
		return Bills.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _bill_no;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBill_no(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bill_no;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bill_no", getBill_no());
		attributes.put("patient_name", getPatient_name());
		attributes.put("doctor_name", getDoctor_name());
		attributes.put("bill_date", getBill_date());
		attributes.put("amount", getAmount());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bill_no = (Long)attributes.get("bill_no");

		if (bill_no != null) {
			setBill_no(bill_no);
		}

		String patient_name = (String)attributes.get("patient_name");

		if (patient_name != null) {
			setPatient_name(patient_name);
		}

		String doctor_name = (String)attributes.get("doctor_name");

		if (doctor_name != null) {
			setDoctor_name(doctor_name);
		}

		Date bill_date = (Date)attributes.get("bill_date");

		if (bill_date != null) {
			setBill_date(bill_date);
		}

		Integer amount = (Integer)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	@Override
	public long getBill_no() {
		return _bill_no;
	}

	@Override
	public void setBill_no(long bill_no) {
		_bill_no = bill_no;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setBill_no", long.class);

				method.invoke(_billsRemoteModel, bill_no);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPatient_name() {
		return _patient_name;
	}

	@Override
	public void setPatient_name(String patient_name) {
		_patient_name = patient_name;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setPatient_name", String.class);

				method.invoke(_billsRemoteModel, patient_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoctor_name() {
		return _doctor_name;
	}

	@Override
	public void setDoctor_name(String doctor_name) {
		_doctor_name = doctor_name;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctor_name", String.class);

				method.invoke(_billsRemoteModel, doctor_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBill_date() {
		return _bill_date;
	}

	@Override
	public void setBill_date(Date bill_date) {
		_bill_date = bill_date;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setBill_date", Date.class);

				method.invoke(_billsRemoteModel, bill_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(int amount) {
		_amount = amount;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", int.class);

				method.invoke(_billsRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId_patient() {
		return _id_patient;
	}

	@Override
	public void setId_patient(long id_patient) {
		_id_patient = id_patient;

		if (_billsRemoteModel != null) {
			try {
				Class<?> clazz = _billsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_patient", long.class);

				method.invoke(_billsRemoteModel, id_patient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBillsRemoteModel() {
		return _billsRemoteModel;
	}

	public void setBillsRemoteModel(BaseModel<?> billsRemoteModel) {
		_billsRemoteModel = billsRemoteModel;
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

		Class<?> remoteModelClass = _billsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_billsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BillsLocalServiceUtil.addBills(this);
		}
		else {
			BillsLocalServiceUtil.updateBills(this);
		}
	}

	@Override
	public Bills toEscapedModel() {
		return (Bills)ProxyUtil.newProxyInstance(Bills.class.getClassLoader(),
			new Class[] { Bills.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BillsClp clone = new BillsClp();

		clone.setBill_no(getBill_no());
		clone.setPatient_name(getPatient_name());
		clone.setDoctor_name(getDoctor_name());
		clone.setBill_date(getBill_date());
		clone.setAmount(getAmount());
		clone.setId_patient(getId_patient());

		return clone;
	}

	@Override
	public int compareTo(Bills bills) {
		long primaryKey = bills.getPrimaryKey();

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

		if (!(obj instanceof BillsClp)) {
			return false;
		}

		BillsClp bills = (BillsClp)obj;

		long primaryKey = bills.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{bill_no=");
		sb.append(getBill_no());
		sb.append(", patient_name=");
		sb.append(getPatient_name());
		sb.append(", doctor_name=");
		sb.append(getDoctor_name());
		sb.append(", bill_date=");
		sb.append(getBill_date());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", id_patient=");
		sb.append(getId_patient());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Bills");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bill_no</column-name><column-value><![CDATA[");
		sb.append(getBill_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>patient_name</column-name><column-value><![CDATA[");
		sb.append(getPatient_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctor_name</column-name><column-value><![CDATA[");
		sb.append(getDoctor_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bill_date</column-name><column-value><![CDATA[");
		sb.append(getBill_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_patient</column-name><column-value><![CDATA[");
		sb.append(getId_patient());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _bill_no;
	private String _patient_name;
	private String _doctor_name;
	private Date _bill_date;
	private int _amount;
	private long _id_patient;
	private BaseModel<?> _billsRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}