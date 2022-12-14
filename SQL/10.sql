-- 코드를 입력하세요
SELECT M.MEMBER_NAME ,R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') REVIEW_DATE FROM REST_REVIEW R JOIN 
(SELECT MEMBER_ID, COUNT(MEMBER_ID) FROM REST_REVIEW GROUP BY MEMBER_ID ORDER BY COUNT(MEMBER_ID) DESC LIMIT 1) L 
ON R.MEMBER_ID = L.MEMBER_ID
JOIN MEMBER_PROFILE M
ON R.MEMBER_ID = M.MEMBER_ID
ORDER BY REVIEW_DATE;
