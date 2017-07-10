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

import org.pn.model.RoomPatient;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RoomPatient in entity cache.
 *
 * @author thuctap
 * @see RoomPatient
 * @generated
 */
public class RoomPatientCacheModel implements CacheModel<RoomPatient>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{room_no=");
		sb.append(room_no);
		sb.append(", status=");
		sb.append(status);
		sb.append(", id_patient=");
		sb.append(id_patient);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RoomPatient toEntityModel() {
		RoomPatientImpl roomPatientImpl = new RoomPatientImpl();

		roomPatientImpl.setRoom_no(room_no);

		if (status == null) {
			roomPatientImpl.setStatus(StringPool.BLANK);
		}
		else {
			roomPatientImpl.setStatus(status);
		}

		roomPatientImpl.setId_patient(id_patient);

		roomPatientImpl.resetOriginalValues();

		return roomPatientImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		room_no = objectInput.readLong();
		status = objectInput.readUTF();
		id_patient = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(room_no);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(id_patient);
	}

	public long room_no;
	public String status;
	public long id_patient;
}