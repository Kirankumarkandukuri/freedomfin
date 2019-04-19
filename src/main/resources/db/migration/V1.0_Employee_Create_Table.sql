CREATE TABLE employee (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
    address VARCHAR(24) NULL DEFAULT NULL, firstName VARCHAR(24) NULL DEFAULT NULL,lastName VARCHAR(24) NULL DEFAULT NULL,
    department_id  VARCHAR(24) NULL DEFAULT NULL,
  PRIMARY KEY (id),
   CONSTRAINT `FK532hhgpyh46ehrjbva4ek3a4g` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
  
  ) 
  