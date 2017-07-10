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

import org.pn.NoSuchBillsException;

import org.pn.model.Bills;
import org.pn.model.impl.BillsImpl;
import org.pn.model.impl.BillsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the bills service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see BillsPersistence
 * @see BillsUtil
 * @generated
 */
public class BillsPersistenceImpl extends BasePersistenceImpl<Bills>
	implements BillsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BillsUtil} to access the bills persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BillsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsModelImpl.FINDER_CACHE_ENABLED, BillsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsModelImpl.FINDER_CACHE_ENABLED, BillsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BillsPersistenceImpl() {
		setModelClass(Bills.class);
	}

	/**
	 * Caches the bills in the entity cache if it is enabled.
	 *
	 * @param bills the bills
	 */
	@Override
	public void cacheResult(Bills bills) {
		EntityCacheUtil.putResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsImpl.class, bills.getPrimaryKey(), bills);

		bills.resetOriginalValues();
	}

	/**
	 * Caches the billses in the entity cache if it is enabled.
	 *
	 * @param billses the billses
	 */
	@Override
	public void cacheResult(List<Bills> billses) {
		for (Bills bills : billses) {
			if (EntityCacheUtil.getResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
						BillsImpl.class, bills.getPrimaryKey()) == null) {
				cacheResult(bills);
			}
			else {
				bills.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all billses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BillsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BillsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bills.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bills bills) {
		EntityCacheUtil.removeResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsImpl.class, bills.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Bills> billses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bills bills : billses) {
			EntityCacheUtil.removeResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
				BillsImpl.class, bills.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bills with the primary key. Does not add the bills to the database.
	 *
	 * @param bill_no the primary key for the new bills
	 * @return the new bills
	 */
	@Override
	public Bills create(long bill_no) {
		Bills bills = new BillsImpl();

		bills.setNew(true);
		bills.setPrimaryKey(bill_no);

		return bills;
	}

	/**
	 * Removes the bills with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bill_no the primary key of the bills
	 * @return the bills that was removed
	 * @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills remove(long bill_no)
		throws NoSuchBillsException, SystemException {
		return remove((Serializable)bill_no);
	}

	/**
	 * Removes the bills with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bills
	 * @return the bills that was removed
	 * @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills remove(Serializable primaryKey)
		throws NoSuchBillsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Bills bills = (Bills)session.get(BillsImpl.class, primaryKey);

			if (bills == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBillsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bills);
		}
		catch (NoSuchBillsException nsee) {
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
	protected Bills removeImpl(Bills bills) throws SystemException {
		bills = toUnwrappedModel(bills);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bills)) {
				bills = (Bills)session.get(BillsImpl.class,
						bills.getPrimaryKeyObj());
			}

			if (bills != null) {
				session.delete(bills);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bills != null) {
			clearCache(bills);
		}

		return bills;
	}

	@Override
	public Bills updateImpl(org.pn.model.Bills bills) throws SystemException {
		bills = toUnwrappedModel(bills);

		boolean isNew = bills.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bills.isNew()) {
				session.save(bills);

				bills.setNew(false);
			}
			else {
				session.merge(bills);
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

		EntityCacheUtil.putResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
			BillsImpl.class, bills.getPrimaryKey(), bills);

		return bills;
	}

	protected Bills toUnwrappedModel(Bills bills) {
		if (bills instanceof BillsImpl) {
			return bills;
		}

		BillsImpl billsImpl = new BillsImpl();

		billsImpl.setNew(bills.isNew());
		billsImpl.setPrimaryKey(bills.getPrimaryKey());

		billsImpl.setBill_no(bills.getBill_no());
		billsImpl.setPatient_name(bills.getPatient_name());
		billsImpl.setDoctor_name(bills.getDoctor_name());
		billsImpl.setBill_date(bills.getBill_date());
		billsImpl.setAmount(bills.getAmount());
		billsImpl.setId_patient(bills.getId_patient());

		return billsImpl;
	}

	/**
	 * Returns the bills with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bills
	 * @return the bills
	 * @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBillsException, SystemException {
		Bills bills = fetchByPrimaryKey(primaryKey);

		if (bills == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBillsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bills;
	}

	/**
	 * Returns the bills with the primary key or throws a {@link org.pn.NoSuchBillsException} if it could not be found.
	 *
	 * @param bill_no the primary key of the bills
	 * @return the bills
	 * @throws org.pn.NoSuchBillsException if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills findByPrimaryKey(long bill_no)
		throws NoSuchBillsException, SystemException {
		return findByPrimaryKey((Serializable)bill_no);
	}

	/**
	 * Returns the bills with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bills
	 * @return the bills, or <code>null</code> if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Bills bills = (Bills)EntityCacheUtil.getResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
				BillsImpl.class, primaryKey);

		if (bills == _nullBills) {
			return null;
		}

		if (bills == null) {
			Session session = null;

			try {
				session = openSession();

				bills = (Bills)session.get(BillsImpl.class, primaryKey);

				if (bills != null) {
					cacheResult(bills);
				}
				else {
					EntityCacheUtil.putResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
						BillsImpl.class, primaryKey, _nullBills);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BillsModelImpl.ENTITY_CACHE_ENABLED,
					BillsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bills;
	}

	/**
	 * Returns the bills with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bill_no the primary key of the bills
	 * @return the bills, or <code>null</code> if a bills with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bills fetchByPrimaryKey(long bill_no) throws SystemException {
		return fetchByPrimaryKey((Serializable)bill_no);
	}

	/**
	 * Returns all the billses.
	 *
	 * @return the billses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bills> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Bills> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the billses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.pn.model.impl.BillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of billses
	 * @param end the upper bound of the range of billses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of billses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bills> findAll(int start, int end,
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

		List<Bills> list = (List<Bills>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BILLS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BILLS;

				if (pagination) {
					sql = sql.concat(BillsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bills>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Bills>(list);
				}
				else {
					list = (List<Bills>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the billses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Bills bills : findAll()) {
			remove(bills);
		}
	}

	/**
	 * Returns the number of billses.
	 *
	 * @return the number of billses
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

				Query q = session.createQuery(_SQL_COUNT_BILLS);

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
	 * Initializes the bills persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.Bills")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Bills>> listenersList = new ArrayList<ModelListener<Bills>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Bills>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BillsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BILLS = "SELECT bills FROM Bills bills";
	private static final String _SQL_COUNT_BILLS = "SELECT COUNT(bills) FROM Bills bills";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bills.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bills exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BillsPersistenceImpl.class);
	private static Bills _nullBills = new BillsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Bills> toCacheModel() {
				return _nullBillsCacheModel;
			}
		};

	private static CacheModel<Bills> _nullBillsCacheModel = new CacheModel<Bills>() {
			@Override
			public Bills toEntityModel() {
				return _nullBills;
			}
		};
}