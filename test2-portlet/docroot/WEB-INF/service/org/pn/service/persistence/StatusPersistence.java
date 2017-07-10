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

import org.pn.model.Status;

/**
 * The persistence interface for the status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see StatusPersistenceImpl
 * @see StatusUtil
 * @generated
 */
public interface StatusPersistence extends BasePersistence<Status> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatusUtil} to access the status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the status in the entity cache if it is enabled.
	*
	* @param status the status
	*/
	public void cacheResult(org.pn.model.Status status);

	/**
	* Caches the statuses in the entity cache if it is enabled.
	*
	* @param statuses the statuses
	*/
	public void cacheResult(java.util.List<org.pn.model.Status> statuses);

	/**
	* Creates a new status with the primary key. Does not add the status to the database.
	*
	* @param status_no the primary key for the new status
	* @return the new status
	*/
	public org.pn.model.Status create(long status_no);

	/**
	* Removes the status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param status_no the primary key of the status
	* @return the status that was removed
	* @throws org.pn.NoSuchStatusException if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Status remove(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStatusException;

	public org.pn.model.Status updateImpl(org.pn.model.Status status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the status with the primary key or throws a {@link org.pn.NoSuchStatusException} if it could not be found.
	*
	* @param status_no the primary key of the status
	* @return the status
	* @throws org.pn.NoSuchStatusException if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Status findByPrimaryKey(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStatusException;

	/**
	* Returns the status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param status_no the primary key of the status
	* @return the status, or <code>null</code> if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Status fetchByPrimaryKey(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the statuses.
	*
	* @return the statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Status> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statuses
	* @param end the upper bound of the range of statuses (not inclusive)
	* @return the range of statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Status> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statuses
	* @param end the upper bound of the range of statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Status> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statuses.
	*
	* @return the number of statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}