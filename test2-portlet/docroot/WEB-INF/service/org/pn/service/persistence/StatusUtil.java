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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.pn.model.Status;

import java.util.List;

/**
 * The persistence utility for the status service. This utility wraps {@link StatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see StatusPersistence
 * @see StatusPersistenceImpl
 * @generated
 */
public class StatusUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Status status) {
		getPersistence().clearCache(status);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Status> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Status> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Status> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Status update(Status status) throws SystemException {
		return getPersistence().update(status);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Status update(Status status, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(status, serviceContext);
	}

	/**
	* Caches the status in the entity cache if it is enabled.
	*
	* @param status the status
	*/
	public static void cacheResult(org.pn.model.Status status) {
		getPersistence().cacheResult(status);
	}

	/**
	* Caches the statuses in the entity cache if it is enabled.
	*
	* @param statuses the statuses
	*/
	public static void cacheResult(java.util.List<org.pn.model.Status> statuses) {
		getPersistence().cacheResult(statuses);
	}

	/**
	* Creates a new status with the primary key. Does not add the status to the database.
	*
	* @param status_no the primary key for the new status
	* @return the new status
	*/
	public static org.pn.model.Status create(long status_no) {
		return getPersistence().create(status_no);
	}

	/**
	* Removes the status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param status_no the primary key of the status
	* @return the status that was removed
	* @throws org.pn.NoSuchStatusException if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Status remove(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStatusException {
		return getPersistence().remove(status_no);
	}

	public static org.pn.model.Status updateImpl(org.pn.model.Status status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(status);
	}

	/**
	* Returns the status with the primary key or throws a {@link org.pn.NoSuchStatusException} if it could not be found.
	*
	* @param status_no the primary key of the status
	* @return the status
	* @throws org.pn.NoSuchStatusException if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Status findByPrimaryKey(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchStatusException {
		return getPersistence().findByPrimaryKey(status_no);
	}

	/**
	* Returns the status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param status_no the primary key of the status
	* @return the status, or <code>null</code> if a status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Status fetchByPrimaryKey(long status_no)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(status_no);
	}

	/**
	* Returns all the statuses.
	*
	* @return the statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Status> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.pn.model.Status> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.pn.model.Status> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of statuses.
	*
	* @return the number of statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StatusPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					StatusPersistence.class.getName());

			ReferenceRegistry.registerReference(StatusUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StatusPersistence persistence) {
	}

	private static StatusPersistence _persistence;
}