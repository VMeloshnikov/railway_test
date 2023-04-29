--liquibase formatted sql

--changeset init_tables:1 endDelimiter:/
--comment встака данных

insert into public.user(id, name) values (1, 'John')
/
insert into public.user(id, name) values (2, 'Johanna')
/
insert into public.user_card(id, user_id, card_number, card_sum) values (1, 1, '1223 1234', '123.1')
/
insert into public.user_card(id, user_id, card_number, card_sum) values (2, 2, '4321 4321', '100.500')
/

