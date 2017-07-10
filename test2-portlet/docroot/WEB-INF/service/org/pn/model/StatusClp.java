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
import org.pn.service.StatusLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class StatusClp extends BaseModelImpl<Status> implements Status {
	public StatusClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Status.class;
	}

	@Override
	public String getModelClassName() {
		return Status.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _status_no;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatus_no(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _status_no;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("status_no", getStatus_no());
		attributes.put("status_detail", getStatus_detail());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long status_no = (Long)attributes.get("status_no");

		if (status_no != null) {
			setStatus_no(status_no);
		}

		String status_detail = (String)attributes.get("status_detail");

		if (status_detail != null) {
			setStatus_detail(status_detail);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	@Override
	public long getStatus_no() {
		return _status_no;
	}

	@Override
	public void setStatus_no(long status_no) {
		_status_no = status_no;

		if (_statusRemoteModel != null) {
			try {
				Class<?> clazz = _statusRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus_no", long.class);

				method.invoke(_statusRemoteModel, status_no);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus_detail() {
		return _status_detail;
	}

	@Override
	public void setStatus_detail(String status_detail) {
		_status_detail = status_detail;

		if (_statusRemoteModel != null) {
			try {
				Class<?> clazz = _statusRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus_detail", String.class);

				method.invoke(_statusRemoteModel, status_detail);
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

		if (_statusRemoteModel != null) {
			try {
				Class<?> clazz = _statusRemoteModel.getClass();

				Method method = clazz.getMethod("setId_patient", long.class);

				method.invoke(_statusRemoteModel, id_patient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStatusRemoteModel() {
		return _statusRemoteModel;
	}

	public void setStatusRemoteModel(BaseModel<?> statusRemoteModel) {
		_statusRemoteModel = statusRemoteModel;
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

		Class<?> remoteModelClass = _statusRemoteModel.getClass();

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

		Object returnValue = method.invoke(_statusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StatusLocalServiceUtil.addStatus(this);
		}
		else {
			StatusLocalServiceUtil.updateStatus(this);
		}
	}

	@Override
	public Status toEscapedModel() {
		return (Status)ProxyUtil.newProxyInstance(Status.class.getClassLoader(),
			new Class[] { Status.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StatusClp clone = new StatusClp();

		clone.setStatus_no(getStatus_no());
		clone.setStatus_detail(getStatus_detail());
		clone.setId_patient(getId_patient());

		return clone;
	}

	@Override
	public int compareTo(Status status) {
		long primaryKey = status.getPrimaryKey();

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

		if (!(obj instanceof StatusClp)) {
			return false;
		}

		StatusClp status = (StatusClp)obj;

		long primaryKey = status.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{status_no=");
		sb.append(getStatus_no());
		sb.append(", status_detail=");
		sb.append(getStatus_detail());
		sb.append(", id_patient=");
		sb.append(getId_patient());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Status");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>status_no</column-name><column-value><![CDATA[");
		sb.append(getStatus_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_detail</column-name><column-value><![CDATA[");
		sb.append(getStatus_detail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_patient</column-name><column-value><![CDATA[");
		sb.append(getId_patient());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _status_no;
	private String _status_detail;
	private long _id_patient;
	private BaseModel<?> _statusRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}