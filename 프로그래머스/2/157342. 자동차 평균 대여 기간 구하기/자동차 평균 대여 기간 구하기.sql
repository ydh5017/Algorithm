-- 코드를 입력하세요
SELECT CAR_ID, round(avg(datediff(END_DATE,START_DATE)+1), 1) 'AVERAGE_DURATION'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by 1
having avg(datediff(END_DATE,START_DATE)+1) >= 7
order by 2 desc, 1 desc