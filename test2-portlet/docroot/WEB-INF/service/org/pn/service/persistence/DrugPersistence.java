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

import org.pn.model.Drug;

/**
 * The persistence interface for the drug service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DrugPersistenceImpl
 * @see DrugUtil
 * @generated
 */
public interface DrugPersistence extends BasePersistence<Drug> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DrugUtil} to access the drug persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the drug in the entity cache if it is enabled.
	*
	* @param drug the drug
	*/
	public void cacheResult(org.pn.model.Drug drug);

	/**
	* Caches the drugs in the entity cache if it is enabled.
	*
	* @param drugs the drugs
	*/
	public void cacheResult(java.util.List<org.pn.model.Drug> drugs);

	/**
	* Creates a new drug with the primary key. Does not add the drug to the database.
	*
	* @param id_drug the primary key for the new drug
	* @return the new drug
	*/
	public org.pn.model.Drug create(long id_drug);

	/**
	* Removes the drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_drug the primary key of the drug
	* @return the drug that was removed
	* @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Drug remove(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDrugException;

	public org.pn.model.Drug updateImpl(org.pn.model.Drug drug)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the drug with the primary key or throws a {@link org.pn.NoSuchDrugException} if it could not be found.
	*
	* @param id_drug the primary key of the drug
	* @return the drug
	* @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Drug findByPrimaryKey(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDrugException;

	/**
	* Returns the drug with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_drug the primary key of the drug
	* @return the drug, or <code>null</code> if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Drug fetchByPrimaryKey(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the drugs.
	*
	* @return the drugs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Drug> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DrugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of drugs
	* @param end the upper bound of the range of drugs (not inclusive)
	* @return the range of drugs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Drug> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DrugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of drugs
	* @param end the upper bound of the range of drugs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of drugs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Drug> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the drugs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of drugs.
	*
	* @return the number of drugs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}