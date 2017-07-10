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
 * This class is a wrapper for {@link Status}.
 * </p>
 *
 * @author thuctap
 * @see Status
 * @generated
 */
public class StatusWrapper implements Status, ModelWrapper<Status> {
	public StatusWrapper(Status status) {
		_status = status;
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

	/**
	* Returns the primary key of this status.
	*
	* @return the primary key of this status
	*/
	@Override
	public long getPrimaryKey() {
		return _status.getPrimaryKey();
	}

	/**
	* Sets the primary key of this status.
	*
	* @param primaryKey the primary key of this status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_status.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the status_no of this status.
	*
	* @return the status_no of this status
	*/
	@Override
	public long getStatus_no() {
		return _status.getStatus_no();
	}

	/**
	* Sets the status_no of this status.
	*
	* @param status_no the status_no of this status
	*/
	@Override
	public void setStatus_no(long status_no) {
		_status.setStatus_no(status_no);
	}

	/**
	* Returns the status_detail of this status.
	*
	* @return the status_detail of this status
	*/
	@Override
	public java.lang.String getStatus_detail() {
		return _status.getStatus_detail();
	}

	/**
	* Sets the status_detail of this status.
	*
	* @param status_detail the status_detail of this status
	*/
	@Override
	public void setStatus_detail(java.lang.String status_detail) {
		_status.setStatus_detail(status_detail);
	}

	/**
	* Returns the id_patient of this status.
	*
	* @return the id_patient of this status
	*/
	@Override
	public long getId_patient() {
		return _status.getId_patient();
	}

	/**
	* Sets the id_patient of this status.
	*
	* @param id_patient the id_patient of this status
	*/
	@Override
	public void setId_patient(long id_patient) {
		_status.setId_patient(id_patient);
	}

	@Override
	public boolean isNew() {
		return _status.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_status.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _status.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_status.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _status.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _status.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_status.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _status.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_status.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_status.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_status.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StatusWrapper((Status)_status.clone());
	}

	@Override
	public int compareTo(org.pn.model.Status status) {
		return _status.compareTo(status);
	}

	@Override
	public int hashCode() {
		return _status.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Status> toCacheModel() {
		return _status.toCacheModel();
	}

	@Override
	public org.pn.model.Status toEscapedModel() {
		return new StatusWrapper(_status.toEscapedModel());
	}

	@Override
	public org.pn.model.Status toUnescapedModel() {
		return new StatusWrapper(_status.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _status.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _status.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_status.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatusWrapper)) {
			return false;
		}

		StatusWrapper statusWrapper = (StatusWrapper)obj;

		if (Validator.equals(_status, statusWrapper._status)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Status getWrappedStatus() {
		return _status;
	}

	@Override
	public Status getWrappedModel() {
		return _status;
	}

	@Override
	public void resetOriginalValues() {
		_status.resetOriginalValues();
	}

	private Status _status;
}