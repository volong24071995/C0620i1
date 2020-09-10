SELECT * FROM classicmodels.payments WHERE paymentDate LIKE '2003_%' ;
SELECT * FROM classicmodels.payments where year(paymentDate)='2003';
select * from payments where paymentDate between '2003-1-1'and'2003-12-31';
select * from products WHERE productName LIKE '%k%';
select * from customers order by customerName asc;
select offices.officeCode, employees.lastName,employees.firstName,offices.country,offices.city
from offices
inner join employees
on offices.officeCode=employees.officeCode;