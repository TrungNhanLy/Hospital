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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Diagnosis}.
 * </p>
 *
 * @author thuctap
 * @see Diagnosis
 * @generated
 */
public class DiagnosisWrapper implements Diagnosis, ModelWrapper<Diagnosis> {
	public DiagnosisWrapper(Diagnosis diagnosis) {
		_diagnosis = diagnosis;
	}

	@Override
	public Class<?> getModelClass() {
		return Diagnosis.class;
	}

	@Override
	public String getModelClassName() {
		return Diagnosis.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("diagnosis_no", getDiagnosis_no());
		attributes.put("detail", getDetail());
		attributes.put("remak", getRemak());
		attributes.put("diagnosis_date", getDiagnosis_date());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long diagnosis_no = (Long)attributes.get("diagnosis_no");

		if (diagnosis_no != null) {
			setDiagnosis_no(diagnosis_no);
		}

		String detail = (String)attributes.get("detail");

		if (detail != null) {
			setDetail(detail);
		}

		String remak = (String)attributes.get("remak");

		if (remak != null) {
			setRemak(remak);
		}

		Date diagnosis_date = (Date)attributes.get("diagnosis_date");

		if (diagnosis_date != null) {
			setDiagnosis_date(diagnosis_date);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	/**
	* Returns the primary key of this diagnosis.
	*
	* @return the primary key of this diagnosis
	*/
	@Override
	public long getPrimaryKey() {
		return _diagnosis.getPrimaryKey();
	}

	/**
	* Sets the primary key of this diagnosis.
	*
	* @param primaryKey the primary key of this diagnosis
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_diagnosis.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the diagnosis_no of this diagnosis.
	*
	* @return the diagnosis_no of this diagnosis
	*/
	@Override
	public long getDiagnosis_no() {
		return _diagnosis.getDiagnosis_no();
	}

	/**
	* Sets the diagnosis_no of this diagnosis.
	*
	* @param diagnosis_no the diagnosis_no of this diagnosis
	*/
	@Override
	public void setDiagnosis_no(long diagnosis_no) {
		_diagnosis.setDiagnosis_no(diagnosis_no);
	}

	/**
	* Returns the detail of this diagnosis.
	*
	* @return the detail of this diagnosis
	*/
	@Override
	public java.lang.String getDetail() {
		return _diagnosis.getDetail();
	}

	/**
	* Sets the detail of this diagnosis.
	*
	* @param detail the detail of this diagnosis
	*/
	@Override
	public void setDetail(java.lang.String detail) {
		_diagnosis.setDetail(detail);
	}

	/**
	* Returns the remak of this diagnosis.
	*
	* @return the remak of this diagnosis
	*/
	@Override
	public java.lang.String getRemak() {
		return _diagnosis.getRemak();
	}

	/**
	* Sets the remak of this diagnosis.
	*
	* @param remak the remak of this diagnosis
	*/
	@Override
	public void setRemak(java.lang.String remak) {
		_diagnosis.setRemak(remak);
	}

	/**
	* Returns the diagnosis_date of this diagnosis.
	*
	* @return the diagnosis_date of this diagnosis
	*/
	@Override
	public java.util.Date getDiagnosis_date() {
		return _diagnosis.getDiagnosis_date();
	}

	/**
	* Sets the diagnosis_date of this diagnosis.
	*
	* @param diagnosis_date the diagnosis_date of this diagnosis
	*/
	@Override
	public void setDiagnosis_date(java.util.Date diagnosis_date) {
		_diagnosis.setDiagnosis_date(diagnosis_date);
	}

	/**
	* Returns the id_patient of this diagnosis.
	*
	* @return the id_patient of this diagnosis
	*/
	@Override
	public long getId_patient() {
		return _diagnosis.getId_patient();
	}

	/**
	* Sets the id_patient of this diagnosis.
	*
	* @param id_patient the id_patient of this diagnosis
	*/
	@Override
	public void setId_patient(long id_patient) {
		_diagnosis.setId_patient(id_patient);
	}

	@Override
	public boolean isNew() {
		return _diagnosis.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_diagnosis.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _diagnosis.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_diagnosis.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _diagnosis.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _diagnosis.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_diagnosis.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _diagnosis.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_diagnosis.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_diagnosis.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_diagnosis.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DiagnosisWrapper((Diagnosis)_diagnosis.clone());
	}

	@Override
	public int compareTo(org.pn.model.Diagnosis diagnosis) {
		return _diagnosis.compareTo(diagnosis);
	}

	@Override
	public int hashCode() {
		return _diagnosis.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Diagnosis> toCacheModel() {
		return _diagnosis.toCacheModel();
	}

	@Override
	public org.pn.model.Diagnosis toEscapedModel() {
		return new DiagnosisWrapper(_diagnosis.toEscapedModel());
	}

	@Override
	public org.pn.model.Diagnosis toUnescapedModel() {
		return new DiagnosisWrapper(_diagnosis.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _diagnosis.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _diagnosis.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_diagnosis.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DiagnosisWrapper)) {
			return false;
		}

		DiagnosisWrapper diagnosisWrapper = (DiagnosisWrapper)obj;

		if (Validator.equals(_diagnosis, diagnosisWrapper._diagnosis)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Diagnosis getWrappedDiagnosis() {
		return _diagnosis;
	}

	@Override
	public Diagnosis getWrappedModel() {
		return _diagnosis;
	}

	@Override
	public void resetOriginalValues() {
		_diagnosis.resetOriginalValues();
	}

	private Diagnosis _diagnosis;
}