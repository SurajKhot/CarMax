create or replace trigger "LOAN_INFO_T1"
BEFORE
insert or update on "LOAN_INFO"
for each row
begin
:new.interest:=((:new.amount)*(:new.no_of_years)*(10))/100;
end;