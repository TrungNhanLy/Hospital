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
 * This class is a wrapper for {@link Staffs}.
 * </p>
 *
 * @author thuctap
 * @see Staffs
 * @generated
 */
public class StaffsWrapper implements Staffs, ModelWrapper<Staffs> {
	public StaffsWrapper(Staffs staffs) {
		_staffs = staffs;
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

	/**
	* Returns the primary key of this staffs.
	*
	* @return the primary key of this staffs
	*/
	@Override
	public long getPrimaryKey() {
		return _staffs.getPrimaryKey();
	}

	/**
	* Sets the primary key of this staffs.
	*
	* @param primaryKey the primary key of this staffs
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_staffs.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_staff of this staffs.
	*
	* @return the id_staff of this staffs
	*/
	@Override
	public long getId_staff() {
		return _staffs.getId_staff();
	}

	/**
	* Sets the id_staff of this staffs.
	*
	* @param id_staff the id_staff of this staffs
	*/
	@Override
	public void setId_staff(long id_staff) {
		_staffs.setId_staff(id_staff);
	}

	/**
	* Returns the name of this staffs.
	*
	* @return the name of this staffs
	*/
	@Override
	public java.lang.String getName() {
		return _staffs.getName();
	}

	/**
	* Sets the name of this staffs.
	*
	* @param name the name of this staffs
	*/
	@Override
	public void setName(java.lang.String name) {
		_staffs.setName(name);
	}

	/**
	* Returns the gender of this staffs.
	*
	* @return the gender of this staffs
	*/
	@Override
	public java.lang.String getGender() {
		return _staffs.getGender();
	}

	/**
	* Sets the gender of this staffs.
	*
	* @param gender the gender of this staffs
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_staffs.setGender(gender);
	}

	/**
	* Returns the department of this staffs.
	*
	* @return the department of this staffs
	*/
	@Override
	public java.lang.String getDepartment() {
		return _staffs.getDepartment();
	}

	/**
	* Sets the department of this staffs.
	*
	* @param department the department of this staffs
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_staffs.setDepartment(department);
	}

	/**
	* Returns the phonenumber of this staffs.
	*
	* @return the phonenumber of this staffs
	*/
	@Override
	public java.lang.String getPhonenumber() {
		return _staffs.getPhonenumber();
	}

	/**
	* Sets the phonenumber of this staffs.
	*
	* @param phonenumber the phonenumber of this staffs
	*/
	@Override
	public void setPhonenumber(java.lang.String phonenumber) {
		_staffs.setPhonenumber(phonenumber);
	}

	/**
	* Returns the id_doctor of this staffs.
	*
	* @return the id_doctor of this staffs
	*/
	@Override
	public long getId_doctor() {
		return _staffs.getId_doctor();
	}

	/**
	* Sets the id_doctor of this staffs.
	*
	* @param id_doctor the id_doctor of this staffs
	*/
	@Override
	public void setId_doctor(long id_doctor) {
		_staffs.setId_doctor(id_doctor);
	}

	@Override
	public boolean isNew() {
		return _staffs.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_staffs.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _staffs.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_staffs.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _staffs.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _staffs.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_staffs.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _staffs.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_staffs.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_staffs.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_staffs.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StaffsWrapper((Staffs)_staffs.clone());
	}

	@Override
	public int compareTo(org.pn.model.Staffs staffs) {
		return _staffs.compareTo(staffs);
	}

	@Override
	public int hashCode() {
		return _staffs.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Staffs> toCacheModel() {
		return _staffs.toCacheModel();
	}

	@Override
	public org.pn.model.Staffs toEscapedModel() {
		return new StaffsWrapper(_staffs.toEscapedModel());
	}

	@Override
	public org.pn.model.Staffs toUnescapedModel() {
		return new StaffsWrapper(_staffs.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _staffs.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _staffs.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_staffs.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StaffsWrapper)) {
			return false;
		}

		StaffsWrapper staffsWrapper = (StaffsWrapper)obj;

		if (Validator.equals(_staffs, staffsWrapper._staffs)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Staffs getWrappedStaffs() {
		return _staffs;
	}

	@Override
	public Staffs getWrappedModel() {
		return _staffs;
	}

	@Override
	public void resetOriginalValues() {
		_staffs.resetOriginalValues();
	}

	private Staffs _staffs;
}