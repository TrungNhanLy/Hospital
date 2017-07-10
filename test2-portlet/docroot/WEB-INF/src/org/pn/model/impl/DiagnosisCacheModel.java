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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.pn.model.Diagnosis;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Diagnosis in entity cache.
 *
 * @author thuctap
 * @see Diagnosis
 * @generated
 */
public class DiagnosisCacheModel implements CacheModel<Diagnosis>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{diagnosis_no=");
		sb.append(diagnosis_no);
		sb.append(", detail=");
		sb.append(detail);
		sb.append(", remak=");
		sb.append(remak);
		sb.append(", diagnosis_date=");
		sb.append(diagnosis_date);
		sb.append(", id_patient=");
		sb.append(id_patient);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Diagnosis toEntityModel() {
		DiagnosisImpl diagnosisImpl = new DiagnosisImpl();

		diagnosisImpl.setDiagnosis_no(diagnosis_no);

		if (detail == null) {
			diagnosisImpl.setDetail(StringPool.BLANK);
		}
		else {
			diagnosisImpl.setDetail(detail);
		}

		if (remak == null) {
			diagnosisImpl.setRemak(StringPool.BLANK);
		}
		else {
			diagnosisImpl.setRemak(remak);
		}

		if (diagnosis_date == Long.MIN_VALUE) {
			diagnosisImpl.setDiagnosis_date(null);
		}
		else {
			diagnosisImpl.setDiagnosis_date(new Date(diagnosis_date));
		}

		diagnosisImpl.setId_patient(id_patient);

		diagnosisImpl.resetOriginalValues();

		return diagnosisImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		diagnosis_no = objectInput.readLong();
		detail = objectInput.readUTF();
		remak = objectInput.readUTF();
		diagnosis_date = objectInput.readLong();
		id_patient = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(diagnosis_no);

		if (detail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(detail);
		}

		if (remak == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remak);
		}

		objectOutput.writeLong(diagnosis_date);
		objectOutput.writeLong(id_patient);
	}

	public long diagnosis_no;
	public String detail;
	public String remak;
	public long diagnosis_date;
	public long id_patient;
}