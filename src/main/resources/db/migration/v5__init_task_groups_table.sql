CREATE TABLE tasks (
id int PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(100) NOT NULL,
done bit
);
alter table tasks add column task_group_id int null;
alter table add foreign key (task_group_id) references task_groups (id);