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

import org.pn.model.Drug;

import java.util.List;

/**
 * The persistence utility for the drug service. This utility wraps {@link DrugPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DrugPersistence
 * @see DrugPersistenceImpl
 * @generated
 */
public class DrugUtil {
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
	public static void clearCache(Drug drug) {
		getPersistence().clearCache(drug);
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
	public static List<Drug> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Drug> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Drug> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Drug update(Drug drug) throws SystemException {
		return getPersistence().update(drug);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Drug update(Drug drug, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(drug, serviceContext);
	}

	/**
	* Caches the drug in the entity cache if it is enabled.
	*
	* @param drug the drug
	*/
	public static void cacheResult(org.pn.model.Drug drug) {
		getPersistence().cacheResult(drug);
	}

	/**
	* Caches the drugs in the entity cache if it is enabled.
	*
	* @param drugs the drugs
	*/
	public static void cacheResult(java.util.List<org.pn.model.Drug> drugs) {
		getPersistence().cacheResult(drugs);
	}

	/**
	* Creates a new drug with the primary key. Does not add the drug to the database.
	*
	* @param id_drug the primary key for the new drug
	* @return the new drug
	*/
	public static org.pn.model.Drug create(long id_drug) {
		return getPersistence().create(id_drug);
	}

	/**
	* Removes the drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_drug the primary key of the drug
	* @return the drug that was removed
	* @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Drug remove(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDrugException {
		return getPersistence().remove(id_drug);
	}

	public static org.pn.model.Drug updateImpl(org.pn.model.Drug drug)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(drug);
	}

	/**
	* Returns the drug with the primary key or throws a {@link org.pn.NoSuchDrugException} if it could not be found.
	*
	* @param id_drug the primary key of the drug
	* @return the drug
	* @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Drug findByPrimaryKey(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.pn.NoSuchDrugException {
		return getPersistence().findByPrimaryKey(id_drug);
	}

	/**
	* Returns the drug with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_drug the primary key of the drug
	* @return the drug, or <code>null</code> if a drug with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.pn.model.Drug fetchByPrimaryKey(long id_drug)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id_drug);
	}

	/**
	* Returns all the drugs.
	*
	* @return the drugs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.pn.model.Drug> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.pn.model.Drug> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.pn.model.Drug> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the drugs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of drugs.
	*
	* @return the number of drugs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DrugPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DrugPersistence)PortletBeanLocatorUtil.locate(org.pn.service.ClpSerializer.getServletContextName(),
					DrugPersistence.class.getName());

			ReferenceRegistry.registerReference(DrugUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DrugPersistence persistence) {
	}

	private static DrugPersistence _persistence;
}