SELECT 
 `e`.`employee_id`,
 `e`.`employee_name`,
 `e`.`email`,
 `e`.`date_of_joing`, 
 `e`.`salary`,
 `p`.`project_id`,
 `p`.`project_name`,
 `p`.`project_client_name`,
 `p`.`total_budget`,
 `p`.`billing_currency`
FROM 
gd_hibernate.employee_table as e,
gd_hibernate.employee_project as ep,
gd_hibernate.project_table as p
WHERE
e.employee_id=ep.EMPLOYEE_ID AND
ep.PROJECT_ID=p.project_id;
