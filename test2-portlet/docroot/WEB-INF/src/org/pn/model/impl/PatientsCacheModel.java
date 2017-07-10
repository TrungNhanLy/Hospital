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

import org.pn.model.Patients;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Patients in entity cache.
 *
 * @author thuctap
 * @see Patients
 * @generated
 */
public class PatientsCacheModel implements CacheModel<Patients>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id_patient=");
		sb.append(id_patient);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phonenumber=");
		sb.append(phonenumber);
		sb.append(", department=");
		sb.append(department);
		sb.append(", symptoms=");
		sb.append(symptoms);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", id_doctor=");
		sb.append(id_doctor);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Patients toEntityModel() {
		PatientsImpl patientsImpl = new PatientsImpl();

		patientsImpl.setId_patient(id_patient);

		if (name == null) {
			patientsImpl.setName(StringPool.BLANK);
		}
		else {
			patientsImpl.setName(name);
		}

		if (address == null) {
			patientsImpl.setAddress(StringPool.BLANK);
		}
		else {
			patientsImpl.setAddress(address);
		}

		if (phonenumber == null) {
			patientsImpl.setPhonenumber(StringPool.BLANK);
		}
		else {
			patientsImpl.setPhonenumber(phonenumber);
		}

		if (department == null) {
			patientsImpl.setDepartment(StringPool.BLANK);
		}
		else {
			patientsImpl.setDepartment(department);
		}

		if (symptoms == null) {
			patientsImpl.setSymptoms(StringPool.BLANK);
		}
		else {
			patientsImpl.setSymptoms(symptoms);
		}

		if (gender == null) {
			patientsImpl.setGender(StringPool.BLANK);
		}
		else {
			patientsImpl.setGender(gender);
		}

		patientsImpl.setId_doctor(id_doctor);

		patientsImpl.resetOriginalValues();

		return patientsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_patient = objectInput.readLong();
		name = objectInput.readUTF();
		address = objectInput.readUTF();
		phonenumber = objectInput.readUTF();
		department = objectInput.readUTF();
		symptoms = objectInput.readUTF();
		gender = objectInput.readUTF();
		id_doctor = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_patient);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (phonenumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phonenumber);
		}

		if (department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (symptoms == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(symptoms);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(id_doctor);
	}

	public long id_patient;
	public String name;
	public String address;
	public String phonenumber;
	public String department;
	public String symptoms;
	public String gender;
	public long id_doctor;
}