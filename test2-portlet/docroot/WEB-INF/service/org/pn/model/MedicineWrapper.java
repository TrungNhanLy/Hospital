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
 * This class is a wrapper for {@link Medicine}.
 * </p>
 *
 * @author thuctap
 * @see Medicine
 * @generated
 */
public class MedicineWrapper implements Medicine, ModelWrapper<Medicine> {
	public MedicineWrapper(Medicine medicine) {
		_medicine = medicine;
	}

	@Override
	public Class<?> getModelClass() {
		return Medicine.class;
	}

	@Override
	public String getModelClassName() {
		return Medicine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_medicine", getId_medicine());
		attributes.put("bill_no", getBill_no());
		attributes.put("id_drug", getId_drug());
		attributes.put("quantity", getQuantity());
		attributes.put("remark", getRemark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_medicine = (Long)attributes.get("id_medicine");

		if (id_medicine != null) {
			setId_medicine(id_medicine);
		}

		Long bill_no = (Long)attributes.get("bill_no");

		if (bill_no != null) {
			setBill_no(bill_no);
		}

		Long id_drug = (Long)attributes.get("id_drug");

		if (id_drug != null) {
			setId_drug(id_drug);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	/**
	* Returns the primary key of this medicine.
	*
	* @return the primary key of this medicine
	*/
	@Override
	public long getPrimaryKey() {
		return _medicine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this medicine.
	*
	* @param primaryKey the primary key of this medicine
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_medicine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_medicine of this medicine.
	*
	* @return the id_medicine of this medicine
	*/
	@Override
	public long getId_medicine() {
		return _medicine.getId_medicine();
	}

	/**
	* Sets the id_medicine of this medicine.
	*
	* @param id_medicine the id_medicine of this medicine
	*/
	@Override
	public void setId_medicine(long id_medicine) {
		_medicine.setId_medicine(id_medicine);
	}

	/**
	* Returns the bill_no of this medicine.
	*
	* @return the bill_no of this medicine
	*/
	@Override
	public long getBill_no() {
		return _medicine.getBill_no();
	}

	/**
	* Sets the bill_no of this medicine.
	*
	* @param bill_no the bill_no of this medicine
	*/
	@Override
	public void setBill_no(long bill_no) {
		_medicine.setBill_no(bill_no);
	}

	/**
	* Returns the id_drug of this medicine.
	*
	* @return the id_drug of this medicine
	*/
	@Override
	public long getId_drug() {
		return _medicine.getId_drug();
	}

	/**
	* Sets the id_drug of this medicine.
	*
	* @param id_drug the id_drug of this medicine
	*/
	@Override
	public void setId_drug(long id_drug) {
		_medicine.setId_drug(id_drug);
	}

	/**
	* Returns the quantity of this medicine.
	*
	* @return the quantity of this medicine
	*/
	@Override
	public int getQuantity() {
		return _medicine.getQuantity();
	}

	/**
	* Sets the quantity of this medicine.
	*
	* @param quantity the quantity of this medicine
	*/
	@Override
	public void setQuantity(int quantity) {
		_medicine.setQuantity(quantity);
	}

	/**
	* Returns the remark of this medicine.
	*
	* @return the remark of this medicine
	*/
	@Override
	public java.lang.String getRemark() {
		return _medicine.getRemark();
	}

	/**
	* Sets the remark of this medicine.
	*
	* @param remark the remark of this medicine
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_medicine.setRemark(remark);
	}

	@Override
	public boolean isNew() {
		return _medicine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_medicine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _medicine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_medicine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _medicine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _medicine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_medicine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _medicine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_medicine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_medicine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_medicine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MedicineWrapper((Medicine)_medicine.clone());
	}

	@Override
	public int compareTo(org.pn.model.Medicine medicine) {
		return _medicine.compareTo(medicine);
	}

	@Override
	public int hashCode() {
		return _medicine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Medicine> toCacheModel() {
		return _medicine.toCacheModel();
	}

	@Override
	public org.pn.model.Medicine toEscapedModel() {
		return new MedicineWrapper(_medicine.toEscapedModel());
	}

	@Override
	public org.pn.model.Medicine toUnescapedModel() {
		return new MedicineWrapper(_medicine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _medicine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _medicine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_medicine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MedicineWrapper)) {
			return false;
		}

		MedicineWrapper medicineWrapper = (MedicineWrapper)obj;

		if (Validator.equals(_medicine, medicineWrapper._medicine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Medicine getWrappedMedicine() {
		return _medicine;
	}

	@Override
	public Medicine getWrappedModel() {
		return _medicine;
	}

	@Override
	public void resetOriginalValues() {
		_medicine.resetOriginalValues();
	}

	private Medicine _medicine;
}