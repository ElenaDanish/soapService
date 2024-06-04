CREATE TABLE insurer(
   id INT GENERATED ALWAYS AS identity PRIMARY KEY,
   reg_num VARCHAR(10) NOT NULL,
      reg_num_pf VARCHAR(12),
       state VARCHAR(20),
       fss_department_code VARCHAR(4)
);

INSERT INTO insurer(reg_num, reg_num_pf, state, fss_department_code)
VALUES ('0201001539', '456466466464', 'Зарегистрирован', '0201'), ('4202005432', '567895600009', 'Ликвидирован', '4202'), ('3808006267', '048007032731', 'Зарегистрирован', '3808');


select * from  insurer