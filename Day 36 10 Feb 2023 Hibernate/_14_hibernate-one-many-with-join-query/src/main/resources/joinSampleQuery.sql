SELECT 
 `e`.`employee_id`,
 `e`.`employee_name`,
 `e`.`email`,
 `e`.`date_of_joing`, 
 `e`.`salary`,
 `v`.`vehicle_id`,
 `v`.`number_plate`,
 `v`.`vehicle_model_name`
FROM 
gd_hibernate.employee_table as e,
gd_hibernate.vehicle_table as v
WHERE
e.employee_id=v.employee_id_fk;
