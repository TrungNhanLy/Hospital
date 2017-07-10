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
import org.pn.service.RoomPatientLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class RoomPatientClp extends BaseModelImpl<RoomPatient>
	implements RoomPatient {
	public RoomPatientClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RoomPatient.class;
	}

	@Override
	public String getModelClassName() {
		return RoomPatient.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _room_no;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRoom_no(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _room_no;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("room_no", getRoom_no());
		attributes.put("status", getStatus());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long room_no = (Long)attributes.get("room_no");

		if (room_no != null) {
			setRoom_no(room_no);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	@Override
	public long getRoom_no() {
		return _room_no;
	}

	@Override
	public void setRoom_no(long room_no) {
		_room_no = room_no;

		if (_roomPatientRemoteModel != null) {
			try {
				Class<?> clazz = _roomPatientRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_no", long.class);

				method.invoke(_roomPatientRemoteModel, room_no);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_roomPatientRemoteModel != null) {
			try {
				Class<?> clazz = _roomPatientRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_roomPatientRemoteModel, status);
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

		if (_roomPatientRemoteModel != null) {
			try {
				Class<?> clazz = _roomPatientRemoteModel.getClass();

				Method method = clazz.getMethod("setId_patient", long.class);

				method.invoke(_roomPatientRemoteModel, id_patient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRoomPatientRemoteModel() {
		return _roomPatientRemoteModel;
	}

	public void setRoomPatientRemoteModel(BaseModel<?> roomPatientRemoteModel) {
		_roomPatientRemoteModel = roomPatientRemoteModel;
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

		Class<?> remoteModelClass = _roomPatientRemoteModel.getClass();

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

		Object returnValue = method.invoke(_roomPatientRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RoomPatientLocalServiceUtil.addRoomPatient(this);
		}
		else {
			RoomPatientLocalServiceUtil.updateRoomPatient(this);
		}
	}

	@Override
	public RoomPatient toEscapedModel() {
		return (RoomPatient)ProxyUtil.newProxyInstance(RoomPatient.class.getClassLoader(),
			new Class[] { RoomPatient.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RoomPatientClp clone = new RoomPatientClp();

		clone.setRoom_no(getRoom_no());
		clone.setStatus(getStatus());
		clone.setId_patient(getId_patient());

		return clone;
	}

	@Override
	public int compareTo(RoomPatient roomPatient) {
		long primaryKey = roomPatient.getPrimaryKey();

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

		if (!(obj instanceof RoomPatientClp)) {
			return false;
		}

		RoomPatientClp roomPatient = (RoomPatientClp)obj;

		long primaryKey = roomPatient.getPrimaryKey();

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

		sb.append("{room_no=");
		sb.append(getRoom_no());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", id_patient=");
		sb.append(getId_patient());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.RoomPatient");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>room_no</column-name><column-value><![CDATA[");
		sb.append(getRoom_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_patient</column-name><column-value><![CDATA[");
		sb.append(getId_patient());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _room_no;
	private String _status;
	private long _id_patient;
	private BaseModel<?> _roomPatientRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}