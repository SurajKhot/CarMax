create or replace trigger "USER_INFO_SIGNUP"
AFTER
insert or update on "USER_INFO"
for each row
begin
insert into login(usr_name,password)
values(:new.usr_name,:new.password);
end;