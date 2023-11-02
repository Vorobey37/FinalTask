/*Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
*/

use final_task;

create or replace view YoungAnimalsView as
select ID, Name, Type, BirthDate, Commands, TIMESTAMPDIFF(month, BirthDate, curdate()) as 'Age'
from Pets
union select ID, Name, Type, BirthDate, Commands, TIMESTAMPDIFF(month, BirthDate, curdate()) as 'Age'
from PackAnimals;

drop table if exists YoungAnimals;
create table YoungAnimals select * from YoungAnimalsView
where TIMESTAMPDIFF(year, BirthDate, curdate()) < 3 and TIMESTAMPDIFF(year, BirthDate, curdate()) > 1;
