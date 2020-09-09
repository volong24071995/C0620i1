create table Customers(
 customer_number int auto_increment primary key,
 fullname varchar(40),
 address varchar(40),
 email varchar(40),
 phone varchar(40)
);
create table Accounts(
 account_number int auto_increment primary key,
 account_type varchar(40),
 createdate date,
 balance bigint
);
create table Transactions(
tran_number int auto_increment primary key,
account_number int,
trans_date date,
 amounts  bigint
);
alter table Accounts add customer_number INT ;
alter table Accounts add  FOREIGN KEY (customer_number) REFERENCES customers(customer_number) ;
select*from accounts;
alter table transactions add  FOREIGN KEY (account_number) REFERENCES accounts(account_number) ;
