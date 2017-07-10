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

import org.pn.model.Staffs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Staffs in entity cache.
 *
 * @author thuctap
 * @see Staffs
 * @generated
 */
public class StaffsCacheModel implements CacheModel<Staffs>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id_staff=");
		sb.append(id_staff);
		sb.append(", name=");
		sb.append(name);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", department=");
		sb.append(department);
		sb.append(", phonenumber=");
		sb.append(phonenumber);
		sb.append(", id_doctor=");
		sb.append(id_doctor);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Staffs toEntityModel() {
		StaffsImpl staffsImpl = new StaffsImpl();

		staffsImpl.setId_staff(id_staff);

		if (name == null) {
			staffsImpl.setName(StringPool.BLANK);
		}
		else {
			staffsImpl.setName(name);
		}

		if (gender == null) {
			staffsImpl.setGender(StringPool.BLANK);
		}
		else {
			staffsImpl.setGender(gender);
		}

		if (department == null) {
			staffsImpl.setDepartment(StringPool.BLANK);
		}
		else {
			staffsImpl.setDepartment(department);
		}

		if (phonenumber == null) {
			staffsImpl.setPhonenumber(StringPool.BLANK);
		}
		else {
			staffsImpl.setPhonenumber(phonenumber);
		}

		staffsImpl.setId_doctor(id_doctor);

		staffsImpl.resetOriginalValues();

		return staffsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_staff = objectInput.readLong();
		name = objectInput.readUTF();
		gender = objectInput.readUTF();
		department = objectInput.readUTF();
		phonenumber = objectInput.readUTF();
		id_doctor = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_staff);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (phonenumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phonenumber);
		}

		objectOutput.writeLong(id_doctor);
	}

	public long id_staff;
	public String name;
	public String gender;
	public String department;
	public String phonenumber;
	public long id_doctor;
}