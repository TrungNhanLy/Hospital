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
 * This class is a wrapper for {@link Drug}.
 * </p>
 *
 * @author thuctap
 * @see Drug
 * @generated
 */
public class DrugWrapper implements Drug, ModelWrapper<Drug> {
	public DrugWrapper(Drug drug) {
		_drug = drug;
	}

	@Override
	public Class<?> getModelClass() {
		return Drug.class;
	}

	@Override
	public String getModelClassName() {
		return Drug.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_drug", getId_drug());
		attributes.put("name_medicine", getName_medicine());
		attributes.put("quantity", getQuantity());
		attributes.put("price", getPrice());
		attributes.put("expiration_date", getExpiration_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_drug = (Long)attributes.get("id_drug");

		if (id_drug != null) {
			setId_drug(id_drug);
		}

		String name_medicine = (String)attributes.get("name_medicine");

		if (name_medicine != null) {
			setName_medicine(name_medicine);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Date expiration_date = (Date)attributes.get("expiration_date");

		if (expiration_date != null) {
			setExpiration_date(expiration_date);
		}
	}

	/**
	* Returns the primary key of this drug.
	*
	* @return the primary key of this drug
	*/
	@Override
	public long getPrimaryKey() {
		return _drug.getPrimaryKey();
	}

	/**
	* Sets the primary key of this drug.
	*
	* @param primaryKey the primary key of this drug
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_drug.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id_drug of this drug.
	*
	* @return the id_drug of this drug
	*/
	@Override
	public long getId_drug() {
		return _drug.getId_drug();
	}

	/**
	* Sets the id_drug of this drug.
	*
	* @param id_drug the id_drug of this drug
	*/
	@Override
	public void setId_drug(long id_drug) {
		_drug.setId_drug(id_drug);
	}

	/**
	* Returns the name_medicine of this drug.
	*
	* @return the name_medicine of this drug
	*/
	@Override
	public java.lang.String getName_medicine() {
		return _drug.getName_medicine();
	}

	/**
	* Sets the name_medicine of this drug.
	*
	* @param name_medicine the name_medicine of this drug
	*/
	@Override
	public void setName_medicine(java.lang.String name_medicine) {
		_drug.setName_medicine(name_medicine);
	}

	/**
	* Returns the quantity of this drug.
	*
	* @return the quantity of this drug
	*/
	@Override
	public int getQuantity() {
		return _drug.getQuantity();
	}

	/**
	* Sets the quantity of this drug.
	*
	* @param quantity the quantity of this drug
	*/
	@Override
	public void setQuantity(int quantity) {
		_drug.setQuantity(quantity);
	}

	/**
	* Returns the price of this drug.
	*
	* @return the price of this drug
	*/
	@Override
	public java.lang.String getPrice() {
		return _drug.getPrice();
	}

	/**
	* Sets the price of this drug.
	*
	* @param price the price of this drug
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_drug.setPrice(price);
	}

	/**
	* Returns the expiration_date of this drug.
	*
	* @return the expiration_date of this drug
	*/
	@Override
	public java.util.Date getExpiration_date() {
		return _drug.getExpiration_date();
	}

	/**
	* Sets the expiration_date of this drug.
	*
	* @param expiration_date the expiration_date of this drug
	*/
	@Override
	public void setExpiration_date(java.util.Date expiration_date) {
		_drug.setExpiration_date(expiration_date);
	}

	@Override
	public boolean isNew() {
		return _drug.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_drug.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _drug.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_drug.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _drug.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _drug.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_drug.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _drug.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_drug.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_drug.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_drug.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DrugWrapper((Drug)_drug.clone());
	}

	@Override
	public int compareTo(org.pn.model.Drug drug) {
		return _drug.compareTo(drug);
	}

	@Override
	public int hashCode() {
		return _drug.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.pn.model.Drug> toCacheModel() {
		return _drug.toCacheModel();
	}

	@Override
	public org.pn.model.Drug toEscapedModel() {
		return new DrugWrapper(_drug.toEscapedModel());
	}

	@Override
	public org.pn.model.Drug toUnescapedModel() {
		return new DrugWrapper(_drug.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _drug.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _drug.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_drug.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DrugWrapper)) {
			return false;
		}

		DrugWrapper drugWrapper = (DrugWrapper)obj;

		if (Validator.equals(_drug, drugWrapper._drug)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Drug getWrappedDrug() {
		return _drug;
	}

	@Override
	public Drug getWrappedModel() {
		return _drug;
	}

	@Override
	public void resetOriginalValues() {
		_drug.resetOriginalValues();
	}

	private Drug _drug;
}