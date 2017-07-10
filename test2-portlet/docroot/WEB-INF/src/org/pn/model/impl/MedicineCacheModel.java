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

import org.pn.model.Medicine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Medicine in entity cache.
 *
 * @author thuctap
 * @see Medicine
 * @generated
 */
public class MedicineCacheModel implements CacheModel<Medicine>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id_medicine=");
		sb.append(id_medicine);
		sb.append(", bill_no=");
		sb.append(bill_no);
		sb.append(", id_drug=");
		sb.append(id_drug);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", remark=");
		sb.append(remark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Medicine toEntityModel() {
		MedicineImpl medicineImpl = new MedicineImpl();

		medicineImpl.setId_medicine(id_medicine);
		medicineImpl.setBill_no(bill_no);
		medicineImpl.setId_drug(id_drug);
		medicineImpl.setQuantity(quantity);

		if (remark == null) {
			medicineImpl.setRemark(StringPool.BLANK);
		}
		else {
			medicineImpl.setRemark(remark);
		}

		medicineImpl.resetOriginalValues();

		return medicineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_medicine = objectInput.readLong();
		bill_no = objectInput.readLong();
		id_drug = objectInput.readLong();
		quantity = objectInput.readInt();
		remark = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_medicine);
		objectOutput.writeLong(bill_no);
		objectOutput.writeLong(id_drug);
		objectOutput.writeInt(quantity);

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}
	}

	public long id_medicine;
	public long bill_no;
	public long id_drug;
	public int quantity;
	public String remark;
}