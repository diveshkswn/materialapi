INSERT INTO material_category (category_id, category_name) VALUES ('C001', 'Thread');
INSERT INTO material_category (category_id, category_name) VALUES ('C002', 'Cloth');
INSERT INTO material_category (category_id, category_name) VALUES ('C003', 'Button');

INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T001', 'Cotton','C001');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T002', 'Nylon','C001');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T003', 'Polyester','C001');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T004', 'Cotton','C002');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T005', 'Nylon','C002');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T006', 'Polyester','C002')
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T007', 'Cotton','C003');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T008', 'Nylon','C003');
INSERT INTO material_type (type_id, type_name,category_id_fk) VALUES ('T009', 'Polyester','C003')



INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U001', 'Meter','C001');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U002', 'CentiMeter','C001');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U003', 'Inches','C001');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U004', 'Meter','C002');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U005', 'CentiMeter','C002');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U006', 'Inches','C002');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U007', 'Meter','C003');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U008', 'CentiMeter','C003');
INSERT INTO unit (unit_id, unit_name,category_id_fk) VALUES ('U009', 'Inches','C003');
-- Please build further queries to add
-- 'MaterialType' and 'Unit' details of this service below.