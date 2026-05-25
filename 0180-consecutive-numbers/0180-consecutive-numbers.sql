# Write your MySQL query statement below
select distinct(n1.num) as ConsecutiveNums   from Logs n1 
join Logs n2 on n1.id=n2.id-1
join Logs n3 on n2.id=n3.id-1
where n1.num=n2.num and n2.num=n3.num;