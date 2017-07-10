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

import org.pn.model.Medicine;

/**
 * The persistence interface for the medicine service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see MedicinePersistenceImpl
 * @see MedicineUtil
 * @generated
 */
public interface MedicinePersistence extends BasePersistence<Medicine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicineUtil} to access the medicine persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the medicine in the entity cache if it is enabled.
	*
	* @param medicine the medicine
	*/
	public void cacheResult(org.pn.model.Medicine medicine);

	/**
	* Caches the medicines in the entity cache if it is enabled.
	*
	* @param medicines the medicines
	*/
	public void cacheResult(java.util.List<org.pn.model.Medicine> medicines);

	/**
	* Creates a new medicine with the primary key. Does not add the medicine to the database.
	*
	* @param id_medicine the primary key for the new medicine
	* @return the new medicine
	*/
	public org.pn.model.Medicine create(long id_medicine);

	/**
	* Removes the medicine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_medicine the primary key of the medicine
	* @return the medicine that was removed
	* @throws org.pn.NoSuchMedicineException if a medicine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Medicine remove(long id_medicine)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchMedicineException;

	public org.pn.model.Medicine updateImpl(org.pn.model.Medicine medicine)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the medicine with the primary key or throws a {@link org.pn.NoSuchMedicineException} if it could not be found.
	*
	* @param id_medicine the primary key of the medicine
	* @return the medicine
	* @throws org.pn.NoSuchMedicineException if a medicine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Medicine findByPrimaryKey(long id_medicine)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchMedicineException;

	/**
	* Returns the medicine with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_medicine the primary key of the medicine
	* @return the medicine, or <code>null</code> if a medicine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.pn.model.Medicine fetchByPrimaryKey(long id_medicine)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the medicines.
	*
	* @return the medicines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Medicine> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the medicines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.MedicineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of medicines
	* @param end the upper bound of the range of medicines (not inclusive)
	* @return the range of medicines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Medicine> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the medicines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.MedicineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of medicines
	* @param end the upper bound of the range of medicines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of medicines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.pn.model.Medicine> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the medicines from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of medicines.
	*
	* @return the number of medicines
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}