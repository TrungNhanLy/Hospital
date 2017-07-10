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
 * Provides a wrapper for {@link StaffsLocalService}.
 *
 * @author thuctap
 * @see StaffsLocalService
 * @generated
 */
public class StaffsLocalServiceWrapper implements StaffsLocalService,
	ServiceWrapper<StaffsLocalService> {
	public StaffsLocalServiceWrapper(StaffsLocalService staffsLocalService) {
		_staffsLocalService = staffsLocalService;
	}

	/**
	* Adds the staffs to the database. Also notifies the appropriate model listeners.
	*
	* @param staffs the staffs
	* @return the staffs that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Staffs addStaffs(org.pn.model.Staffs staffs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.addStaffs(staffs);
	}

	/**
	* Creates a new staffs with the primary key. Does not add the staffs to the database.
	*
	* @param id_staff the primary key for the new staffs
	* @return the new staffs
	*/
	@Override
	public org.pn.model.Staffs createStaffs(long id_staff) {
		return _staffsLocalService.createStaffs(id_staff);
	}

	/**
	* Deletes the staffs with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_staff the primary key of the staffs
	* @return the staffs that was removed
	* @throws PortalException if a staffs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Staffs deleteStaffs(long id_staff)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.deleteStaffs(id_staff);
	}

	/**
	* Deletes the staffs from the database. Also notifies the appropriate model listeners.
	*
	* @param staffs the staffs
	* @return the staffs that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Staffs deleteStaffs(org.pn.model.Staffs staffs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.deleteStaffs(staffs);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _staffsLocalService.dynamicQuery();
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
		return _staffsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _staffsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _staffsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _staffsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _staffsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.pn.model.Staffs fetchStaffs(long id_staff)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.fetchStaffs(id_staff);
	}

	/**
	* Returns the staffs with the primary key.
	*
	* @param id_staff the primary key of the staffs
	* @return the staffs
	* @throws PortalException if a staffs with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Staffs getStaffs(long id_staff)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.getStaffs(id_staff);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the staffses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of staffses
	* @param end the upper bound of the range of staffses (not inclusive)
	* @return the range of staffses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.pn.model.Staffs> getStaffses(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.getStaffses(start, end);
	}

	/**
	* Returns the number of staffses.
	*
	* @return the number of staffses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStaffsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.getStaffsesCount();
	}

	/**
	* Updates the staffs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param staffs the staffs
	* @return the staffs that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Staffs updateStaffs(org.pn.model.Staffs staffs)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _staffsLocalService.updateStaffs(staffs);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _staffsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_staffsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _staffsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StaffsLocalService getWrappedStaffsLocalService() {
		return _staffsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStaffsLocalService(
		StaffsLocalService staffsLocalService) {
		_staffsLocalService = staffsLocalService;
	}

	@Override
	public StaffsLocalService getWrappedService() {
		return _staffsLocalService;
	}

	@Override
	public void setWrappedService(StaffsLocalService staffsLocalService) {
		_staffsLocalService = staffsLocalService;
	}

	private StaffsLocalService _staffsLocalService;
}