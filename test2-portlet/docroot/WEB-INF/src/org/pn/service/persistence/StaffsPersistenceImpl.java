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

import org.pn.NoSuchStaffsException;

import org.pn.model.Staffs;
import org.pn.model.impl.StaffsImpl;
import org.pn.model.impl.StaffsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the staffs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see StaffsPersistence
 * @see StaffsUtil
 * @generated
 */
public class StaffsPersistenceImpl extends BasePersistenceImpl<Staffs>
	implements StaffsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StaffsUtil} to access the staffs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StaffsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsModelImpl.FINDER_CACHE_ENABLED, StaffsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsModelImpl.FINDER_CACHE_ENABLED, StaffsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public StaffsPersistenceImpl() {
		setModelClass(Staffs.class);
	}

	/**
	 * Caches the staffs in the entity cache if it is enabled.
	 *
	 * @param staffs the staffs
	 */
	@Override
	public void cacheResult(Staffs staffs) {
		EntityCacheUtil.putResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsImpl.class, staffs.getPrimaryKey(), staffs);

		staffs.resetOriginalValues();
	}

	/**
	 * Caches the staffses in the entity cache if it is enabled.
	 *
	 * @param staffses the staffses
	 */
	@Override
	public void cacheResult(List<Staffs> staffses) {
		for (Staffs staffs : staffses) {
			if (EntityCacheUtil.getResult(
						StaffsModelImpl.ENTITY_CACHE_ENABLED, StaffsImpl.class,
						staffs.getPrimaryKey()) == null) {
				cacheResult(staffs);
			}
			else {
				staffs.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all staffses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StaffsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StaffsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the staffs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Staffs staffs) {
		EntityCacheUtil.removeResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsImpl.class, staffs.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Staffs> staffses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Staffs staffs : staffses) {
			EntityCacheUtil.removeResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
				StaffsImpl.class, staffs.getPrimaryKey());
		}
	}

	/**
	 * Creates a new staffs with the primary key. Does not add the staffs to the database.
	 *
	 * @param id_staff the primary key for the new staffs
	 * @return the new staffs
	 */
	@Override
	public Staffs create(long id_staff) {
		Staffs staffs = new StaffsImpl();

		staffs.setNew(true);
		staffs.setPrimaryKey(id_staff);

		return staffs;
	}

	/**
	 * Removes the staffs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_staff the primary key of the staffs
	 * @return the staffs that was removed
	 * @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs remove(long id_staff)
		throws NoSuchStaffsException, SystemException {
		return remove((Serializable)id_staff);
	}

	/**
	 * Removes the staffs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the staffs
	 * @return the staffs that was removed
	 * @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs remove(Serializable primaryKey)
		throws NoSuchStaffsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Staffs staffs = (Staffs)session.get(StaffsImpl.class, primaryKey);

			if (staffs == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStaffsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(staffs);
		}
		catch (NoSuchStaffsException nsee) {
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
	protected Staffs removeImpl(Staffs staffs) throws SystemException {
		staffs = toUnwrappedModel(staffs);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(staffs)) {
				staffs = (Staffs)session.get(StaffsImpl.class,
						staffs.getPrimaryKeyObj());
			}

			if (staffs != null) {
				session.delete(staffs);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (staffs != null) {
			clearCache(staffs);
		}

		return staffs;
	}

	@Override
	public Staffs updateImpl(org.pn.model.Staffs staffs)
		throws SystemException {
		staffs = toUnwrappedModel(staffs);

		boolean isNew = staffs.isNew();

		Session session = null;

		try {
			session = openSession();

			if (staffs.isNew()) {
				session.save(staffs);

				staffs.setNew(false);
			}
			else {
				session.merge(staffs);
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

		EntityCacheUtil.putResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
			StaffsImpl.class, staffs.getPrimaryKey(), staffs);

		return staffs;
	}

	protected Staffs toUnwrappedModel(Staffs staffs) {
		if (staffs instanceof StaffsImpl) {
			return staffs;
		}

		StaffsImpl staffsImpl = new StaffsImpl();

		staffsImpl.setNew(staffs.isNew());
		staffsImpl.setPrimaryKey(staffs.getPrimaryKey());

		staffsImpl.setId_staff(staffs.getId_staff());
		staffsImpl.setName(staffs.getName());
		staffsImpl.setGender(staffs.getGender());
		staffsImpl.setDepartment(staffs.getDepartment());
		staffsImpl.setPhonenumber(staffs.getPhonenumber());
		staffsImpl.setId_doctor(staffs.getId_doctor());

		return staffsImpl;
	}

	/**
	 * Returns the staffs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the staffs
	 * @return the staffs
	 * @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStaffsException, SystemException {
		Staffs staffs = fetchByPrimaryKey(primaryKey);

		if (staffs == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStaffsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return staffs;
	}

	/**
	 * Returns the staffs with the primary key or throws a {@link org.pn.NoSuchStaffsException} if it could not be found.
	 *
	 * @param id_staff the primary key of the staffs
	 * @return the staffs
	 * @throws org.pn.NoSuchStaffsException if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs findByPrimaryKey(long id_staff)
		throws NoSuchStaffsException, SystemException {
		return findByPrimaryKey((Serializable)id_staff);
	}

	/**
	 * Returns the staffs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the staffs
	 * @return the staffs, or <code>null</code> if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Staffs staffs = (Staffs)EntityCacheUtil.getResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
				StaffsImpl.class, primaryKey);

		if (staffs == _nullStaffs) {
			return null;
		}

		if (staffs == null) {
			Session session = null;

			try {
				session = openSession();

				staffs = (Staffs)session.get(StaffsImpl.class, primaryKey);

				if (staffs != null) {
					cacheResult(staffs);
				}
				else {
					EntityCacheUtil.putResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
						StaffsImpl.class, primaryKey, _nullStaffs);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StaffsModelImpl.ENTITY_CACHE_ENABLED,
					StaffsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return staffs;
	}

	/**
	 * Returns the staffs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_staff the primary key of the staffs
	 * @return the staffs, or <code>null</code> if a staffs with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Staffs fetchByPrimaryKey(long id_staff) throws SystemException {
		return fetchByPrimaryKey((Serializable)id_staff);
	}

	/**
	 * Returns all the staffses.
	 *
	 * @return the staffses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Staffs> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Staffs> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the staffses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.StaffsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of staffses
	 * @param end the upper bound of the range of staffses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of staffses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Staffs> findAll(int start, int end,
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

		List<Staffs> list = (List<Staffs>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STAFFS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STAFFS;

				if (pagination) {
					sql = sql.concat(StaffsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Staffs>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Staffs>(list);
				}
				else {
					list = (List<Staffs>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the staffses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Staffs staffs : findAll()) {
			remove(staffs);
		}
	}

	/**
	 * Returns the number of staffses.
	 *
	 * @return the number of staffses
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

				Query q = session.createQuery(_SQL_COUNT_STAFFS);

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
	 * Initializes the staffs persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.Staffs")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Staffs>> listenersList = new ArrayList<ModelListener<Staffs>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Staffs>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StaffsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STAFFS = "SELECT staffs FROM Staffs staffs";
	private static final String _SQL_COUNT_STAFFS = "SELECT COUNT(staffs) FROM Staffs staffs";
	private static final String _ORDER_BY_ENTITY_ALIAS = "staffs.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Staffs exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StaffsPersistenceImpl.class);
	private static Staffs _nullStaffs = new StaffsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Staffs> toCacheModel() {
				return _nullStaffsCacheModel;
			}
		};

	private static CacheModel<Staffs> _nullStaffsCacheModel = new CacheModel<Staffs>() {
			@Override
			public Staffs toEntityModel() {
				return _nullStaffs;
			}
		};
}