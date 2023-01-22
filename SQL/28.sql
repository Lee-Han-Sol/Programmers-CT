SELECT i.ANIMAL_ID, i.NAME
from ANIMAL_INS as i

join ANIMAL_OUTS as o
on o.ANIMAL_ID = i.ANIMAL_ID

order by (o.datetime-i.datetime) desc

limit 2;
