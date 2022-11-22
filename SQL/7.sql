SELECT FOODTYPE, RESTID, RESTNAME, MAX(FAVORITES) AS FAVORITES
FROM RESTINFO
GROUP BY FOODTYPE
ORDER BY FOODTYPE DESC;

# 위 답안은 틀린 답안

# GROUP BY로 묶으면 가장 상단에 있는 데이터들을 임의로 가져옵니다.

# SELECT *
# FROM RESTINFO;
# 위의 쿼리를 실행해보면 RESTID 순으로 정렬된 테이블이 나옵니다.
# 여기서 GROUP BY FOOD_TYPE으로 묶으면 한식의 맨 첫번째, 일식의 맨 첫번째 ... 를 가져옵니다.
# (문제에서 요구하는 즐겨찾기수가 가장 많은 식당의 정보가 아닌 테이블에서 가장 상단의 식당 정보를 가져오는 거죠)

# 올려주신 쿼리대로 실행하면
# 한식, 중식, 양식, 분식은 임의로 가져온 가장 상단의 값이 운좋게 답과 일치하지만
# 일식은 답과 다른 RESTID, RESTNAME를 가져오게 됩니다.

# SELECT FOODTYPE, RESTID, RESTNAME, FAVORITES, MAX(FAVORITES)
# FROM RESTINFO
# GROUP BY FOODTYPE
# ORDER BY FOODTYPE DESC;
# 위 쿼리는 올려주신 쿼리에서 SELECT 절에 FAVORITES만 추가한 쿼리입니다.
# 실행해보시면 일식 식당의 FAVORITES값이 잘못되었다는 것을 알 수 있을 겁니다.

SELECT A.FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO A
JOIN (SELECT FOOD_TYPE, MAX(FAVORITES) AS MAX
FROM REST_INFO
GROUP BY FOOD_TYPE) B 
ON A.FOOD_TYPE = B.FOOD_TYPE AND A.FAVORITES = B.MAX
ORDER BY A.FOOD_TYPE DESC
