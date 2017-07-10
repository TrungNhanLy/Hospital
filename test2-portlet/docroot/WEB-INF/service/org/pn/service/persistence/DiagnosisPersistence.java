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

import org.pn.model.Diagnosis;

/**
 * The persistence interface for the diagnosis service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DiagnosisPersistenceImpl
 * @see DiagnosisUtil
 * @generated
 */
public interface DiagnosisPersistence extends BasePersistence<Diagnosis> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DiagnosisUtil} to access the diagnosis persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the diagnosis in the entity cache if it is enabled.
	*
	* @param diagnosis the diagnosis
	*/
	public void cacheResult(org.pn.model.Diagnosis diagnosis);

	/**
	* Caches the diagnosises in the entity cache if it is enabled.
	*
	* @param diagnosises the diagnosises
	*/
	public void cacheResult(java.util.List<org.pn.model.Diagnosis> diagnosises);

	/**
	* Creates a new diagnosis with the primary key. Does not add the diagnosis to the database.
	*
	* @param diagnosis_no the primary key for the new diagnosis
	* @return the new diagnosis
	*/
	public org.pn.model.Diagnosis create(long diagnosis_no);

	/**
	* Removes the diagnosis with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis that was removed
	* @throws org.pn.NoSuchDiagnosisException if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Diagnosis remove(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDiagnosisException;

	public org.pn.model.Diagnosis updateImpl(org.pn.model.Diagnosis diagnosis)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the diagnosis with the primary key or throws a {@link org.pn.NoSuchDiagnosisException} if it could not be found.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis
	* @throws org.pn.NoSuchDiagnosisException if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Diagnosis findByPrimaryKey(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDiagnosisException;

	/**
	* Returns the diagnosis with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param diagnosis_no the primary key of the diagnosis
	* @return the diagnosis, or <code>null</code> if a diagnosis with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Diagnosis fetchByPrimaryKey(long diagnosis_no)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the diagnosises.
	*
	* @return the diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Diagnosis> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.pn.model.Diagnosis> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.pn.model.Diagnosis> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the diagnosises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of diagnosises.
	*
	* @return the number of diagnosises
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}