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

package org.pn.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.pn.service.ClpSerializer;
import org.pn.service.MedicineLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class MedicineClp extends BaseModelImpl<Medicine> implements Medicine {
	public MedicineClp() {
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

		if (_medicineRemoteModel != null) {
			try {
				Class<?> clazz = _medicineRemoteModel.getClass();

				Method method = clazz.getMethod("setId_medicine", long.class);

				method.invoke(_medicineRemoteModel, id_medicine);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBill_no() {
		return _bill_no;
	}

	@Override
	public void setBill_no(long bill_no) {
		_bill_no = bill_no;

		if (_medicineRemoteModel != null) {
			try {
				Class<?> clazz = _medicineRemoteModel.getClass();

				Method method = clazz.getMethod("setBill_no", long.class);

				method.invoke(_medicineRemoteModel, bill_no);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId_drug() {
		return _id_drug;
	}

	@Override
	public void setId_drug(long id_drug) {
		_id_drug = id_drug;

		if (_medicineRemoteModel != null) {
			try {
				Class<?> clazz = _medicineRemoteModel.getClass();

				Method method = clazz.getMethod("setId_drug", long.class);

				method.invoke(_medicineRemoteModel, id_drug);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		_quantity = quantity;

		if (_medicineRemoteModel != null) {
			try {
				Class<?> clazz = _medicineRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", int.class);

				method.invoke(_medicineRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemark() {
		return _remark;
	}

	@Override
	public void setRemark(String remark) {
		_remark = remark;

		if (_medicineRemoteModel != null) {
			try {
				Class<?> clazz = _medicineRemoteModel.getClass();

				Method method = clazz.getMethod("setRemark", String.class);

				method.invoke(_medicineRemoteModel, remark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMedicineRemoteModel() {
		return _medicineRemoteModel;
	}

	public void setMedicineRemoteModel(BaseModel<?> medicineRemoteModel) {
		_medicineRemoteModel = medicineRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _medicineRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_medicineRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MedicineLocalServiceUtil.addMedicine(this);
		}
		else {
			MedicineLocalServiceUtil.updateMedicine(this);
		}
	}

	@Override
	public Medicine toEscapedModel() {
		return (Medicine)ProxyUtil.newProxyInstance(Medicine.class.getClassLoader(),
			new Class[] { Medicine.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MedicineClp clone = new MedicineClp();

		clone.setId_medicine(getId_medicine());
		clone.setBill_no(getBill_no());
		clone.setId_drug(getId_drug());
		clone.setQuantity(getQuantity());
		clone.setRemark(getRemark());

		return clone;
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

		if (!(obj instanceof MedicineClp)) {
			return false;
		}

		MedicineClp medicine = (MedicineClp)obj;

		long primaryKey = medicine.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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

	private long _id_medicine;
	private long _bill_no;
	private long _id_drug;
	private int _quantity;
	private String _remark;
	private BaseModel<?> _medicineRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}