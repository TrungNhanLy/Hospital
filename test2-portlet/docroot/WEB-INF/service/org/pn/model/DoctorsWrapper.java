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
 * This class is a wrapper for {@link Doctors}.
 * </p>
 *
 * @author thuctap
 * @see Doctors
 * @generated
 */
public class DoctorsWrapper implements Doctors, ModelWrapper<Doctors> {
	public DoctorsWrapper(Doctors doctors) {
		_doctors = doctors;
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

	/**
	* Returns the primary key of this doctors.
	*
	* @return the primary key of this doctors
	*/
	@Override
	public long getPrimaryKey() {
		return _doctors.getPrimaryKey();
	}

	/**
	* Sets the primary key of this doctors.
	*
	* @param primaryKey the primary key of this doctors
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_doctors.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_doctor of this doctors.
	*
	* @return the id_doctor of this doctors
	*/
	@Override
	public long getId_doctor() {
		return _doctors.getId_doctor();
	}

	/**
	* Sets the id_doctor of this doctors.
	*
	* @param id_doctor the id_doctor of this doctors
	*/
	@Override
	public void setId_doctor(long id_doctor) {
		_doctors.setId_doctor(id_doctor);
	}

	/**
	* Returns the name of this doctors.
	*
	* @return the name of this doctors
	*/
	@Override
	public java.lang.String getName() {
		return _doctors.getName();
	}

	/**
	* Sets the name of this doctors.
	*
	* @param name the name of this doctors
	*/
	@Override
	public void setName(java.lang.String name) {
		_doctors.setName(name);
	}

	/**
	* Returns the address of this doctors.
	*
	* @return the address of this doctors
	*/
	@Override
	public java.lang.String getAddress() {
		return _doctors.getAddress();
	}

	/**
	* Sets the address of this doctors.
	*
	* @param address the address of this doctors
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_doctors.setAddress(address);
	}

	/**
	* Returns the position of this doctors.
	*
	* @return the position of this doctors
	*/
	@Override
	public java.lang.String getPosition() {
		return _doctors.getPosition();
	}

	/**
	* Sets the position of this doctors.
	*
	* @param position the position of this doctors
	*/
	@Override
	public void setPosition(java.lang.String position) {
		_doctors.setPosition(position);
	}

	/**
	* Returns the gender of this doctors.
	*
	* @return the gender of this doctors
	*/
	@Override
	public java.lang.String getGender() {
		return _doctors.getGender();
	}

	/**
	* Sets the gender of this doctors.
	*
	* @param gender the gender of this doctors
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_doctors.setGender(gender);
	}

	@Override
	public boolean isNew() {
		return _doctors.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_doctors.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _doctors.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_doctors.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _doctors.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _doctors.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_doctors.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _doctors.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_doctors.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_doctors.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_doctors.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DoctorsWrapper((Doctors)_doctors.clone());
	}

	@Override
	public int compareTo(org.pn.model.Doctors doctors) {
		return _doctors.compareTo(doctors);
	}

	@Override
	public int hashCode() {
		return _doctors.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Doctors> toCacheModel() {
		return _doctors.toCacheModel();
	}

	@Override
	public org.pn.model.Doctors toEscapedModel() {
		return new DoctorsWrapper(_doctors.toEscapedModel());
	}

	@Override
	public org.pn.model.Doctors toUnescapedModel() {
		return new DoctorsWrapper(_doctors.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _doctors.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _doctors.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_doctors.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DoctorsWrapper)) {
			return false;
		}

		DoctorsWrapper doctorsWrapper = (DoctorsWrapper)obj;

		if (Validator.equals(_doctors, doctorsWrapper._doctors)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Doctors getWrappedDoctors() {
		return _doctors;
	}

	@Override
	public Doctors getWrappedModel() {
		return _doctors;
	}

	@Override
	public void resetOriginalValues() {
		_doctors.resetOriginalValues();
	}

	private Doctors _doctors;
}