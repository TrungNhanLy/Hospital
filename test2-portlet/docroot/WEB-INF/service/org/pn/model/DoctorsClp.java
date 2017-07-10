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
import org.pn.service.DoctorsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class DoctorsClp extends BaseModelImpl<Doctors> implements Doctors {
	public DoctorsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Doctors.class;
	}

	@Override
	public String getModelClassName() {
		return Doctors.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id_doctor;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_doctor(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_doctor;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_doctor", getId_doctor());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("position", getPosition());
		attributes.put("gender", getGender());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_doctor = (Long)attributes.get("id_doctor");

		if (id_doctor != null) {
			setId_doctor(id_doctor);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}
	}

	@Override
	public long getId_doctor() {
		return _id_doctor;
	}

	@Override
	public void setId_doctor(long id_doctor) {
		_id_doctor = id_doctor;

		if (_doctorsRemoteModel != null) {
			try {
				Class<?> clazz = _doctorsRemoteModel.getClass();

				Method method = clazz.getMethod("setId_doctor", long.class);

				method.invoke(_doctorsRemoteModel, id_doctor);
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

		if (_doctorsRemoteModel != null) {
			try {
				Class<?> clazz = _doctorsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_doctorsRemoteModel, name);
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

		if (_doctorsRemoteModel != null) {
			try {
				Class<?> clazz = _doctorsRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_doctorsRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPosition() {
		return _position;
	}

	@Override
	public void setPosition(String position) {
		_position = position;

		if (_doctorsRemoteModel != null) {
			try {
				Class<?> clazz = _doctorsRemoteModel.getClass();

				Method method = clazz.getMethod("setPosition", String.class);

				method.invoke(_doctorsRemoteModel, position);
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

		if (_doctorsRemoteModel != null) {
			try {
				Class<?> clazz = _doctorsRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_doctorsRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDoctorsRemoteModel() {
		return _doctorsRemoteModel;
	}

	public void setDoctorsRemoteModel(BaseModel<?> doctorsRemoteModel) {
		_doctorsRemoteModel = doctorsRemoteModel;
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

		Class<?> remoteModelClass = _doctorsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_doctorsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DoctorsLocalServiceUtil.addDoctors(this);
		}
		else {
			DoctorsLocalServiceUtil.updateDoctors(this);
		}
	}

	@Override
	public Doctors toEscapedModel() {
		return (Doctors)ProxyUtil.newProxyInstance(Doctors.class.getClassLoader(),
			new Class[] { Doctors.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DoctorsClp clone = new DoctorsClp();

		clone.setId_doctor(getId_doctor());
		clone.setName(getName());
		clone.setAddress(getAddress());
		clone.setPosition(getPosition());
		clone.setGender(getGender());

		return clone;
	}

	@Override
	public int compareTo(Doctors doctors) {
		long primaryKey = doctors.getPrimaryKey();

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

		if (!(obj instanceof DoctorsClp)) {
			return false;
		}

		DoctorsClp doctors = (DoctorsClp)obj;

		long primaryKey = doctors.getPrimaryKey();

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

		sb.append("{id_doctor=");
		sb.append(getId_doctor());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Doctors");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_doctor</column-name><column-value><![CDATA[");
		sb.append(getId_doctor());
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
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id_doctor;
	private String _name;
	private String _address;
	private String _position;
	private String _gender;
	private BaseModel<?> _doctorsRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}