-- 코드를 입력하세요
SELECT month(START_DATE) 'MONTH', CAR_ID, count(HISTORY_ID) 'RECORDS'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where month(START_DATE) between '8' and '10'
and CAR_ID in 
(
select CAR_ID
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where month(START_DATE) between 8 and 10  
group by CAR_ID
having count(*) >4
)
group by 2, 1
order by 1, 2 desc