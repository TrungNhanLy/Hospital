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
 * This class is a wrapper for {@link Bills}.
 * </p>
 *
 * @author thuctap
 * @see Bills
 * @generated
 */
public class BillsWrapper implements Bills, ModelWrapper<Bills> {
	public BillsWrapper(Bills bills) {
		_bills = bills;
	}

	@Override
	public Class<?> getModelClass() {
		return Bills.class;
	}

	@Override
	public String getModelClassName() {
		return Bills.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bill_no", getBill_no());
		attributes.put("patient_name", getPatient_name());
		attributes.put("doctor_name", getDoctor_name());
		attributes.put("bill_date", getBill_date());
		attributes.put("amount", getAmount());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bill_no = (Long)attributes.get("bill_no");

		if (bill_no != null) {
			setBill_no(bill_no);
		}

		String patient_name = (String)attributes.get("patient_name");

		if (patient_name != null) {
			setPatient_name(patient_name);
		}

		String doctor_name = (String)attributes.get("doctor_name");

		if (doctor_name != null) {
			setDoctor_name(doctor_name);
		}

		Date bill_date = (Date)attributes.get("bill_date");

		if (bill_date != null) {
			setBill_date(bill_date);
		}

		Integer amount = (Integer)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	/**
	* Returns the primary key of this bills.
	*
	* @return the primary key of this bills
	*/
	@Override
	public long getPrimaryKey() {
		return _bills.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bills.
	*
	* @param primaryKey the primary key of this bills
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bills.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the bill_no of this bills.
	*
	* @return the bill_no of this bills
	*/
	@Override
	public long getBill_no() {
		return _bills.getBill_no();
	}

	/**
	* Sets the bill_no of this bills.
	*
	* @param bill_no the bill_no of this bills
	*/
	@Override
	public void setBill_no(long bill_no) {
		_bills.setBill_no(bill_no);
	}

	/**
	* Returns the patient_name of this bills.
	*
	* @return the patient_name of this bills
	*/
	@Override
	public java.lang.String getPatient_name() {
		return _bills.getPatient_name();
	}

	/**
	* Sets the patient_name of this bills.
	*
	* @param patient_name the patient_name of this bills
	*/
	@Override
	public void setPatient_name(java.lang.String patient_name) {
		_bills.setPatient_name(patient_name);
	}

	/**
	* Returns the doctor_name of this bills.
	*
	* @return the doctor_name of this bills
	*/
	@Override
	public java.lang.String getDoctor_name() {
		return _bills.getDoctor_name();
	}

	/**
	* Sets the doctor_name of this bills.
	*
	* @param doctor_name the doctor_name of this bills
	*/
	@Override
	public void setDoctor_name(java.lang.String doctor_name) {
		_bills.setDoctor_name(doctor_name);
	}

	/**
	* Returns the bill_date of this bills.
	*
	* @return the bill_date of this bills
	*/
	@Override
	public java.util.Date getBill_date() {
		return _bills.getBill_date();
	}

	/**
	* Sets the bill_date of this bills.
	*
	* @param bill_date the bill_date of this bills
	*/
	@Override
	public void setBill_date(java.util.Date bill_date) {
		_bills.setBill_date(bill_date);
	}

	/**
	* Returns the amount of this bills.
	*
	* @return the amount of this bills
	*/
	@Override
	public int getAmount() {
		return _bills.getAmount();
	}

	/**
	* Sets the amount of this bills.
	*
	* @param amount the amount of this bills
	*/
	@Override
	public void setAmount(int amount) {
		_bills.setAmount(amount);
	}

	/**
	* Returns the id_patient of this bills.
	*
	* @return the id_patient of this bills
	*/
	@Override
	public long getId_patient() {
		return _bills.getId_patient();
	}

	/**
	* Sets the id_patient of this bills.
	*
	* @param id_patient the id_patient of this bills
	*/
	@Override
	public void setId_patient(long id_patient) {
		_bills.setId_patient(id_patient);
	}

	@Override
	public boolean isNew() {
		return _bills.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bills.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bills.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bills.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bills.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bills.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bills.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bills.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bills.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bills.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bills.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BillsWrapper((Bills)_bills.clone());
	}

	@Override
	public int compareTo(org.pn.model.Bills bills) {
		return _bills.compareTo(bills);
	}

	@Override
	public int hashCode() {
		return _bills.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Bills> toCacheModel() {
		return _bills.toCacheModel();
	}

	@Override
	public org.pn.model.Bills toEscapedModel() {
		return new BillsWrapper(_bills.toEscapedModel());
	}

	@Override
	public org.pn.model.Bills toUnescapedModel() {
		return new BillsWrapper(_bills.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bills.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bills.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bills.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BillsWrapper)) {
			return false;
		}

		BillsWrapper billsWrapper = (BillsWrapper)obj;

		if (Validator.equals(_bills, billsWrapper._bills)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Bills getWrappedBills() {
		return _bills;
	}

	@Override
	public Bills getWrappedModel() {
		return _bills;
	}

	@Override
	public void resetOriginalValues() {
		_bills.resetOriginalValues();
	}

	private Bills _bills;
}