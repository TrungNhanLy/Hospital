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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.pn.NoSuchPatientsException;

import org.pn.model.Patients;
import org.pn.model.impl.PatientsImpl;
import org.pn.model.impl.PatientsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the patients service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see PatientsPersistence
 * @see PatientsUtil
 * @generated
 */
public class PatientsPersistenceImpl extends BasePersistenceImpl<Patients>
	implements PatientsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PatientsUtil} to access the patients persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PatientsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsModelImpl.FINDER_CACHE_ENABLED, PatientsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsModelImpl.FINDER_CACHE_ENABLED, PatientsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PatientsPersistenceImpl() {
		setModelClass(Patients.class);
	}

	/**
	 * Caches the patients in the entity cache if it is enabled.
	 *
	 * @param patients the patients
	 */
	@Override
	public void cacheResult(Patients patients) {
		EntityCacheUtil.putResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsImpl.class, patients.getPrimaryKey(), patients);

		patients.resetOriginalValues();
	}

	/**
	 * Caches the patientses in the entity cache if it is enabled.
	 *
	 * @param patientses the patientses
	 */
	@Override
	public void cacheResult(List<Patients> patientses) {
		for (Patients patients : patientses) {
			if (EntityCacheUtil.getResult(
						PatientsModelImpl.ENTITY_CACHE_ENABLED,
						PatientsImpl.class, patients.getPrimaryKey()) == null) {
				cacheResult(patients);
			}
			else {
				patients.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all patientses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PatientsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PatientsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the patients.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Patients patients) {
		EntityCacheUtil.removeResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsImpl.class, patients.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Patients> patientses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Patients patients : patientses) {
			EntityCacheUtil.removeResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
				PatientsImpl.class, patients.getPrimaryKey());
		}
	}

	/**
	 * Creates a new patients with the primary key. Does not add the patients to the database.
	 *
	 * @param id_patient the primary key for the new patients
	 * @return the new patients
	 */
	@Override
	public Patients create(long id_patient) {
		Patients patients = new PatientsImpl();

		patients.setNew(true);
		patients.setPrimaryKey(id_patient);

		return patients;
	}

	/**
	 * Removes the patients with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_patient the primary key of the patients
	 * @return the patients that was removed
	 * @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients remove(long id_patient)
		throws NoSuchPatientsException, SystemException {
		return remove((Serializable)id_patient);
	}

	/**
	 * Removes the patients with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the patients
	 * @return the patients that was removed
	 * @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients remove(Serializable primaryKey)
		throws NoSuchPatientsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Patients patients = (Patients)session.get(PatientsImpl.class,
					primaryKey);

			if (patients == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPatientsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(patients);
		}
		catch (NoSuchPatientsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Patients removeImpl(Patients patients) throws SystemException {
		patients = toUnwrappedModel(patients);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(patients)) {
				patients = (Patients)session.get(PatientsImpl.class,
						patients.getPrimaryKeyObj());
			}

			if (patients != null) {
				session.delete(patients);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (patients != null) {
			clearCache(patients);
		}

		return patients;
	}

	@Override
	public Patients updateImpl(org.pn.model.Patients patients)
		throws SystemException {
		patients = toUnwrappedModel(patients);

		boolean isNew = patients.isNew();

		Session session = null;

		try {
			session = openSession();

			if (patients.isNew()) {
				session.save(patients);

				patients.setNew(false);
			}
			else {
				session.merge(patients);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
			PatientsImpl.class, patients.getPrimaryKey(), patients);

		return patients;
	}

	protected Patients toUnwrappedModel(Patients patients) {
		if (patients instanceof PatientsImpl) {
			return patients;
		}

		PatientsImpl patientsImpl = new PatientsImpl();

		patientsImpl.setNew(patients.isNew());
		patientsImpl.setPrimaryKey(patients.getPrimaryKey());

		patientsImpl.setId_patient(patients.getId_patient());
		patientsImpl.setName(patients.getName());
		patientsImpl.setAddress(patients.getAddress());
		patientsImpl.setPhonenumber(patients.getPhonenumber());
		patientsImpl.setDepartment(patients.getDepartment());
		patientsImpl.setSymptoms(patients.getSymptoms());
		patientsImpl.setGender(patients.getGender());
		patientsImpl.setId_doctor(patients.getId_doctor());

		return patientsImpl;
	}

	/**
	 * Returns the patients with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the patients
	 * @return the patients
	 * @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPatientsException, SystemException {
		Patients patients = fetchByPrimaryKey(primaryKey);

		if (patients == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPatientsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return patients;
	}

	/**
	 * Returns the patients with the primary key or throws a {@link org.pn.NoSuchPatientsException} if it could not be found.
	 *
	 * @param id_patient the primary key of the patients
	 * @return the patients
	 * @throws org.pn.NoSuchPatientsException if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients findByPrimaryKey(long id_patient)
		throws NoSuchPatientsException, SystemException {
		return findByPrimaryKey((Serializable)id_patient);
	}

	/**
	 * Returns the patients with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the patients
	 * @return the patients, or <code>null</code> if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Patients patients = (Patients)EntityCacheUtil.getResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
				PatientsImpl.class, primaryKey);

		if (patients == _nullPatients) {
			return null;
		}

		if (patients == null) {
			Session session = null;

			try {
				session = openSession();

				patients = (Patients)session.get(PatientsImpl.class, primaryKey);

				if (patients != null) {
					cacheResult(patients);
				}
				else {
					EntityCacheUtil.putResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
						PatientsImpl.class, primaryKey, _nullPatients);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PatientsModelImpl.ENTITY_CACHE_ENABLED,
					PatientsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return patients;
	}

	/**
	 * Returns the patients with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_patient the primary key of the patients
	 * @return the patients, or <code>null</code> if a patients with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Patients fetchByPrimaryKey(long id_patient)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id_patient);
	}

	/**
	 * Returns all the patientses.
	 *
	 * @return the patientses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Patients> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Patients> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Patients> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Patients> list = (List<Patients>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PATIENTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PATIENTS;

				if (pagination) {
					sql = sql.concat(PatientsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Patients>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Patients>(list);
				}
				else {
					list = (List<Patients>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the patientses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Patients patients : findAll()) {
			remove(patients);
		}
	}

	/**
	 * Returns the number of patientses.
	 *
	 * @return the number of patientses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PATIENTS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the patients persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.Patients")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Patients>> listenersList = new ArrayList<ModelListener<Patients>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Patients>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PatientsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PATIENTS = "SELECT patients FROM Patients patients";
	private static final String _SQL_COUNT_PATIENTS = "SELECT COUNT(patients) FROM Patients patients";
	private static final String _ORDER_BY_ENTITY_ALIAS = "patients.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Patients exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PatientsPersistenceImpl.class);
	private static Patients _nullPatients = new PatientsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Patients> toCacheModel() {
				return _nullPatientsCacheModel;
			}
		};

	private static CacheModel<Patients> _nullPatientsCacheModel = new CacheModel<Patients>() {
			@Override
			public Patients toEntityModel() {
				return _nullPatients;
			}
		};
}