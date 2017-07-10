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
 * This class is a wrapper for {@link Patients}.
 * </p>
 *
 * @author thuctap
 * @see Patients
 * @generated
 */
public class PatientsWrapper implements Patients, ModelWrapper<Patients> {
	public PatientsWrapper(Patients patients) {
		_patients = patients;
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

	/**
	* Returns the primary key of this patients.
	*
	* @return the primary key of this patients
	*/
	@Override
	public long getPrimaryKey() {
		return _patients.getPrimaryKey();
	}

	/**
	* Sets the primary key of this patients.
	*
	* @param primaryKey the primary key of this patients
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_patients.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_patient of this patients.
	*
	* @return the id_patient of this patients
	*/
	@Override
	public long getId_patient() {
		return _patients.getId_patient();
	}

	/**
	* Sets the id_patient of this patients.
	*
	* @param id_patient the id_patient of this patients
	*/
	@Override
	public void setId_patient(long id_patient) {
		_patients.setId_patient(id_patient);
	}

	/**
	* Returns the name of this patients.
	*
	* @return the name of this patients
	*/
	@Override
	public java.lang.String getName() {
		return _patients.getName();
	}

	/**
	* Sets the name of this patients.
	*
	* @param name the name of this patients
	*/
	@Override
	public void setName(java.lang.String name) {
		_patients.setName(name);
	}

	/**
	* Returns the address of this patients.
	*
	* @return the address of this patients
	*/
	@Override
	public java.lang.String getAddress() {
		return _patients.getAddress();
	}

	/**
	* Sets the address of this patients.
	*
	* @param address the address of this patients
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_patients.setAddress(address);
	}

	/**
	* Returns the phonenumber of this patients.
	*
	* @return the phonenumber of this patients
	*/
	@Override
	public java.lang.String getPhonenumber() {
		return _patients.getPhonenumber();
	}

	/**
	* Sets the phonenumber of this patients.
	*
	* @param phonenumber the phonenumber of this patients
	*/
	@Override
	public void setPhonenumber(java.lang.String phonenumber) {
		_patients.setPhonenumber(phonenumber);
	}

	/**
	* Returns the department of this patients.
	*
	* @return the department of this patients
	*/
	@Override
	public java.lang.String getDepartment() {
		return _patients.getDepartment();
	}

	/**
	* Sets the department of this patients.
	*
	* @param department the department of this patients
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_patients.setDepartment(department);
	}

	/**
	* Returns the symptoms of this patients.
	*
	* @return the symptoms of this patients
	*/
	@Override
	public java.lang.String getSymptoms() {
		return _patients.getSymptoms();
	}

	/**
	* Sets the symptoms of this patients.
	*
	* @param symptoms the symptoms of this patients
	*/
	@Override
	public void setSymptoms(java.lang.String symptoms) {
		_patients.setSymptoms(symptoms);
	}

	/**
	* Returns the gender of this patients.
	*
	* @return the gender of this patients
	*/
	@Override
	public java.lang.String getGender() {
		return _patients.getGender();
	}

	/**
	* Sets the gender of this patients.
	*
	* @param gender the gender of this patients
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_patients.setGender(gender);
	}

	/**
	* Returns the id_doctor of this patients.
	*
	* @return the id_doctor of this patients
	*/
	@Override
	public long getId_doctor() {
		return _patients.getId_doctor();
	}

	/**
	* Sets the id_doctor of this patients.
	*
	* @param id_doctor the id_doctor of this patients
	*/
	@Override
	public void setId_doctor(long id_doctor) {
		_patients.setId_doctor(id_doctor);
	}

	@Override
	public boolean isNew() {
		return _patients.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_patients.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _patients.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_patients.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _patients.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _patients.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_patients.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _patients.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_patients.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_patients.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_patients.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PatientsWrapper((Patients)_patients.clone());
	}

	@Override
	public int compareTo(org.pn.model.Patients patients) {
		return _patients.compareTo(patients);
	}

	@Override
	public int hashCode() {
		return _patients.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Patients> toCacheModel() {
		return _patients.toCacheModel();
	}

	@Override
	public org.pn.model.Patients toEscapedModel() {
		return new PatientsWrapper(_patients.toEscapedModel());
	}

	@Override
	public org.pn.model.Patients toUnescapedModel() {
		return new PatientsWrapper(_patients.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _patients.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _patients.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_patients.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PatientsWrapper)) {
			return false;
		}

		PatientsWrapper patientsWrapper = (PatientsWrapper)obj;

		if (Validator.equals(_patients, patientsWrapper._patients)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Patients getWrappedPatients() {
		return _patients;
	}

	@Override
	public Patients getWrappedModel() {
		return _patients;
	}

	@Override
	public void resetOriginalValues() {
		_patients.resetOriginalValues();
	}

	private Patients _patients;
}