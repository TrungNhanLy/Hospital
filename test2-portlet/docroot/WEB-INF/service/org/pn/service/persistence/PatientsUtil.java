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

import org.pn.model.Patients;

import java.util.List;

/**
 * The persistence utility for the patients service. This utility wraps {@link PatientsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see PatientsPersistence
 * @see PatientsPersistenceImpl
 * @generated
 */
public class PatientsUtil {
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
	public static void clearCache(Patients patients) {
		getPersistence().clearCache(patients);
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
	public static List<Patients> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Patients> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Patients> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Patients update(Patients patients) throws SystemException {
		return getPersistence().update(patients);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Patients update(Patients patients,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(patients, serviceContext);
	}

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients
	*/
	public static void cacheResult(org.pn.model.Patients patients) {
		getPersistence().cacheResult(patients);
	}

	/**
	* Caches the patientses in the entity cache if it is enabled.
	*
	* @param patientses the patientses
	*/
	public static void cacheResult(
		java.util.List<org.pn.model.Patients> patientses) {
		getPersistence().cacheResult(patientses);
	}

	/**
	* Creates a new patients with the primary key. Does not add the patients to the database.
	*
	* @param id_patient the primary key for the new patients
	* @return the new patients
	*/
	public static org.pn.model.Patients create(long id_patient) {
		return getPersistence().create(id_patient);
	}

	/**
	* Removes the patients with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_patient the primary key of the patients
	* @return the patients that was removed
	* @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Patients remove(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchPatientsException {
		return getPersistence().remove(id_patient);
	}

	public static org.pn.model.Patients updateImpl(
		org.pn.model.Patients patients)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(patients);
	}

	/**
	* Returns the patients with the primary key or throws a {@link org.pn.NoSuchPatientsException} if it could not be found.
	*
	* @param id_patient the primary key of the patients
	* @return the patients
	* @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Patients findByPrimaryKey(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchPatientsException {
		return getPersistence().findByPrimaryKey(id_patient);
	}

	/**
	* Returns the patients with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_patient the primary key of the patients
	* @return the patients, or <code>null</code> if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Patients fetchByPrimaryKey(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_patient);
	}

	/**
	* Returns all the patientses.
	*
	* @return the patientses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Patients> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the patientses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.PatientsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of patientses
	* @param end the upper bound of the range of patientses (not inclusive)
	* @return the range of patientses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Patients> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the patientses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.PatientsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of patientses
	* @param end the upper bound of the range of patientses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of patientses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Patients> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the patientses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of patientses.
	*
	* @return the number of patientses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PatientsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PatientsPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					PatientsPersistence.class.getName());

			ReferenceRegistry.registerReference(PatientsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PatientsPersistence persistence) {
	}

	private static PatientsPersistence _persistence;
}