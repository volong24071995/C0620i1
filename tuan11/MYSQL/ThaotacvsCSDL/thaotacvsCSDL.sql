select count(customerNumber),country from customers group by country having count(customerNumber)>5 ORDER BY count(customerNumber);
SELECT productCode,productName, buyprice, textDescription from products
INNER JOIN productlines
ON products.productline = productlines.productline
where buyprice > 56.76 and quantityInStock > 10;
select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'