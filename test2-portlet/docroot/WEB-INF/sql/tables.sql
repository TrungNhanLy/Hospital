create table InfomationPatient (
	id_patient INTEGER not null primary key,
	name VARCHAR(75) null,
	identityCart VARCHAR(75) null
);

create table InformationPatient (
	id_patient LONG not null primary key,
	name VARCHAR(75) null,
	identityCart VARCHAR(75) null
);

create table hos_bill (
	bill_no LONG not null primary key,
	patient_name VARCHAR(75) null,
	doctor_name VARCHAR(75) null,
	bill_date DATE null,
	amount INTEGER,
	id_patient LONG
);

create table hos_diagnosis (
	diagnosis_no LONG not null primary key,
	detail VARCHAR(75) null,
	symptoms VARCHAR(75) null,
	diagnosis_date DATE null,
	id_patient LONG
);

create table hos_doctor (
	id_doctor LONG not null primary key,
	name VARCHAR(75) null,
	address VARCHAR(75) null,
	position VARCHAR(75) null,
	gender VARCHAR(75) null
);

create table hos_drug (
	id_medicine LONG not null primary key,
	name_medicine VARCHAR(75) null,
	quantity INTEGER,
	price VARCHAR(75) null,
	expiration_date DATE null
);

create table hos_medicine (
	id_medicine LONG not null primary key,
	bill_no LONG,
	id_drug LONG,
	quantity INTEGER,
	remark VARCHAR(75) null
);

create table hos_patient (
	id_patient LONG not null primary key,
	name VARCHAR(75) null,
	address VARCHAR(75) null,
	phonenumber VARCHAR(75) null,
	department VARCHAR(75) null,
	symptoms VARCHAR(75) null,
	gender VARCHAR(75) null,
	id_doctor LONG
);

create table hos_roompatient (
	room_no LONG not null primary key,
	status VARCHAR(75) null,
	id_patient LONG
);

create table hos_staff (
	id_staff LONG not null primary key,
	name VARCHAR(75) null,
	gender VARCHAR(75) null,
	department VARCHAR(75) null,
	phonenumber VARCHAR(75) null,
	id_doctor LONG
);

create table hos_status (
	status_no LONG not null primary key,
	status_detail VARCHAR(75) null,
	id_patient LONG
);

create table infomationpatient (
	id_patient LONG not null primary key,
	name VARCHAR(75) null,
	identitycart VARCHAR(75) null
);

create table service_Employee (
	id_patient LONG not null primary key,
	name VARCHAR(75) null,
	identityCart VARCHAR(75) null
);