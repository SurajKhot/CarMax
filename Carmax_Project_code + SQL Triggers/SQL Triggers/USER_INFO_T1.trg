create or replace trigger "USER_INFO_T1"
AFTER
delete on "USER_INFO"
for each row
begin
insert into user_bakup values(:old.USR_ID,:old.USR_NAME,:old.PASSWORD,:old.AGE,:old.ADDRS,:old.MOB);
end;