create table Customers(
customernumber int auto_increment primary key not null,
customerName varchar(50) not null,
phone_number varchar(50) not null,
adress varchar(50) not null
);
create table Employees(
employeeNumber int auto_increment primary key not null,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(50) not null,
jobTitle varchar(50) not null
);
create table Offices(
officeCode varchar(10) primary key not null,
adress varchar(50) not null,
phone varchar(50) not null,
country varchar(50) not null
);
create table Product(
productCode varchar(15) primary key not null,
productName  varchar(70) not null,
MSRP float not null,
buyPrice float not null,
productVendor varchar(50) not null,
quantityInStock int not null
);
create table ProductsLine(
productLine varchar(50) primary key not null,
textDescription text
);
create table Ordder(
orderNumber int primary key not null,
orderDate date not null,
requiredDate date not null,
shippedDate date not null,
quantityOrdered int not null,
priceEach float not null
);
create table Payments(
checkNumber varchar(50) primary key not null,
paymentDate date not null,
amount float
);
alter table Ordder add customernumber int;
alter table Ordder add FOREIGN KEY (customernumber) REFERENCES Customers(customernumber);
alter table Employees add officeCode varchar(10);
alter table Employees add FOREIGN KEY (officeCode) REFERENCES Offices(officeCode);
alter table payments add customernumber int;
alter table payments add FOREIGN KEY (customernumber) REFERENCES Customers(customernumber);
alter table product add productLine varchar(50);
alter table product add FOREIGN KEY (productLine) REFERENCES productsline(productLine);
alter table customers add sellEmployeesnumber int;
alter table customers add FOREIGN KEY (sellEmployeesnumber) REFERENCES Employees(employeeNumber);






