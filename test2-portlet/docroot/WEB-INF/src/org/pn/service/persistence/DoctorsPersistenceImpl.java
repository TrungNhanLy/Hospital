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

import org.pn.NoSuchDoctorsException;

import org.pn.model.Doctors;
import org.pn.model.impl.DoctorsImpl;
import org.pn.model.impl.DoctorsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the doctors service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DoctorsPersistence
 * @see DoctorsUtil
 * @generated
 */
public class DoctorsPersistenceImpl extends BasePersistenceImpl<Doctors>
	implements DoctorsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DoctorsUtil} to access the doctors persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DoctorsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsModelImpl.FINDER_CACHE_ENABLED, DoctorsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsModelImpl.FINDER_CACHE_ENABLED, DoctorsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DoctorsPersistenceImpl() {
		setModelClass(Doctors.class);
	}

	/**
	 * Caches the doctors in the entity cache if it is enabled.
	 *
	 * @param doctors the doctors
	 */
	@Override
	public void cacheResult(Doctors doctors) {
		EntityCacheUtil.putResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsImpl.class, doctors.getPrimaryKey(), doctors);

		doctors.resetOriginalValues();
	}

	/**
	 * Caches the doctorses in the entity cache if it is enabled.
	 *
	 * @param doctorses the doctorses
	 */
	@Override
	public void cacheResult(List<Doctors> doctorses) {
		for (Doctors doctors : doctorses) {
			if (EntityCacheUtil.getResult(
						DoctorsModelImpl.ENTITY_CACHE_ENABLED,
						DoctorsImpl.class, doctors.getPrimaryKey()) == null) {
				cacheResult(doctors);
			}
			else {
				doctors.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all doctorses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DoctorsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DoctorsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the doctors.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Doctors doctors) {
		EntityCacheUtil.removeResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsImpl.class, doctors.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Doctors> doctorses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Doctors doctors : doctorses) {
			EntityCacheUtil.removeResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
				DoctorsImpl.class, doctors.getPrimaryKey());
		}
	}

	/**
	 * Creates a new doctors with the primary key. Does not add the doctors to the database.
	 *
	 * @param id_doctor the primary key for the new doctors
	 * @return the new doctors
	 */
	@Override
	public Doctors create(long id_doctor) {
		Doctors doctors = new DoctorsImpl();

		doctors.setNew(true);
		doctors.setPrimaryKey(id_doctor);

		return doctors;
	}

	/**
	 * Removes the doctors with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_doctor the primary key of the doctors
	 * @return the doctors that was removed
	 * @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors remove(long id_doctor)
		throws NoSuchDoctorsException, SystemException {
		return remove((Serializable)id_doctor);
	}

	/**
	 * Removes the doctors with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the doctors
	 * @return the doctors that was removed
	 * @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors remove(Serializable primaryKey)
		throws NoSuchDoctorsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Doctors doctors = (Doctors)session.get(DoctorsImpl.class, primaryKey);

			if (doctors == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDoctorsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(doctors);
		}
		catch (NoSuchDoctorsException nsee) {
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
	protected Doctors removeImpl(Doctors doctors) throws SystemException {
		doctors = toUnwrappedModel(doctors);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(doctors)) {
				doctors = (Doctors)session.get(DoctorsImpl.class,
						doctors.getPrimaryKeyObj());
			}

			if (doctors != null) {
				session.delete(doctors);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (doctors != null) {
			clearCache(doctors);
		}

		return doctors;
	}

	@Override
	public Doctors updateImpl(org.pn.model.Doctors doctors)
		throws SystemException {
		doctors = toUnwrappedModel(doctors);

		boolean isNew = doctors.isNew();

		Session session = null;

		try {
			session = openSession();

			if (doctors.isNew()) {
				session.save(doctors);

				doctors.setNew(false);
			}
			else {
				session.merge(doctors);
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

		EntityCacheUtil.putResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
			DoctorsImpl.class, doctors.getPrimaryKey(), doctors);

		return doctors;
	}

	protected Doctors toUnwrappedModel(Doctors doctors) {
		if (doctors instanceof DoctorsImpl) {
			return doctors;
		}

		DoctorsImpl doctorsImpl = new DoctorsImpl();

		doctorsImpl.setNew(doctors.isNew());
		doctorsImpl.setPrimaryKey(doctors.getPrimaryKey());

		doctorsImpl.setId_doctor(doctors.getId_doctor());
		doctorsImpl.setName(doctors.getName());
		doctorsImpl.setAddress(doctors.getAddress());
		doctorsImpl.setPosition(doctors.getPosition());
		doctorsImpl.setGender(doctors.getGender());

		return doctorsImpl;
	}

	/**
	 * Returns the doctors with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the doctors
	 * @return the doctors
	 * @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDoctorsException, SystemException {
		Doctors doctors = fetchByPrimaryKey(primaryKey);

		if (doctors == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDoctorsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return doctors;
	}

	/**
	 * Returns the doctors with the primary key or throws a {@link org.pn.NoSuchDoctorsException} if it could not be found.
	 *
	 * @param id_doctor the primary key of the doctors
	 * @return the doctors
	 * @throws org.pn.NoSuchDoctorsException if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors findByPrimaryKey(long id_doctor)
		throws NoSuchDoctorsException, SystemException {
		return findByPrimaryKey((Serializable)id_doctor);
	}

	/**
	 * Returns the doctors with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the doctors
	 * @return the doctors, or <code>null</code> if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Doctors doctors = (Doctors)EntityCacheUtil.getResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
				DoctorsImpl.class, primaryKey);

		if (doctors == _nullDoctors) {
			return null;
		}

		if (doctors == null) {
			Session session = null;

			try {
				session = openSession();

				doctors = (Doctors)session.get(DoctorsImpl.class, primaryKey);

				if (doctors != null) {
					cacheResult(doctors);
				}
				else {
					EntityCacheUtil.putResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
						DoctorsImpl.class, primaryKey, _nullDoctors);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DoctorsModelImpl.ENTITY_CACHE_ENABLED,
					DoctorsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return doctors;
	}

	/**
	 * Returns the doctors with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_doctor the primary key of the doctors
	 * @return the doctors, or <code>null</code> if a doctors with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Doctors fetchByPrimaryKey(long id_doctor) throws SystemException {
		return fetchByPrimaryKey((Serializable)id_doctor);
	}

	/**
	 * Returns all the doctorses.
	 *
	 * @return the doctorses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Doctors> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Doctors> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the doctorses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.DoctorsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of doctorses
	 * @param end the upper bound of the range of doctorses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of doctorses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Doctors> findAll(int start, int end,
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

		List<Doctors> list = (List<Doctors>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCTORS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCTORS;

				if (pagination) {
					sql = sql.concat(DoctorsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Doctors>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Doctors>(list);
				}
				else {
					list = (List<Doctors>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the doctorses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Doctors doctors : findAll()) {
			remove(doctors);
		}
	}

	/**
	 * Returns the number of doctorses.
	 *
	 * @return the number of doctorses
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

				Query q = session.createQuery(_SQL_COUNT_DOCTORS);

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
	 * Initializes the doctors persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.Doctors")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Doctors>> listenersList = new ArrayList<ModelListener<Doctors>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Doctors>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DoctorsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCTORS = "SELECT doctors FROM Doctors doctors";
	private static final String _SQL_COUNT_DOCTORS = "SELECT COUNT(doctors) FROM Doctors doctors";
	private static final String _ORDER_BY_ENTITY_ALIAS = "doctors.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Doctors exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DoctorsPersistenceImpl.class);
	private static Doctors _nullDoctors = new DoctorsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Doctors> toCacheModel() {
				return _nullDoctorsCacheModel;
			}
		};

	private static CacheModel<Doctors> _nullDoctorsCacheModel = new CacheModel<Doctors>() {
			@Override
			public Doctors toEntityModel() {
				return _nullDoctors;
			}
		};
}