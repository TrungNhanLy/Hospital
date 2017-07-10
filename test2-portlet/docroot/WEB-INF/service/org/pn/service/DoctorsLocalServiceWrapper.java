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
 * Provides a wrapper for {@link DoctorsLocalService}.
 *
 * @author thuctap
 * @see DoctorsLocalService
 * @generated
 */
public class DoctorsLocalServiceWrapper implements DoctorsLocalService,
	ServiceWrapper<DoctorsLocalService> {
	public DoctorsLocalServiceWrapper(DoctorsLocalService doctorsLocalService) {
		_doctorsLocalService = doctorsLocalService;
	}

	/**
	* Adds the doctors to the database. Also notifies the appropriate model listeners.
	*
	* @param doctors the doctors
	* @return the doctors that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Doctors addDoctors(org.pn.model.Doctors doctors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.addDoctors(doctors);
	}

	/**
	* Creates a new doctors with the primary key. Does not add the doctors to the database.
	*
	* @param id_doctor the primary key for the new doctors
	* @return the new doctors
	*/
	@Override
	public org.pn.model.Doctors createDoctors(long id_doctor) {
		return _doctorsLocalService.createDoctors(id_doctor);
	}

	/**
	* Deletes the doctors with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_doctor the primary key of the doctors
	* @return the doctors that was removed
	* @throws PortalException if a doctors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Doctors deleteDoctors(long id_doctor)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.deleteDoctors(id_doctor);
	}

	/**
	* Deletes the doctors from the database. Also notifies the appropriate model listeners.
	*
	* @param doctors the doctors
	* @return the doctors that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Doctors deleteDoctors(org.pn.model.Doctors doctors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.deleteDoctors(doctors);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _doctorsLocalService.dynamicQuery();
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
		return _doctorsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doctorsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _doctorsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _doctorsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _doctorsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.pn.model.Doctors fetchDoctors(long id_doctor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.fetchDoctors(id_doctor);
	}

	/**
	* Returns the doctors with the primary key.
	*
	* @param id_doctor the primary key of the doctors
	* @return the doctors
	* @throws PortalException if a doctors with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Doctors getDoctors(long id_doctor)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.getDoctors(id_doctor);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the doctorses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of doctorses
	* @param end the upper bound of the range of doctorses (not inclusive)
	* @return the range of doctorses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.pn.model.Doctors> getDoctorses(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.getDoctorses(start, end);
	}

	/**
	* Returns the number of doctorses.
	*
	* @return the number of doctorses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDoctorsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.getDoctorsesCount();
	}

	/**
	* Updates the doctors in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param doctors the doctors
	* @return the doctors that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.pn.model.Doctors updateDoctors(org.pn.model.Doctors doctors)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _doctorsLocalService.updateDoctors(doctors);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _doctorsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_doctorsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _doctorsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DoctorsLocalService getWrappedDoctorsLocalService() {
		return _doctorsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDoctorsLocalService(
		DoctorsLocalService doctorsLocalService) {
		_doctorsLocalService = doctorsLocalService;
	}

	@Override
	public DoctorsLocalService getWrappedService() {
		return _doctorsLocalService;
	}

	@Override
	public void setWrappedService(DoctorsLocalService doctorsLocalService) {
		_doctorsLocalService = doctorsLocalService;
	}

	private DoctorsLocalService _doctorsLocalService;
}