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
import org.pn.service.DiagnosisLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thuctap
 */
public class DiagnosisClp extends BaseModelImpl<Diagnosis> implements Diagnosis {
	public DiagnosisClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Diagnosis.class;
	}

	@Override
	public String getModelClassName() {
		return Diagnosis.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _diagnosis_no;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDiagnosis_no(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _diagnosis_no;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("diagnosis_no", getDiagnosis_no());
		attributes.put("detail", getDetail());
		attributes.put("remak", getRemak());
		attributes.put("diagnosis_date", getDiagnosis_date());
		attributes.put("id_patient", getId_patient());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long diagnosis_no = (Long)attributes.get("diagnosis_no");

		if (diagnosis_no != null) {
			setDiagnosis_no(diagnosis_no);
		}

		String detail = (String)attributes.get("detail");

		if (detail != null) {
			setDetail(detail);
		}

		String remak = (String)attributes.get("remak");

		if (remak != null) {
			setRemak(remak);
		}

		Date diagnosis_date = (Date)attributes.get("diagnosis_date");

		if (diagnosis_date != null) {
			setDiagnosis_date(diagnosis_date);
		}

		Long id_patient = (Long)attributes.get("id_patient");

		if (id_patient != null) {
			setId_patient(id_patient);
		}
	}

	@Override
	public long getDiagnosis_no() {
		return _diagnosis_no;
	}

	@Override
	public void setDiagnosis_no(long diagnosis_no) {
		_diagnosis_no = diagnosis_no;

		if (_diagnosisRemoteModel != null) {
			try {
				Class<?> clazz = _diagnosisRemoteModel.getClass();

				Method method = clazz.getMethod("setDiagnosis_no", long.class);

				method.invoke(_diagnosisRemoteModel, diagnosis_no);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDetail() {
		return _detail;
	}

	@Override
	public void setDetail(String detail) {
		_detail = detail;

		if (_diagnosisRemoteModel != null) {
			try {
				Class<?> clazz = _diagnosisRemoteModel.getClass();

				Method method = clazz.getMethod("setDetail", String.class);

				method.invoke(_diagnosisRemoteModel, detail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemak() {
		return _remak;
	}

	@Override
	public void setRemak(String remak) {
		_remak = remak;

		if (_diagnosisRemoteModel != null) {
			try {
				Class<?> clazz = _diagnosisRemoteModel.getClass();

				Method method = clazz.getMethod("setRemak", String.class);

				method.invoke(_diagnosisRemoteModel, remak);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDiagnosis_date() {
		return _diagnosis_date;
	}

	@Override
	public void setDiagnosis_date(Date diagnosis_date) {
		_diagnosis_date = diagnosis_date;

		if (_diagnosisRemoteModel != null) {
			try {
				Class<?> clazz = _diagnosisRemoteModel.getClass();

				Method method = clazz.getMethod("setDiagnosis_date", Date.class);

				method.invoke(_diagnosisRemoteModel, diagnosis_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId_patient() {
		return _id_patient;
	}

	@Override
	public void setId_patient(long id_patient) {
		_id_patient = id_patient;

		if (_diagnosisRemoteModel != null) {
			try {
				Class<?> clazz = _diagnosisRemoteModel.getClass();

				Method method = clazz.getMethod("setId_patient", long.class);

				method.invoke(_diagnosisRemoteModel, id_patient);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDiagnosisRemoteModel() {
		return _diagnosisRemoteModel;
	}

	public void setDiagnosisRemoteModel(BaseModel<?> diagnosisRemoteModel) {
		_diagnosisRemoteModel = diagnosisRemoteModel;
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

		Class<?> remoteModelClass = _diagnosisRemoteModel.getClass();

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

		Object returnValue = method.invoke(_diagnosisRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DiagnosisLocalServiceUtil.addDiagnosis(this);
		}
		else {
			DiagnosisLocalServiceUtil.updateDiagnosis(this);
		}
	}

	@Override
	public Diagnosis toEscapedModel() {
		return (Diagnosis)ProxyUtil.newProxyInstance(Diagnosis.class.getClassLoader(),
			new Class[] { Diagnosis.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DiagnosisClp clone = new DiagnosisClp();

		clone.setDiagnosis_no(getDiagnosis_no());
		clone.setDetail(getDetail());
		clone.setRemak(getRemak());
		clone.setDiagnosis_date(getDiagnosis_date());
		clone.setId_patient(getId_patient());

		return clone;
	}

	@Override
	public int compareTo(Diagnosis diagnosis) {
		long primaryKey = diagnosis.getPrimaryKey();

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

		if (!(obj instanceof DiagnosisClp)) {
			return false;
		}

		DiagnosisClp diagnosis = (DiagnosisClp)obj;

		long primaryKey = diagnosis.getPrimaryKey();

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

		sb.append("{diagnosis_no=");
		sb.append(getDiagnosis_no());
		sb.append(", detail=");
		sb.append(getDetail());
		sb.append(", remak=");
		sb.append(getRemak());
		sb.append(", diagnosis_date=");
		sb.append(getDiagnosis_date());
		sb.append(", id_patient=");
		sb.append(getId_patient());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.pn.model.Diagnosis");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>diagnosis_no</column-name><column-value><![CDATA[");
		sb.append(getDiagnosis_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>detail</column-name><column-value><![CDATA[");
		sb.append(getDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remak</column-name><column-value><![CDATA[");
		sb.append(getRemak());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diagnosis_date</column-name><column-value><![CDATA[");
		sb.append(getDiagnosis_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_patient</column-name><column-value><![CDATA[");
		sb.append(getId_patient());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _diagnosis_no;
	private String _detail;
	private String _remak;
	private Date _diagnosis_date;
	private long _id_patient;
	private BaseModel<?> _diagnosisRemoteModel;
	private Class<?> _clpSerializerClass = org.pn.service.ClpSerializer.class;
}