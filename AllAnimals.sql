/*Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
*/

use final_task;

create or replace view Animals as
select *
from Pets
union select *
from PackAnimals;

drop table if exists AllAnimals;
create table AllAnimals select *,
case
	when Type = "Dog"
		then "Pets"
	when Type = "Cat"
		then "Pets"
	when Type = "Hamster"
		then "Pets"
	when Type = "Horse"
		then "PackAnimals"
	when Type = "Camel"
		then "PackAnimals"
	when Type = "Donkey"
		then "PackAnimals"
end as "Table"
from Animals;
