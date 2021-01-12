```mysql
create database company;
use company;
create table dept(
    d_id int primary key auto_increment,
    d_name varchar(20) not null
)
create table emp(
    e_id int primary key auto_increment,
    e_name varchar(10),
    e_sex varchar(2),
    e_age int,
    e_address default '不详',
    d_id int,
    foreign key d_id references dept(d_id)
)

select e_name '姓名',e_address '住址' from emp
where e_sex = '男' and e_age < 30 and e_age >25;

select * from emp e 
join dept d on e.d_id=d.d_id
where e.e_age<40 and e.e_sex='男' and d.d_name='后勤部'；

select name '姓名' from emp e
join dept d on d.d_id=e.d_id
where d.d_name='人事部' and e.e_age=max(e.e_age);

insert into emp(e_name,e_sex,e_age,d_id) values('张三','男',32,2);

update 
```

