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

import org.pn.model.Staffs;

/**
 * The persistence interface for the staffs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see StaffsPersistenceImpl
 * @see StaffsUtil
 * @generated
 */
public interface StaffsPersistence extends BasePersistence<Staffs> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StaffsUtil} to access the staffs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the staffs in the entity cache if it is enabled.
	*
	* @param staffs the staffs
	*/
	public void cacheResult(org.pn.model.Staffs staffs);

	/**
	* Caches the staffses in the entity cache if it is enabled.
	*
	* @param staffses the staffses
	*/
	public void cacheResult(java.util.List<org.pn.model.Staffs> staffses);

	/**
	* Creates a new staffs with the primary key. Does not add the staffs to the database.
	*
	* @param id_staff the primary key for the new staffs
	* @return the new staffs
	*/
	public org.pn.model.Staffs create(long id_staff);

	/**
	* Removes the staffs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_staff the primary key of the staffs
	* @return the staffs that was removed
	* @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Staffs remove(long id_staff)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStaffsException;

	public org.pn.model.Staffs updateImpl(org.pn.model.Staffs staffs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the staffs with the primary key or throws a {@link org.pn.NoSuchStaffsException} if it could not be found.
	*
	* @param id_staff the primary key of the staffs
	* @return the staffs
	* @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Staffs findByPrimaryKey(long id_staff)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStaffsException;

	/**
	* Returns the staffs with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_staff the primary key of the staffs
	* @return the staffs, or <code>null</code> if a staffs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Staffs fetchByPrimaryKey(long id_staff)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the staffses.
	*
	* @return the staffses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Staffs> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the staffses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of staffses
	* @param end the upper bound of the range of staffses (not inclusive)
	* @return the range of staffses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Staffs> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the staffses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of staffses
	* @param end the upper bound of the range of staffses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of staffses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Staffs> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the staffses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of staffses.
	*
	* @return the number of staffses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}