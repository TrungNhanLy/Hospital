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

import org.pn.model.Drug;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Drug in entity cache.
 *
 * @author thuctap
 * @see Drug
 * @generated
 */
public class DrugCacheModel implements CacheModel<Drug>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id_drug=");
		sb.append(id_drug);
		sb.append(", name_medicine=");
		sb.append(name_medicine);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", price=");
		sb.append(price);
		sb.append(", expiration_date=");
		sb.append(expiration_date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Drug toEntityModel() {
		DrugImpl drugImpl = new DrugImpl();

		drugImpl.setId_drug(id_drug);

		if (name_medicine == null) {
			drugImpl.setName_medicine(StringPool.BLANK);
		}
		else {
			drugImpl.setName_medicine(name_medicine);
		}

		drugImpl.setQuantity(quantity);

		if (price == null) {
			drugImpl.setPrice(StringPool.BLANK);
		}
		else {
			drugImpl.setPrice(price);
		}

		if (expiration_date == Long.MIN_VALUE) {
			drugImpl.setExpiration_date(null);
		}
		else {
			drugImpl.setExpiration_date(new Date(expiration_date));
		}

		drugImpl.resetOriginalValues();

		return drugImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_drug = objectInput.readLong();
		name_medicine = objectInput.readUTF();
		quantity = objectInput.readInt();
		price = objectInput.readUTF();
		expiration_date = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_drug);

		if (name_medicine == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name_medicine);
		}

		objectOutput.writeInt(quantity);

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		objectOutput.writeLong(expiration_date);
	}

	public long id_drug;
	public String name_medicine;
	public int quantity;
	public String price;
	public long expiration_date;
}