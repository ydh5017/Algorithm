-- 코드를 입력하세요
SELECT CART_ID
from CART_PRODUCTS
where NAME in ('Yogurt','Milk')
group by CART_ID
having count(distinct NAME) >= 2
order by 1