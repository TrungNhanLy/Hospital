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
import org.pn.service.PatientsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class PatientsClp extends BaseModelImpl<Patients> implements Patients {
	public PatientsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Patients.class;
	}

	@Override
	public String getModelClassName() {
		return Patients.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id_patient;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_patient(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_patient;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_patient", getId_patient());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phonenumber", getPhonenumber());
		attributes.put("department", getDepartment());
		attributes.put("symptoms", getSymptoms());
		attributes.put("gender", getGender());
		attributes.put("id_doctor", getId_doctor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phonenumber = (String)attributes.get("phonenumber");

		if (phonenumber != null) {
			setPhonenumber(phonenumber);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String symptoms = (String)attributes.get("symptoms");

		if (symptoms != null) {
			setSymptoms(symptoms);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Long id_doctor = (Long)attributes.get("id_doctor");

		if (id_doctor != null) {
			setId_doctor(id_doctor);
		}
	}

	@Override
	public long getId_patient() {
		return _id_patient;
	}

	@Override
	public void setId_patient(long id_patient) {
		_id_patient = id_patient;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_patient", long.class);

				method.invoke(_patientsRemoteModel, id_patient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_patientsRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_patientsRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhonenumber() {
		return _phonenumber;
	}

	@Override
	public void setPhonenumber(String phonenumber) {
		_phonenumber = phonenumber;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setPhonenumber", String.class);

				method.invoke(_patientsRemoteModel, phonenumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDepartment() {
		return _department;
	}

	@Override
	public void setDepartment(String department) {
		_department = department;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartment", String.class);

				method.invoke(_patientsRemoteModel, department);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSymptoms() {
		return _symptoms;
	}

	@Override
	public void setSymptoms(String symptoms) {
		_symptoms = symptoms;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setSymptoms", String.class);

				method.invoke(_patientsRemoteModel, symptoms);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_patientsRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId_doctor() {
		return _id_doctor;
	}

	@Override
	public void setId_doctor(long id_doctor) {
		_id_doctor = id_doctor;

		if (_patientsRemoteModel != null) {
			try {
				Class<?> clazz = _patientsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_doctor", long.class);

				method.invoke(_patientsRemoteModel, id_doctor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPatientsRemoteModel() {
		return _patientsRemoteModel;
	}

	public void setPatientsRemoteModel(BaseModel<?> patientsRemoteModel) {
		_patientsRemoteModel = patientsRemoteModel;
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

		Class<?> remoteModelClass = _patientsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_patientsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PatientsLocalServiceUtil.addPatients(this);
		}
		else {
			PatientsLocalServiceUtil.updatePatients(this);
		}
	}

	@Override
	public Patients toEscapedModel() {
		return (Patients)ProxyUtil.newProxyInstance(Patients.class.getClassLoader(),
			new Class[] { Patients.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PatientsClp clone = new PatientsClp();

		clone.setId_patient(getId_patient());
		clone.setName(getName());
		clone.setAddress(getAddress());
		clone.setPhonenumber(getPhonenumber());
		clone.setDepartment(getDepartment());
		clone.setSymptoms(getSymptoms());
		clone.setGender(getGender());
		clone.setId_doctor(getId_doctor());

		return clone;
	}

	@Override
	public int compareTo(Patients patients) {
		long primaryKey = patients.getPrimaryKey();

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

		if (!(obj instanceof PatientsClp)) {
			return false;
		}

		PatientsClp patients = (PatientsClp)obj;

		long primaryKey = patients.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id_patient=");
		sb.append(getId_patient());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phonenumber=");
		sb.append(getPhonenumber());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", symptoms=");
		sb.append(getSymptoms());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", id_doctor=");
		sb.append(getId_doctor());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Patients");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_patient</column-name><column-value><![CDATA[");
		sb.append(getId_patient());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phonenumber</column-name><column-value><![CDATA[");
		sb.append(getPhonenumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>symptoms</column-name><column-value><![CDATA[");
		sb.append(getSymptoms());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_doctor</column-name><column-value><![CDATA[");
		sb.append(getId_doctor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id_patient;
	private String _name;
	private String _address;
	private String _phonenumber;
	private String _department;
	private String _symptoms;
	private String _gender;
	private long _id_doctor;
	private BaseModel<?> _patientsRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}