SELECT 
 `e`.`employee_id`,
 `e`.`employee_name`,
 `e`.`email`,
 `e`.`date_of_joing`, 
 `e`.`salary`,
 `p`.`pancard_id`,
 `p`.`pancard_number`,
 `p`.`date_of_birth`
FROM 
gd_hibernate.employee_table as e,
gd_hibernate.pancard_table as p
WHERE
e.pancard_id_fk=p.pancard_id;