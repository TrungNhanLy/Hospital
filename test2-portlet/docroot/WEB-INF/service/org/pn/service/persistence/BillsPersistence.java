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

package org.pn.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.pn.model.Bills;

/**
 * The persistence interface for the bills service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see BillsPersistenceImpl
 * @see BillsUtil
 * @generated
 */
public interface BillsPersistence extends BasePersistence<Bills> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BillsUtil} to access the bills persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the bills in the entity cache if it is enabled.
	*
	* @param bills the bills
	*/
	public void cacheResult(org.pn.model.Bills bills);

	/**
	* Caches the billses in the entity cache if it is enabled.
	*
	* @param billses the billses
	*/
	public void cacheResult(java.util.List<org.pn.model.Bills> billses);

	/**
	* Creates a new bills with the primary key. Does not add the bills to the database.
	*
	* @param bill_no the primary key for the new bills
	* @return the new bills
	*/
	public org.pn.model.Bills create(long bill_no);

	/**
	* Removes the bills with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bill_no the primary key of the bills
	* @return the bills that was removed
	* @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Bills remove(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchBillsException;

	public org.pn.model.Bills updateImpl(org.pn.model.Bills bills)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bills with the primary key or throws a {@link org.pn.NoSuchBillsException} if it could not be found.
	*
	* @param bill_no the primary key of the bills
	* @return the bills
	* @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Bills findByPrimaryKey(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchBillsException;

	/**
	* Returns the bills with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bill_no the primary key of the bills
	* @return the bills, or <code>null</code> if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Bills fetchByPrimaryKey(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the billses.
	*
	* @return the billses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Bills> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the billses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.BillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of billses
	* @param end the upper bound of the range of billses (not inclusive)
	* @return the range of billses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Bills> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the billses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.BillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of billses
	* @param end the upper bound of the range of billses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of billses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Bills> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the billses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of billses.
	*
	* @return the number of billses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}