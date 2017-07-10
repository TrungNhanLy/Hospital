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
import org.pn.service.StaffsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class StaffsClp extends BaseModelImpl<Staffs> implements Staffs {
	public StaffsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Staffs.class;
	}

	@Override
	public String getModelClassName() {
		return Staffs.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id_staff;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_staff(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_staff;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_staff", getId_staff());
		attributes.put("name", getName());
		attributes.put("gender", getGender());
		attributes.put("department", getDepartment());
		attributes.put("phonenumber", getPhonenumber());
		attributes.put("id_doctor", getId_doctor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_staff = (Long)attributes.get("id_staff");

		if (id_staff != null) {
			setId_staff(id_staff);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String phonenumber = (String)attributes.get("phonenumber");

		if (phonenumber != null) {
			setPhonenumber(phonenumber);
		}

		Long id_doctor = (Long)attributes.get("id_doctor");

		if (id_doctor != null) {
			setId_doctor(id_doctor);
		}
	}

	@Override
	public long getId_staff() {
		return _id_staff;
	}

	@Override
	public void setId_staff(long id_staff) {
		_id_staff = id_staff;

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_staff", long.class);

				method.invoke(_staffsRemoteModel, id_staff);
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

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_staffsRemoteModel, name);
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

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_staffsRemoteModel, gender);
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

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartment", String.class);

				method.invoke(_staffsRemoteModel, department);
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

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setPhonenumber", String.class);

				method.invoke(_staffsRemoteModel, phonenumber);
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

		if (_staffsRemoteModel != null) {
			try {
				Class<?> clazz = _staffsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_doctor", long.class);

				method.invoke(_staffsRemoteModel, id_doctor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStaffsRemoteModel() {
		return _staffsRemoteModel;
	}

	public void setStaffsRemoteModel(BaseModel<?> staffsRemoteModel) {
		_staffsRemoteModel = staffsRemoteModel;
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

		Class<?> remoteModelClass = _staffsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_staffsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StaffsLocalServiceUtil.addStaffs(this);
		}
		else {
			StaffsLocalServiceUtil.updateStaffs(this);
		}
	}

	@Override
	public Staffs toEscapedModel() {
		return (Staffs)ProxyUtil.newProxyInstance(Staffs.class.getClassLoader(),
			new Class[] { Staffs.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StaffsClp clone = new StaffsClp();

		clone.setId_staff(getId_staff());
		clone.setName(getName());
		clone.setGender(getGender());
		clone.setDepartment(getDepartment());
		clone.setPhonenumber(getPhonenumber());
		clone.setId_doctor(getId_doctor());

		return clone;
	}

	@Override
	public int compareTo(Staffs staffs) {
		long primaryKey = staffs.getPrimaryKey();

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

		if (!(obj instanceof StaffsClp)) {
			return false;
		}

		StaffsClp staffs = (StaffsClp)obj;

		long primaryKey = staffs.getPrimaryKey();

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

		sb.append("{id_staff=");
		sb.append(getId_staff());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", phonenumber=");
		sb.append(getPhonenumber());
		sb.append(", id_doctor=");
		sb.append(getId_doctor());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Staffs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_staff</column-name><column-value><![CDATA[");
		sb.append(getId_staff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phonenumber</column-name><column-value><![CDATA[");
		sb.append(getPhonenumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_doctor</column-name><column-value><![CDATA[");
		sb.append(getId_doctor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id_staff;
	private String _name;
	private String _gender;
	private String _department;
	private String _phonenumber;
	private long _id_doctor;
	private BaseModel<?> _staffsRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}