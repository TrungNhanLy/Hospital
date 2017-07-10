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

import org.pn.model.Diagnosis;

import java.util.List;

/**
 * The persistence utility for the diagnosis service. This utility wraps {@link DiagnosisPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DiagnosisPersistence
 * @see DiagnosisPersistenceImpl
 * @generated
 */
public class DiagnosisUtil {
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
	public static void clearCache(Diagnosis diagnosis) {
		getPersistence().clearCache(diagnosis);
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
	public static List<Diagnosis> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Diagnosis> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Diagnosis> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Diagnosis update(Diagnosis diagnosis)
		throws SystemException {
		return getPersistence().update(diagnosis);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Diagnosis update(Diagnosis diagnosis,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(diagnosis, serviceContext);
	}

	/**
	* Caches the diagnosis in the entity cache if it is enabled.
	*
	* @param diagnosis the diagnosis
	*/
	public static void cacheResult(org.pn.model.Diagnosis diagnosis) {
		getPersistence().cacheResult(diagnosis);
	}

	/**
	* Caches the diagnosises in the entity cache if it is enabled.
	*
	* @param diagnosises the diagnosises
	*/
	public static void cacheResult(
		java.util.List<org.pn.model.Diagnosis> diagnosises) {
		getPersistence().cacheResult(diagnosises);
	}

	/**
	* Creates a new diagnosis with the primary key. Does not add the diagnosis to the database.
	*
	* @param diagnosis_no the primary key for the new diagnosis
	* @return the new diagnosis
	*/
	public static org.pn.model.Diagnosis create(long diagnosis_no) {
		return getPersistence().create(diagnosis_no);
	}

	/**
	* Removes the diagnosis with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis that was removed
	* @throws org.pn.NoSuchDiagnosisException if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Diagnosis remove(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDiagnosisException {
		return getPersistence().remove(diagnosis_no);
	}

	public static org.pn.model.Diagnosis updateImpl(
		org.pn.model.Diagnosis diagnosis)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(diagnosis);
	}

	/**
	* Returns the diagnosis with the primary key or throws a {@link org.pn.NoSuchDiagnosisException} if it could not be found.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis
	* @throws org.pn.NoSuchDiagnosisException if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Diagnosis findByPrimaryKey(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDiagnosisException {
		return getPersistence().findByPrimaryKey(diagnosis_no);
	}

	/**
	* Returns the diagnosis with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis, or <code>null</code> if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Diagnosis fetchByPrimaryKey(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(diagnosis_no);
	}

	/**
	* Returns all the diagnosises.
	*
	* @return the diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Diagnosis> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the diagnosises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DiagnosisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of diagnosises
	* @param end the upper bound of the range of diagnosises (not inclusive)
	* @return the range of diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Diagnosis> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the diagnosises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DiagnosisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of diagnosises
	* @param end the upper bound of the range of diagnosises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Diagnosis> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the diagnosises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of diagnosises.
	*
	* @return the number of diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DiagnosisPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DiagnosisPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					DiagnosisPersistence.class.getName());

			ReferenceRegistry.registerReference(DiagnosisUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DiagnosisPersistence persistence) {
	}

	private static DiagnosisPersistence _persistence;
}