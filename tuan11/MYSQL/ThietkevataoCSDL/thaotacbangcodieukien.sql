SELECT productCode,productName,productLine FROM classicmodels.products 	
WHERE productLine LIKE 'Classic_%' ;
select productCode,productName,productLine, (case when (productLine like '%Classic%')
then
	'Co dien'
else
	'Binh thuong'
end)
 as Loai_san_pham from products