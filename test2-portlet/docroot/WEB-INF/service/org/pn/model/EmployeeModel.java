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
 * The base model interface for the Employee service. Represents a row in the &quot;infomationpatient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.pn.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.pn.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author thuctap
 * @see Employee
 * @see org.pn.model.impl.EmployeeImpl
 * @see org.pn.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id patient of this employee.
	 *
	 * @return the id patient of this employee
	 */
	public long getIdPatient();

	/**
	 * Sets the id patient of this employee.
	 *
	 * @param idPatient the id patient of this employee
	 */
	public void setIdPatient(long idPatient);

	/**
	 * Returns the name of this employee.
	 *
	 * @return the name of this employee
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employee.
	 *
	 * @param name the name of this employee
	 */
	public void setName(String name);

	/**
	 * Returns the identity cart of this employee.
	 *
	 * @return the identity cart of this employee
	 */
	@AutoEscape
	public String getIdentityCart();

	/**
	 * Sets the identity cart of this employee.
	 *
	 * @param identityCart the identity cart of this employee
	 */
	public void setIdentityCart(String identityCart);

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
	public int compareTo(org.pn.model.Employee employee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.pn.model.Employee> toCacheModel();

	@Override
	public org.pn.model.Employee toEscapedModel();

	@Override
	public org.pn.model.Employee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}