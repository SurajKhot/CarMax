create or replace trigger "BI_USER_INFO"   
  before insert on "USER_INFO"               
  for each row  
begin   
    select "USER_INFO_SE".nextval into :NEW.USR_ID from dual; 
end; 
