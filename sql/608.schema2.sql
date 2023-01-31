Create table If Not Exists Tree
(
    id   int,
    p_id int
);
Truncate table Tree;
insert into Tree (id, p_id)
values ('1', NULL);