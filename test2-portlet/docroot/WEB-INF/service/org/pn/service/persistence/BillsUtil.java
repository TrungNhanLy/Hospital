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

import org.pn.model.Bills;

import java.util.List;

/**
 * The persistence utility for the bills service. This utility wraps {@link BillsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see BillsPersistence
 * @see BillsPersistenceImpl
 * @generated
 */
public class BillsUtil {
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
	public static void clearCache(Bills bills) {
		getPersistence().clearCache(bills);
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
	public static List<Bills> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bills> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bills> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Bills update(Bills bills) throws SystemException {
		return getPersistence().update(bills);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Bills update(Bills bills, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(bills, serviceContext);
	}

	/**
	* Caches the bills in the entity cache if it is enabled.
	*
	* @param bills the bills
	*/
	public static void cacheResult(org.pn.model.Bills bills) {
		getPersistence().cacheResult(bills);
	}

	/**
	* Caches the billses in the entity cache if it is enabled.
	*
	* @param billses the billses
	*/
	public static void cacheResult(java.util.List<org.pn.model.Bills> billses) {
		getPersistence().cacheResult(billses);
	}

	/**
	* Creates a new bills with the primary key. Does not add the bills to the database.
	*
	* @param bill_no the primary key for the new bills
	* @return the new bills
	*/
	public static org.pn.model.Bills create(long bill_no) {
		return getPersistence().create(bill_no);
	}

	/**
	* Removes the bills with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bill_no the primary key of the bills
	* @return the bills that was removed
	* @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Bills remove(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchBillsException {
		return getPersistence().remove(bill_no);
	}

	public static org.pn.model.Bills updateImpl(org.pn.model.Bills bills)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bills);
	}

	/**
	* Returns the bills with the primary key or throws a {@link org.pn.NoSuchBillsException} if it could not be found.
	*
	* @param bill_no the primary key of the bills
	* @return the bills
	* @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Bills findByPrimaryKey(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchBillsException {
		return getPersistence().findByPrimaryKey(bill_no);
	}

	/**
	* Returns the bills with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bill_no the primary key of the bills
	* @return the bills, or <code>null</code> if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Bills fetchByPrimaryKey(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bill_no);
	}

	/**
	* Returns all the billses.
	*
	* @return the billses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Bills> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.pn.model.Bills> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.pn.model.Bills> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the billses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of billses.
	*
	* @return the number of billses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BillsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BillsPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					BillsPersistence.class.getName());

			ReferenceRegistry.registerReference(BillsUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BillsPersistence persistence) {
	}

	private static BillsPersistence _persistence;
}