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

import org.pn.model.Doctors;

import java.util.List;

/**
 * The persistence utility for the doctors service. This utility wraps {@link DoctorsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DoctorsPersistence
 * @see DoctorsPersistenceImpl
 * @generated
 */
public class DoctorsUtil {
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
	public static void clearCache(Doctors doctors) {
		getPersistence().clearCache(doctors);
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
	public static List<Doctors> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Doctors> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Doctors> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Doctors update(Doctors doctors) throws SystemException {
		return getPersistence().update(doctors);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Doctors update(Doctors doctors, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(doctors, serviceContext);
	}

	/**
	* Caches the doctors in the entity cache if it is enabled.
	*
	* @param doctors the doctors
	*/
	public static void cacheResult(org.pn.model.Doctors doctors) {
		getPersistence().cacheResult(doctors);
	}

	/**
	* Caches the doctorses in the entity cache if it is enabled.
	*
	* @param doctorses the doctorses
	*/
	public static void cacheResult(
		java.util.List<org.pn.model.Doctors> doctorses) {
		getPersistence().cacheResult(doctorses);
	}

	/**
	* Creates a new doctors with the primary key. Does not add the doctors to the database.
	*
	* @param id_doctor the primary key for the new doctors
	* @return the new doctors
	*/
	public static org.pn.model.Doctors create(long id_doctor) {
		return getPersistence().create(id_doctor);
	}

	/**
	* Removes the doctors with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_doctor the primary key of the doctors
	* @return the doctors that was removed
	* @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Doctors remove(long id_doctor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDoctorsException {
		return getPersistence().remove(id_doctor);
	}

	public static org.pn.model.Doctors updateImpl(org.pn.model.Doctors doctors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(doctors);
	}

	/**
	* Returns the doctors with the primary key or throws a {@link org.pn.NoSuchDoctorsException} if it could not be found.
	*
	* @param id_doctor the primary key of the doctors
	* @return the doctors
	* @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Doctors findByPrimaryKey(long id_doctor)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDoctorsException {
		return getPersistence().findByPrimaryKey(id_doctor);
	}

	/**
	* Returns the doctors with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_doctor the primary key of the doctors
	* @return the doctors, or <code>null</code> if a doctors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Doctors fetchByPrimaryKey(long id_doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_doctor);
	}

	/**
	* Returns all the doctorses.
	*
	* @return the doctorses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Doctors> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the doctorses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctorses
	* @param end the upper bound of the range of doctorses (not inclusive)
	* @return the range of doctorses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Doctors> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the doctorses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctorses
	* @param end the upper bound of the range of doctorses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of doctorses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Doctors> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the doctorses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of doctorses.
	*
	* @return the number of doctorses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DoctorsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DoctorsPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					DoctorsPersistence.class.getName());

			ReferenceRegistry.registerReference(DoctorsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DoctorsPersistence persistence) {
	}

	private static DoctorsPersistence _persistence;
}