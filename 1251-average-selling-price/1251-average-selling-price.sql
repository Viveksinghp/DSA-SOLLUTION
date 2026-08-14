# Write your MySQL query statement below
SELECT p.product_id, ROUND(IFNULL(Sum(p.price*u.units)/Sum(u.units),0),2) as average_price
FROM Prices p
LEFT JOIN UnitsSold as u
ON p.product_id=u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id