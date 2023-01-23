Create table If Not Exists World
(
    name       varchar(255),
    continent  varchar(255),
    area       int,
    population int,
    gdp        bigint
);

Truncate table World;

insert into World (name, continent, area, population, gdp)
values ('Afghanistan', 'Asia', '3000000', '25500100', '20343000000');
insert into World (name, continent, area, population, gdp)
values ('Albania', 'Europe', '28748', '25000000', '12960000000');