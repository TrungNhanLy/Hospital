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

import org.pn.model.Bills;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bills in entity cache.
 *
 * @author thuctap
 * @see Bills
 * @generated
 */
public class BillsCacheModel implements CacheModel<Bills>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{bill_no=");
		sb.append(bill_no);
		sb.append(", patient_name=");
		sb.append(patient_name);
		sb.append(", doctor_name=");
		sb.append(doctor_name);
		sb.append(", bill_date=");
		sb.append(bill_date);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", id_patient=");
		sb.append(id_patient);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bills toEntityModel() {
		BillsImpl billsImpl = new BillsImpl();

		billsImpl.setBill_no(bill_no);

		if (patient_name == null) {
			billsImpl.setPatient_name(StringPool.BLANK);
		}
		else {
			billsImpl.setPatient_name(patient_name);
		}

		if (doctor_name == null) {
			billsImpl.setDoctor_name(StringPool.BLANK);
		}
		else {
			billsImpl.setDoctor_name(doctor_name);
		}

		if (bill_date == Long.MIN_VALUE) {
			billsImpl.setBill_date(null);
		}
		else {
			billsImpl.setBill_date(new Date(bill_date));
		}

		billsImpl.setAmount(amount);
		billsImpl.setId_patient(id_patient);

		billsImpl.resetOriginalValues();

		return billsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bill_no = objectInput.readLong();
		patient_name = objectInput.readUTF();
		doctor_name = objectInput.readUTF();
		bill_date = objectInput.readLong();
		amount = objectInput.readInt();
		id_patient = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bill_no);

		if (patient_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(patient_name);
		}

		if (doctor_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doctor_name);
		}

		objectOutput.writeLong(bill_date);
		objectOutput.writeInt(amount);
		objectOutput.writeLong(id_patient);
	}

	public long bill_no;
	public String patient_name;
	public String doctor_name;
	public long bill_date;
	public int amount;
	public long id_patient;
}