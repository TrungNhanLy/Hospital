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

import org.pn.model.RoomPatient;

import java.util.List;

/**
 * The persistence utility for the room patient service. This utility wraps {@link RoomPatientPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see RoomPatientPersistence
 * @see RoomPatientPersistenceImpl
 * @generated
 */
public class RoomPatientUtil {
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
	public static void clearCache(RoomPatient roomPatient) {
		getPersistence().clearCache(roomPatient);
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
	public static List<RoomPatient> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RoomPatient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RoomPatient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RoomPatient update(RoomPatient roomPatient)
		throws SystemException {
		return getPersistence().update(roomPatient);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RoomPatient update(RoomPatient roomPatient,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(roomPatient, serviceContext);
	}

	/**
	* Caches the room patient in the entity cache if it is enabled.
	*
	* @param roomPatient the room patient
	*/
	public static void cacheResult(org.pn.model.RoomPatient roomPatient) {
		getPersistence().cacheResult(roomPatient);
	}

	/**
	* Caches the room patients in the entity cache if it is enabled.
	*
	* @param roomPatients the room patients
	*/
	public static void cacheResult(
		java.util.List<org.pn.model.RoomPatient> roomPatients) {
		getPersistence().cacheResult(roomPatients);
	}

	/**
	* Creates a new room patient with the primary key. Does not add the room patient to the database.
	*
	* @param room_no the primary key for the new room patient
	* @return the new room patient
	*/
	public static org.pn.model.RoomPatient create(long room_no) {
		return getPersistence().create(room_no);
	}

	/**
	* Removes the room patient with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_no the primary key of the room patient
	* @return the room patient that was removed
	* @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.RoomPatient remove(long room_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchRoomPatientException {
		return getPersistence().remove(room_no);
	}

	public static org.pn.model.RoomPatient updateImpl(
		org.pn.model.RoomPatient roomPatient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(roomPatient);
	}

	/**
	* Returns the room patient with the primary key or throws a {@link org.pn.NoSuchRoomPatientException} if it could not be found.
	*
	* @param room_no the primary key of the room patient
	* @return the room patient
	* @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.RoomPatient findByPrimaryKey(long room_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchRoomPatientException {
		return getPersistence().findByPrimaryKey(room_no);
	}

	/**
	* Returns the room patient with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param room_no the primary key of the room patient
	* @return the room patient, or <code>null</code> if a room patient with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.RoomPatient fetchByPrimaryKey(long room_no)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(room_no);
	}

	/**
	* Returns all the room patients.
	*
	* @return the room patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.RoomPatient> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the room patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.RoomPatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room patients
	* @param end the upper bound of the range of room patients (not inclusive)
	* @return the range of room patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.RoomPatient> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the room patients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.RoomPatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of room patients
	* @param end the upper bound of the range of room patients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of room patients
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.RoomPatient> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the room patients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of room patients.
	*
	* @return the number of room patients
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RoomPatientPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RoomPatientPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					RoomPatientPersistence.class.getName());

			ReferenceRegistry.registerReference(RoomPatientUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RoomPatientPersistence persistence) {
	}

	private static RoomPatientPersistence _persistence;
}