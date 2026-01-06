select a.firstName,a.lastName,b.city,b.state
from
(select personId,lastName,firstName from Person) a
left join
(select personId,city,state from Address) b 
on a.personId=b.personId;
