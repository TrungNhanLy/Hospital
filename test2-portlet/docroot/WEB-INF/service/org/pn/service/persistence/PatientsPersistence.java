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

import org.pn.model.Patients;

/**
 * The persistence interface for the patients service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see PatientsPersistenceImpl
 * @see PatientsUtil
 * @generated
 */
public interface PatientsPersistence extends BasePersistence<Patients> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PatientsUtil} to access the patients persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the patients in the entity cache if it is enabled.
	*
	* @param patients the patients
	*/
	public void cacheResult(org.pn.model.Patients patients);

	/**
	* Caches the patientses in the entity cache if it is enabled.
	*
	* @param patientses the patientses
	*/
	public void cacheResult(java.util.List<org.pn.model.Patients> patientses);

	/**
	* Creates a new patients with the primary key. Does not add the patients to the database.
	*
	* @param id_patient the primary key for the new patients
	* @return the new patients
	*/
	public org.pn.model.Patients create(long id_patient);

	/**
	* Removes the patients with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_patient the primary key of the patients
	* @return the patients that was removed
	* @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Patients remove(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchPatientsException;

	public org.pn.model.Patients updateImpl(org.pn.model.Patients patients)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the patients with the primary key or throws a {@link org.pn.NoSuchPatientsException} if it could not be found.
	*
	* @param id_patient the primary key of the patients
	* @return the patients
	* @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Patients findByPrimaryKey(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchPatientsException;

	/**
	* Returns the patients with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_patient the primary key of the patients
	* @return the patients, or <code>null</code> if a patients with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Patients fetchByPrimaryKey(long id_patient)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the patientses.
	*
	* @return the patientses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Patients> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.pn.model.Patients> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.pn.model.Patients> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the patientses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of patientses.
	*
	* @return the number of patientses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}