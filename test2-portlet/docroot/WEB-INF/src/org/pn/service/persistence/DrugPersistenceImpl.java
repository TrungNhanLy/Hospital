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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.pn.NoSuchDrugException;

import org.pn.model.Drug;
import org.pn.model.impl.DrugImpl;
import org.pn.model.impl.DrugModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the drug service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thuctap
 * @see DrugPersistence
 * @see DrugUtil
 * @generated
 */
public class DrugPersistenceImpl extends BasePersistenceImpl<Drug>
	implements DrugPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DrugUtil} to access the drug persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DrugImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugModelImpl.FINDER_CACHE_ENABLED, DrugImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugModelImpl.FINDER_CACHE_ENABLED, DrugImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DrugPersistenceImpl() {
		setModelClass(Drug.class);
	}

	/**
	 * Caches the drug in the entity cache if it is enabled.
	 *
	 * @param drug the drug
	 */
	@Override
	public void cacheResult(Drug drug) {
		EntityCacheUtil.putResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugImpl.class, drug.getPrimaryKey(), drug);

		drug.resetOriginalValues();
	}

	/**
	 * Caches the drugs in the entity cache if it is enabled.
	 *
	 * @param drugs the drugs
	 */
	@Override
	public void cacheResult(List<Drug> drugs) {
		for (Drug drug : drugs) {
			if (EntityCacheUtil.getResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
						DrugImpl.class, drug.getPrimaryKey()) == null) {
				cacheResult(drug);
			}
			else {
				drug.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all drugs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DrugImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DrugImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the drug.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Drug drug) {
		EntityCacheUtil.removeResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugImpl.class, drug.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Drug> drugs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Drug drug : drugs) {
			EntityCacheUtil.removeResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
				DrugImpl.class, drug.getPrimaryKey());
		}
	}

	/**
	 * Creates a new drug with the primary key. Does not add the drug to the database.
	 *
	 * @param id_drug the primary key for the new drug
	 * @return the new drug
	 */
	@Override
	public Drug create(long id_drug) {
		Drug drug = new DrugImpl();

		drug.setNew(true);
		drug.setPrimaryKey(id_drug);

		return drug;
	}

	/**
	 * Removes the drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_drug the primary key of the drug
	 * @return the drug that was removed
	 * @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug remove(long id_drug)
		throws NoSuchDrugException, SystemException {
		return remove((Serializable)id_drug);
	}

	/**
	 * Removes the drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the drug
	 * @return the drug that was removed
	 * @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug remove(Serializable primaryKey)
		throws NoSuchDrugException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Drug drug = (Drug)session.get(DrugImpl.class, primaryKey);

			if (drug == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDrugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(drug);
		}
		catch (NoSuchDrugException nsee) {
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
	protected Drug removeImpl(Drug drug) throws SystemException {
		drug = toUnwrappedModel(drug);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(drug)) {
				drug = (Drug)session.get(DrugImpl.class, drug.getPrimaryKeyObj());
			}

			if (drug != null) {
				session.delete(drug);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (drug != null) {
			clearCache(drug);
		}

		return drug;
	}

	@Override
	public Drug updateImpl(org.pn.model.Drug drug) throws SystemException {
		drug = toUnwrappedModel(drug);

		boolean isNew = drug.isNew();

		Session session = null;

		try {
			session = openSession();

			if (drug.isNew()) {
				session.save(drug);

				drug.setNew(false);
			}
			else {
				session.merge(drug);
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

		EntityCacheUtil.putResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
			DrugImpl.class, drug.getPrimaryKey(), drug);

		return drug;
	}

	protected Drug toUnwrappedModel(Drug drug) {
		if (drug instanceof DrugImpl) {
			return drug;
		}

		DrugImpl drugImpl = new DrugImpl();

		drugImpl.setNew(drug.isNew());
		drugImpl.setPrimaryKey(drug.getPrimaryKey());

		drugImpl.setId_drug(drug.getId_drug());
		drugImpl.setName_medicine(drug.getName_medicine());
		drugImpl.setQuantity(drug.getQuantity());
		drugImpl.setPrice(drug.getPrice());
		drugImpl.setExpiration_date(drug.getExpiration_date());

		return drugImpl;
	}

	/**
	 * Returns the drug with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the drug
	 * @return the drug
	 * @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDrugException, SystemException {
		Drug drug = fetchByPrimaryKey(primaryKey);

		if (drug == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDrugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return drug;
	}

	/**
	 * Returns the drug with the primary key or throws a {@link org.pn.NoSuchDrugException} if it could not be found.
	 *
	 * @param id_drug the primary key of the drug
	 * @return the drug
	 * @throws org.pn.NoSuchDrugException if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug findByPrimaryKey(long id_drug)
		throws NoSuchDrugException, SystemException {
		return findByPrimaryKey((Serializable)id_drug);
	}

	/**
	 * Returns the drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the drug
	 * @return the drug, or <code>null</code> if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Drug drug = (Drug)EntityCacheUtil.getResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
				DrugImpl.class, primaryKey);

		if (drug == _nullDrug) {
			return null;
		}

		if (drug == null) {
			Session session = null;

			try {
				session = openSession();

				drug = (Drug)session.get(DrugImpl.class, primaryKey);

				if (drug != null) {
					cacheResult(drug);
				}
				else {
					EntityCacheUtil.putResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
						DrugImpl.class, primaryKey, _nullDrug);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DrugModelImpl.ENTITY_CACHE_ENABLED,
					DrugImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return drug;
	}

	/**
	 * Returns the drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_drug the primary key of the drug
	 * @return the drug, or <code>null</code> if a drug with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Drug fetchByPrimaryKey(long id_drug) throws SystemException {
		return fetchByPrimaryKey((Serializable)id_drug);
	}

	/**
	 * Returns all the drugs.
	 *
	 * @return the drugs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Drug> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Drug> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Drug> findAll(int start, int end,
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

		List<Drug> list = (List<Drug>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DRUG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DRUG;

				if (pagination) {
					sql = sql.concat(DrugModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Drug>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Drug>(list);
				}
				else {
					list = (List<Drug>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the drugs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Drug drug : findAll()) {
			remove(drug);
		}
	}

	/**
	 * Returns the number of drugs.
	 *
	 * @return the number of drugs
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

				Query q = session.createQuery(_SQL_COUNT_DRUG);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the drug persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.pn.model.Drug")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Drug>> listenersList = new ArrayList<ModelListener<Drug>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Drug>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DrugImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DRUG = "SELECT drug FROM Drug drug";
	private static final String _SQL_COUNT_DRUG = "SELECT COUNT(drug) FROM Drug drug";
	private static final String _ORDER_BY_ENTITY_ALIAS = "drug.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Drug exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DrugPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id_drug"
			});
	private static Drug _nullDrug = new DrugImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Drug> toCacheModel() {
				return _nullDrugCacheModel;
			}
		};

	private static CacheModel<Drug> _nullDrugCacheModel = new CacheModel<Drug>() {
			@Override
			public Drug toEntityModel() {
				return _nullDrug;
			}
		};
}