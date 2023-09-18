insert into category(category_name) values('Fashion');
insert into category(category_name) values('Electronics');
insert into category(category_name) values('Books');
insert into category(category_name) values('Groceries');
insert into category(category_name) values('Medicines');

insert into role(role) values('CONSUMER');
insert into role(role) values('SELLER');

insert into user(password,username) values('pass_word','jack');
insert into user(password,username) values('pass_word','bob');
insert into user(password,username) values('pass_word','apple');
insert into user(password,username) values('pass_word','glaxo');

insert into cart(total_amount,user_user_id) values(20,1);
insert into cart(total_amount,user_user_id) values(0,2);

insert into product(price,product_name,category_category_id,seller_user_id) values(29190,'Apple iPad 10.2 8th Gen WiFi iOS Tablet',2,3);
insert into product(price,product_name,category_category_id,seller_user_id) values(10,'Crocin pain relief tablet',5,4);


insert into user_roles values(1,1);
insert into user_roles values(2,1);
insert into user_roles values(3,2);
insert into user_roles values(4,2);

insert into cart_product(quantity,cart_cart_id,product_product_id) values(1,2,2);
