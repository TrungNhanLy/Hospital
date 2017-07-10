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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RoomPatient}.
 * </p>
 *
 * @author thuctap
 * @see RoomPatient
 * @generated
 */
public class RoomPatientWrapper implements RoomPatient,
	ModelWrapper<RoomPatient> {
	public RoomPatientWrapper(RoomPatient roomPatient) {
		_roomPatient = roomPatient;
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

	/**
	* Returns the primary key of this room patient.
	*
	* @return the primary key of this room patient
	*/
	@Override
	public long getPrimaryKey() {
		return _roomPatient.getPrimaryKey();
	}

	/**
	* Sets the primary key of this room patient.
	*
	* @param primaryKey the primary key of this room patient
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_roomPatient.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the room_no of this room patient.
	*
	* @return the room_no of this room patient
	*/
	@Override
	public long getRoom_no() {
		return _roomPatient.getRoom_no();
	}

	/**
	* Sets the room_no of this room patient.
	*
	* @param room_no the room_no of this room patient
	*/
	@Override
	public void setRoom_no(long room_no) {
		_roomPatient.setRoom_no(room_no);
	}

	/**
	* Returns the status of this room patient.
	*
	* @return the status of this room patient
	*/
	@Override
	public java.lang.String getStatus() {
		return _roomPatient.getStatus();
	}

	/**
	* Sets the status of this room patient.
	*
	* @param status the status of this room patient
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_roomPatient.setStatus(status);
	}

	/**
	* Returns the id_patient of this room patient.
	*
	* @return the id_patient of this room patient
	*/
	@Override
	public long getId_patient() {
		return _roomPatient.getId_patient();
	}

	/**
	* Sets the id_patient of this room patient.
	*
	* @param id_patient the id_patient of this room patient
	*/
	@Override
	public void setId_patient(long id_patient) {
		_roomPatient.setId_patient(id_patient);
	}

	@Override
	public boolean isNew() {
		return _roomPatient.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_roomPatient.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _roomPatient.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_roomPatient.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _roomPatient.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _roomPatient.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_roomPatient.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _roomPatient.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_roomPatient.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_roomPatient.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_roomPatient.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RoomPatientWrapper((RoomPatient)_roomPatient.clone());
	}

	@Override
	public int compareTo(org.pn.model.RoomPatient roomPatient) {
		return _roomPatient.compareTo(roomPatient);
	}

	@Override
	public int hashCode() {
		return _roomPatient.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.RoomPatient> toCacheModel() {
		return _roomPatient.toCacheModel();
	}

	@Override
	public org.pn.model.RoomPatient toEscapedModel() {
		return new RoomPatientWrapper(_roomPatient.toEscapedModel());
	}

	@Override
	public org.pn.model.RoomPatient toUnescapedModel() {
		return new RoomPatientWrapper(_roomPatient.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _roomPatient.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _roomPatient.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_roomPatient.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RoomPatientWrapper)) {
			return false;
		}

		RoomPatientWrapper roomPatientWrapper = (RoomPatientWrapper)obj;

		if (Validator.equals(_roomPatient, roomPatientWrapper._roomPatient)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RoomPatient getWrappedRoomPatient() {
		return _roomPatient;
	}

	@Override
	public RoomPatient getWrappedModel() {
		return _roomPatient;
	}

	@Override
	public void resetOriginalValues() {
		_roomPatient.resetOriginalValues();
	}

	private RoomPatient _roomPatient;
}