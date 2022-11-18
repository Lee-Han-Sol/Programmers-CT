SELECT a.PRODUCT_ID, a.PRODUCT_NAME, a.price * SUM(b.amount) as TOTAL_SALES # GROUP BY 했으니 총 수량을 합해줬어함
FROM FOOD_PRODUCT a JOIN FOOD_ORDER b
WHERE a.product_id = b.product_id
AND PRODUCE_DATE like '2022-05%'
GROUP BY PRODUCT_ID
ORDER BY TOTAL_SALES DESC, a.PRODUCT_ID ASC;

