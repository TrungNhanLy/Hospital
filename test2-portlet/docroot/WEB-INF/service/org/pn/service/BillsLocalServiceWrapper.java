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

package org.pn.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BillsLocalService}.
 *
 * @author thuctap
 * @see BillsLocalService
 * @generated
 */
public class BillsLocalServiceWrapper implements BillsLocalService,
	ServiceWrapper<BillsLocalService> {
	public BillsLocalServiceWrapper(BillsLocalService billsLocalService) {
		_billsLocalService = billsLocalService;
	}

	/**
	* Adds the bills to the database. Also notifies the appropriate model listeners.
	*
	* @param bills the bills
	* @return the bills that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Bills addBills(org.pn.model.Bills bills)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.addBills(bills);
	}

	/**
	* Creates a new bills with the primary key. Does not add the bills to the database.
	*
	* @param bill_no the primary key for the new bills
	* @return the new bills
	*/
	@Override
	public org.pn.model.Bills createBills(long bill_no) {
		return _billsLocalService.createBills(bill_no);
	}

	/**
	* Deletes the bills with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bill_no the primary key of the bills
	* @return the bills that was removed
	* @throws PortalException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Bills deleteBills(long bill_no)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.deleteBills(bill_no);
	}

	/**
	* Deletes the bills from the database. Also notifies the appropriate model listeners.
	*
	* @param bills the bills
	* @return the bills that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Bills deleteBills(org.pn.model.Bills bills)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.deleteBills(bills);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _billsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.BillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.BillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.pn.model.Bills fetchBills(long bill_no)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.fetchBills(bill_no);
	}

	/**
	* Returns the bills with the primary key.
	*
	* @param bill_no the primary key of the bills
	* @return the bills
	* @throws PortalException if a bills with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Bills getBills(long bill_no)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.getBills(bill_no);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.pn.model.Bills> getBillses(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.getBillses(start, end);
	}

	/**
	* Returns the number of billses.
	*
	* @return the number of billses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBillsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.getBillsesCount();
	}

	/**
	* Updates the bills in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bills the bills
	* @return the bills that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Bills updateBills(org.pn.model.Bills bills)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _billsLocalService.updateBills(bills);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _billsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_billsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _billsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BillsLocalService getWrappedBillsLocalService() {
		return _billsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBillsLocalService(BillsLocalService billsLocalService) {
		_billsLocalService = billsLocalService;
	}

	@Override
	public BillsLocalService getWrappedService() {
		return _billsLocalService;
	}

	@Override
	public void setWrappedService(BillsLocalService billsLocalService) {
		_billsLocalService = billsLocalService;
	}

	private BillsLocalService _billsLocalService;
}