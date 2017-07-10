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

import org.pn.model.Doctors;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Doctors in entity cache.
 *
 * @author thuctap
 * @see Doctors
 * @generated
 */
public class DoctorsCacheModel implements CacheModel<Doctors>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id_doctor=");
		sb.append(id_doctor);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", position=");
		sb.append(position);
		sb.append(", gender=");
		sb.append(gender);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Doctors toEntityModel() {
		DoctorsImpl doctorsImpl = new DoctorsImpl();

		doctorsImpl.setId_doctor(id_doctor);

		if (name == null) {
			doctorsImpl.setName(StringPool.BLANK);
		}
		else {
			doctorsImpl.setName(name);
		}

		if (address == null) {
			doctorsImpl.setAddress(StringPool.BLANK);
		}
		else {
			doctorsImpl.setAddress(address);
		}

		if (position == null) {
			doctorsImpl.setPosition(StringPool.BLANK);
		}
		else {
			doctorsImpl.setPosition(position);
		}

		if (gender == null) {
			doctorsImpl.setGender(StringPool.BLANK);
		}
		else {
			doctorsImpl.setGender(gender);
		}

		doctorsImpl.resetOriginalValues();

		return doctorsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_doctor = objectInput.readLong();
		name = objectInput.readUTF();
		address = objectInput.readUTF();
		position = objectInput.readUTF();
		gender = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_doctor);

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

		if (position == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}
	}

	public long id_doctor;
	public String name;
	public String address;
	public String position;
	public String gender;
}