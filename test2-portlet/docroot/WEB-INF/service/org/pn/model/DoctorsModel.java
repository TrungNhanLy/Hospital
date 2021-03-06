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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Doctors service. Represents a row in the &quot;hos_doctor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.pn.model.impl.DoctorsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.pn.model.impl.DoctorsImpl}.
 * </p>
 *
 * @author thuctap
 * @see Doctors
 * @see org.pn.model.impl.DoctorsImpl
 * @see org.pn.model.impl.DoctorsModelImpl
 * @generated
 */
public interface DoctorsModel extends BaseModel<Doctors> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a doctors model instance should use the {@link Doctors} interface instead.
	 */

	/**
	 * Returns the primary key of this doctors.
	 *
	 * @return the primary key of this doctors
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this doctors.
	 *
	 * @param primaryKey the primary key of this doctors
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id_doctor of this doctors.
	 *
	 * @return the id_doctor of this doctors
	 */
	public long getId_doctor();

	/**
	 * Sets the id_doctor of this doctors.
	 *
	 * @param id_doctor the id_doctor of this doctors
	 */
	public void setId_doctor(long id_doctor);

	/**
	 * Returns the name of this doctors.
	 *
	 * @return the name of this doctors
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this doctors.
	 *
	 * @param name the name of this doctors
	 */
	public void setName(String name);

	/**
	 * Returns the address of this doctors.
	 *
	 * @return the address of this doctors
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this doctors.
	 *
	 * @param address the address of this doctors
	 */
	public void setAddress(String address);

	/**
	 * Returns the position of this doctors.
	 *
	 * @return the position of this doctors
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this doctors.
	 *
	 * @param position the position of this doctors
	 */
	public void setPosition(String position);

	/**
	 * Returns the gender of this doctors.
	 *
	 * @return the gender of this doctors
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this doctors.
	 *
	 * @param gender the gender of this doctors
	 */
	public void setGender(String gender);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(org.pn.model.Doctors doctors);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.pn.model.Doctors> toCacheModel();

	@Override
	public org.pn.model.Doctors toEscapedModel();

	@Override
	public org.pn.model.Doctors toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}