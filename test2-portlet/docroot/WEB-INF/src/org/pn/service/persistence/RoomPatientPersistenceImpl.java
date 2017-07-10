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

import org.pn.NoSuchRoomPatientException;

import org.pn.model.RoomPatient;
import org.pn.model.impl.RoomPatientImpl;
import org.pn.model.impl.RoomPatientModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the room patient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see RoomPatientPersistence
 * @see RoomPatientUtil
 * @generated
 */
public class RoomPatientPersistenceImpl extends BasePersistenceImpl<RoomPatient>
	implements RoomPatientPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RoomPatientUtil} to access the room patient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RoomPatientImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientModelImpl.FINDER_CACHE_ENABLED, RoomPatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientModelImpl.FINDER_CACHE_ENABLED, RoomPatientImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RoomPatientPersistenceImpl() {
		setModelClass(RoomPatient.class);
	}

	/**
	 * Caches the room patient in the entity cache if it is enabled.
	 *
	 * @param roomPatient the room patient
	 */
	@Override
	public void cacheResult(RoomPatient roomPatient) {
		EntityCacheUtil.putResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientImpl.class, roomPatient.getPrimaryKey(), roomPatient);

		roomPatient.resetOriginalValues();
	}

	/**
	 * Caches the room patients in the entity cache if it is enabled.
	 *
	 * @param roomPatients the room patients
	 */
	@Override
	public void cacheResult(List<RoomPatient> roomPatients) {
		for (RoomPatient roomPatient : roomPatients) {
			if (EntityCacheUtil.getResult(
						RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
						RoomPatientImpl.class, roomPatient.getPrimaryKey()) == null) {
				cacheResult(roomPatient);
			}
			else {
				roomPatient.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all room patients.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RoomPatientImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RoomPatientImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the room patient.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RoomPatient roomPatient) {
		EntityCacheUtil.removeResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientImpl.class, roomPatient.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RoomPatient> roomPatients) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RoomPatient roomPatient : roomPatients) {
			EntityCacheUtil.removeResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
				RoomPatientImpl.class, roomPatient.getPrimaryKey());
		}
	}

	/**
	 * Creates a new room patient with the primary key. Does not add the room patient to the database.
	 *
	 * @param room_no the primary key for the new room patient
	 * @return the new room patient
	 */
	@Override
	public RoomPatient create(long room_no) {
		RoomPatient roomPatient = new RoomPatientImpl();

		roomPatient.setNew(true);
		roomPatient.setPrimaryKey(room_no);

		return roomPatient;
	}

	/**
	 * Removes the room patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_no the primary key of the room patient
	 * @return the room patient that was removed
	 * @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient remove(long room_no)
		throws NoSuchRoomPatientException, SystemException {
		return remove((Serializable)room_no);
	}

	/**
	 * Removes the room patient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the room patient
	 * @return the room patient that was removed
	 * @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient remove(Serializable primaryKey)
		throws NoSuchRoomPatientException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RoomPatient roomPatient = (RoomPatient)session.get(RoomPatientImpl.class,
					primaryKey);

			if (roomPatient == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRoomPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(roomPatient);
		}
		catch (NoSuchRoomPatientException nsee) {
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
	protected RoomPatient removeImpl(RoomPatient roomPatient)
		throws SystemException {
		roomPatient = toUnwrappedModel(roomPatient);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(roomPatient)) {
				roomPatient = (RoomPatient)session.get(RoomPatientImpl.class,
						roomPatient.getPrimaryKeyObj());
			}

			if (roomPatient != null) {
				session.delete(roomPatient);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (roomPatient != null) {
			clearCache(roomPatient);
		}

		return roomPatient;
	}

	@Override
	public RoomPatient updateImpl(org.pn.model.RoomPatient roomPatient)
		throws SystemException {
		roomPatient = toUnwrappedModel(roomPatient);

		boolean isNew = roomPatient.isNew();

		Session session = null;

		try {
			session = openSession();

			if (roomPatient.isNew()) {
				session.save(roomPatient);

				roomPatient.setNew(false);
			}
			else {
				session.merge(roomPatient);
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

		EntityCacheUtil.putResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
			RoomPatientImpl.class, roomPatient.getPrimaryKey(), roomPatient);

		return roomPatient;
	}

	protected RoomPatient toUnwrappedModel(RoomPatient roomPatient) {
		if (roomPatient instanceof RoomPatientImpl) {
			return roomPatient;
		}

		RoomPatientImpl roomPatientImpl = new RoomPatientImpl();

		roomPatientImpl.setNew(roomPatient.isNew());
		roomPatientImpl.setPrimaryKey(roomPatient.getPrimaryKey());

		roomPatientImpl.setRoom_no(roomPatient.getRoom_no());
		roomPatientImpl.setStatus(roomPatient.getStatus());
		roomPatientImpl.setId_patient(roomPatient.getId_patient());

		return roomPatientImpl;
	}

	/**
	 * Returns the room patient with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the room patient
	 * @return the room patient
	 * @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRoomPatientException, SystemException {
		RoomPatient roomPatient = fetchByPrimaryKey(primaryKey);

		if (roomPatient == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRoomPatientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return roomPatient;
	}

	/**
	 * Returns the room patient with the primary key or throws a {@link org.pn.NoSuchRoomPatientException} if it could not be found.
	 *
	 * @param room_no the primary key of the room patient
	 * @return the room patient
	 * @throws org.pn.NoSuchRoomPatientException if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient findByPrimaryKey(long room_no)
		throws NoSuchRoomPatientException, SystemException {
		return findByPrimaryKey((Serializable)room_no);
	}

	/**
	 * Returns the room patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the room patient
	 * @return the room patient, or <code>null</code> if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RoomPatient roomPatient = (RoomPatient)EntityCacheUtil.getResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
				RoomPatientImpl.class, primaryKey);

		if (roomPatient == _nullRoomPatient) {
			return null;
		}

		if (roomPatient == null) {
			Session session = null;

			try {
				session = openSession();

				roomPatient = (RoomPatient)session.get(RoomPatientImpl.class,
						primaryKey);

				if (roomPatient != null) {
					cacheResult(roomPatient);
				}
				else {
					EntityCacheUtil.putResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
						RoomPatientImpl.class, primaryKey, _nullRoomPatient);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RoomPatientModelImpl.ENTITY_CACHE_ENABLED,
					RoomPatientImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return roomPatient;
	}

	/**
	 * Returns the room patient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param room_no the primary key of the room patient
	 * @return the room patient, or <code>null</code> if a room patient with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomPatient fetchByPrimaryKey(long room_no)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)room_no);
	}

	/**
	 * Returns all the room patients.
	 *
	 * @return the room patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RoomPatient> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the room patients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.RoomPatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room patients
	 * @param end the upper bound of the range of room patients (not inclusive)
	 * @return the range of room patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RoomPatient> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the room patients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.RoomPatientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room patients
	 * @param end the upper bound of the range of room patients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of room patients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RoomPatient> findAll(int start, int end,
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

		List<RoomPatient> list = (List<RoomPatient>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ROOMPATIENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROOMPATIENT;

				if (pagination) {
					sql = sql.concat(RoomPatientModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RoomPatient>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RoomPatient>(list);
				}
				else {
					list = (List<RoomPatient>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the room patients from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RoomPatient roomPatient : findAll()) {
			remove(roomPatient);
		}
	}

	/**
	 * Returns the number of room patients.
	 *
	 * @return the number of room patients
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

				Query q = session.createQuery(_SQL_COUNT_ROOMPATIENT);

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
	 * Initializes the room patient persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.RoomPatient")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RoomPatient>> listenersList = new ArrayList<ModelListener<RoomPatient>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RoomPatient>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RoomPatientImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ROOMPATIENT = "SELECT roomPatient FROM RoomPatient roomPatient";
	private static final String _SQL_COUNT_ROOMPATIENT = "SELECT COUNT(roomPatient) FROM RoomPatient roomPatient";
	private static final String _ORDER_BY_ENTITY_ALIAS = "roomPatient.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RoomPatient exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RoomPatientPersistenceImpl.class);
	private static RoomPatient _nullRoomPatient = new RoomPatientImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RoomPatient> toCacheModel() {
				return _nullRoomPatientCacheModel;
			}
		};

	private static CacheModel<RoomPatient> _nullRoomPatientCacheModel = new CacheModel<RoomPatient>() {
			@Override
			public RoomPatient toEntityModel() {
				return _nullRoomPatient;
			}
		};
}