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

package org.pn.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.pn.model.Medicine;
import org.pn.model.MedicineModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Medicine service. Represents a row in the &quot;hos_medicine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.pn.model.MedicineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicineImpl}.
 * </p>
 *
 * @author thuctap
 * @see MedicineImpl
 * @see org.pn.model.Medicine
 * @see org.pn.model.MedicineModel
 * @generated
 */
public class MedicineModelImpl extends BaseModelImpl<Medicine>
	implements MedicineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medicine model instance should use the {@link org.pn.model.Medicine} interface instead.
	 */
	public static final String TABLE_NAME = "hos_medicine";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_medicine", Types.BIGINT },
			{ "bill_no", Types.BIGINT },
			{ "id_drug", Types.BIGINT },
			{ "quantity", Types.INTEGER },
			{ "remark", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table hos_medicine (id_medicine LONG not null primary key,bill_no LONG,id_drug LONG,quantity INTEGER,remark VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table hos_medicine";
	public static final String ORDER_BY_JPQL = " ORDER BY medicine.id_medicine ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hos_medicine.id_medicine ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.pn.model.Medicine"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.pn.model.Medicine"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.pn.model.Medicine"));

	public MedicineModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id_medicine;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_medicine(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_medicine;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Medicine.class;
	}

	@Override
	public String getModelClassName() {
		return Medicine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_medicine", getId_medicine());
		attributes.put("bill_no", getBill_no());
		attributes.put("id_drug", getId_drug());
		attributes.put("quantity", getQuantity());
		attributes.put("remark", getRemark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_medicine = (Long)attributes.get("id_medicine");

		if (id_medicine != null) {
			setId_medicine(id_medicine);
		}

		Long bill_no = (Long)attributes.get("bill_no");

		if (bill_no != null) {
			setBill_no(bill_no);
		}

		Long id_drug = (Long)attributes.get("id_drug");

		if (id_drug != null) {
			setId_drug(id_drug);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	@Override
	public long getId_medicine() {
		return _id_medicine;
	}

	@Override
	public void setId_medicine(long id_medicine) {
		_id_medicine = id_medicine;
	}

	@Override
	public long getBill_no() {
		return _bill_no;
	}

	@Override
	public void setBill_no(long bill_no) {
		_bill_no = bill_no;
	}

	@Override
	public long getId_drug() {
		return _id_drug;
	}

	@Override
	public void setId_drug(long id_drug) {
		_id_drug = id_drug;
	}

	@Override
	public int getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	@Override
	public String getRemark() {
		if (_remark == null) {
			return StringPool.BLANK;
		}
		else {
			return _remark;
		}
	}

	@Override
	public void setRemark(String remark) {
		_remark = remark;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Medicine.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Medicine toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Medicine)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MedicineImpl medicineImpl = new MedicineImpl();

		medicineImpl.setId_medicine(getId_medicine());
		medicineImpl.setBill_no(getBill_no());
		medicineImpl.setId_drug(getId_drug());
		medicineImpl.setQuantity(getQuantity());
		medicineImpl.setRemark(getRemark());

		medicineImpl.resetOriginalValues();

		return medicineImpl;
	}

	@Override
	public int compareTo(Medicine medicine) {
		long primaryKey = medicine.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Medicine)) {
			return false;
		}

		Medicine medicine = (Medicine)obj;

		long primaryKey = medicine.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Medicine> toCacheModel() {
		MedicineCacheModel medicineCacheModel = new MedicineCacheModel();

		medicineCacheModel.id_medicine = getId_medicine();

		medicineCacheModel.bill_no = getBill_no();

		medicineCacheModel.id_drug = getId_drug();

		medicineCacheModel.quantity = getQuantity();

		medicineCacheModel.remark = getRemark();

		String remark = medicineCacheModel.remark;

		if ((remark != null) && (remark.length() == 0)) {
			medicineCacheModel.remark = null;
		}

		return medicineCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id_medicine=");
		sb.append(getId_medicine());
		sb.append(", bill_no=");
		sb.append(getBill_no());
		sb.append(", id_drug=");
		sb.append(getId_drug());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", remark=");
		sb.append(getRemark());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Medicine");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_medicine</column-name><column-value><![CDATA[");
		sb.append(getId_medicine());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bill_no</column-name><column-value><![CDATA[");
		sb.append(getBill_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_drug</column-name><column-value><![CDATA[");
		sb.append(getId_drug());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remark</column-name><column-value><![CDATA[");
		sb.append(getRemark());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Medicine.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Medicine.class
		};
	private long _id_medicine;
	private long _bill_no;
	private long _id_drug;
	private int _quantity;
	private String _remark;
	private Medicine _escapedModel;
}