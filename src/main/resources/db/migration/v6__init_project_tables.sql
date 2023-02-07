CREATE TABLE projects (
id int PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(100) NOT NULL,
);
CREATE TABLE projects_steps (
id int PRIMARY KEY AUTO_INCREMENT,
description VARCHAR(100) NOT NULL,
days_to_deadline int not null,
project_id int not null,
foreign key project_id references projects(id)
);
alter table task_groups add column project_id int null;
alter table task_groups add foreign key (project_id) references projects (id);