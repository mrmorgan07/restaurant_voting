INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_First', 'User_Last', 'password'),
       ('admin@javaops.ru', 'Admin_First', 'Admin_Last', 'admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('ROLE_USER', 1),
       ('ROLE_ADMIN', 2),
       ('ROLE_USER', 2);

INSERT INTO DISH (NAME, DESCRIPTION, PRICE)
VALUES ('Завтрак','Яишница и кофе', '10');

INSERT INTO DISH (NAME, DESCRIPTION, PRICE)
VALUES ('Ланч','Кофе с булочкой', '35');

INSERT INTO DISH (NAME, DESCRIPTION, PRICE)
VALUES ('Ужин','Салат, Стейк из говядины, Десерт', '100');

INSERT INTO DISH (NAME, DESCRIPTION, PRICE)
VALUES ('БизнеЛанч','Салат, Борщ, Бифстроганов', 70);

insert into RESTAURANT (NAME)
VALUES('Клод Моне');

insert into RESTAURANT (NAME)
VALUES('Швили');

insert into RESTAURANT_MENU (RESTAURANT_ID, DISH_ID)
VALUES ('1','1');

insert into RESTAURANT_MENU (RESTAURANT_ID, DISH_ID)
VALUES ('1','2');

insert into RESTAURANT_MENU (RESTAURANT_ID, DISH_ID)
VALUES ('1','4');

insert into RESTAURANT_MENU (RESTAURANT_ID, DISH_ID)
VALUES ('2','3');

insert into RESTAURANT_MENU (RESTAURANT_ID, DISH_ID)
VALUES ('2','4');