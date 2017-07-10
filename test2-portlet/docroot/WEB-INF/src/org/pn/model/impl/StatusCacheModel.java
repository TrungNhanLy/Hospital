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

import org.pn.model.Status;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Status in entity cache.
 *
 * @author thuctap
 * @see Status
 * @generated
 */
public class StatusCacheModel implements CacheModel<Status>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{status_no=");
		sb.append(status_no);
		sb.append(", status_detail=");
		sb.append(status_detail);
		sb.append(", id_patient=");
		sb.append(id_patient);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Status toEntityModel() {
		StatusImpl statusImpl = new StatusImpl();

		statusImpl.setStatus_no(status_no);

		if (status_detail == null) {
			statusImpl.setStatus_detail(StringPool.BLANK);
		}
		else {
			statusImpl.setStatus_detail(status_detail);
		}

		statusImpl.setId_patient(id_patient);

		statusImpl.resetOriginalValues();

		return statusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		status_no = objectInput.readLong();
		status_detail = objectInput.readUTF();
		id_patient = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(status_no);

		if (status_detail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status_detail);
		}

		objectOutput.writeLong(id_patient);
	}

	public long status_no;
	public String status_detail;
	public long id_patient;
}