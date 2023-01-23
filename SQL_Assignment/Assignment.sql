CREATE DATABASE DPhone

\c DPhone

CREATE TABLE USERS(
userId INT PRIMARY KEY,
first_name TEXT NOT NULL,
last_name TEXT,
mobile INT NOT NULL,
email TEXT,
username TEXT NOT NULL,
password TEXT NOT NULL)
;

CREATE TABLE REFERRAL(
referralID INT PRIMARY KEY,
ref_first_name TEXT NOT NULL,
ref_last_name TEXT,
mobile INT NOT NULL,
email TEXT,
userID TEXT NOT NULL,
date_of_referral DATE,
referral_points INT,
status TEXT,
UserId INT);

ALTER TABLE referral ADD CONSTRAINT userID_ref FOREIGN KEY(userID) REfERENCES USERS(userId) ON DELETE CASCADE;

create table customer(
customerid INT NOT NULL Primary Key,
first_name TEXT NOT NULL,
last_name TEXT,
email TEXT NOT NULL,
mobile INT);

create table buyingDetails(
customerId int NOT NULL,
purchase_date date NOT NULL,
product_name TEXT NOT NULL
userId INT);

alter table buyingDetails add constraint buy_fk foreign key(customerid) references Customer(customerid);

INSERT INTO Users(userid, first_name, last_name, address, mobile, email, username, password) VALUES(1, 'Shivam', 'Agrawal', 'Indore', 1222222222, 'shivam.agrawal@bajajfinserv.in', 'Shivam', 'Shivam');
INSERT INTO Users(userid, first_name, last_name, address, mobile, email, username, password) VALUES(2, 'Sumit', 'Kulhari', 'Chennai', 1111111111, 'sumit.kulhari@bajajfinserv.in', 'Sumit', 'Sumit');
INSERT INTO Users(userid, first_name, last_name, address, mobile, email, username, password) VALUES(3, 'Saurav', 'Agrawal', 'Patna', 1010101010, 'saurav.agrawal@bajajfinserv.in', 'Saurav', 'Saurav');
INSERT INTO Users(userid, first_name, last_name, address, mobile, email, username, password) VALUES(4, 'Devansh', 'Singh', 'Meerut', 0101010101, 'devansh.singh@bajajfinserv.in', 'devansh', 'devash');
INSERT INTO Users(userid, first_name, last_name, address, mobile, email, username, password) VALUES(5, 'Abhishyom', 'Bhattacharya', 'Tripura', 1000000000, 'abhishyom.bhattacharya@bajajfinserv.in', 'abhishyom', 'abhishyom');

INSERT INTO Referral(referralid, ref_first_name, ref_last_name, mobile, email, date_of_referral, referral_points, status, userid) VALUES(1, 'Akash', 'Joshi', 1111111111, 'akash.joshi@gmail.com', '2023-01-01', 1000, 'Not Redeemed', 1);
INSERT INTO Referral(referralid, ref_first_name, ref_last_name, mobile, email, date_of_referral, referral_points, status, userid) VALUES(2, 'Anurag', 'Gupte', 1111111110, 'anurag.gupte@gmail.com', '2023-01-11', 1000, 'Redeemed', 1);
INSERT INTO Referral(referralid, ref_first_name, ref_last_name, mobile, email, date_of_referral, referral_points, status, userid) VALUES(3, 'Pratik', 'Sarkar', 1111111100, 'pratik.sarkar@gmail.com', '2023-01-09', 1000, 'Redeemed', 2);
INSERT INTO Referral(referralid, ref_first_name, ref_last_name, mobile, email, date_of_referral, referral_points, status, userid) VALUES(4, 'Shreyansh', 'Sachan', 1111111000, 'shreyansh.sachan@gmail.com', '2023-01-10', 1000, 'Not Redeemed', 3);
INSERT INTO Referral(referralid, ref_first_name, ref_last_name, mobile, email, date_of_referral, referral_points, status, userid) VALUES(5, 'Raj', 'Gupta', 1111110000, 'raj.gupta@gmail.com', '2023-01-05', 1000, 'Redeemed', 4);

INSERT INTO customer VALUES(1, 'Rajeta', 'Sarkar', 'pratik.sarkar@gmail.com', 1111111112);
INSERT INTO customer VALUES(2, 'Soumyaraj', 'Roy', 'soumyarajroy@gmail.com', 1111111122);
INSERT INTO customer VALUES(3, 'Kaustubh', 'Dwivedi', 'kaustubhdwivedi@gmail.com', 1111111222);
INSERT INTO customer VALUES(4, 'Tanmay', 'Misra', 'tanmay.misra@gmail.com', 1111112222);
INSERT INTO customer VALUES(5, 'Ksithj', 'Chavan', 'ksithj.chavan@gmail.com', 1111122222);

INSERT INTO buyingdetails VALUES(1, '2023-01-11', 'iPhone 14', 1);
INSERT INTO buyingdetails VALUES(2, '2023-02-11', 'iPhone 14', 2);
INSERT INTO buyingdetails VALUES(3, '2023-02-03', 'iPhone 14', 4);
INSERT INTO buyingdetails VALUES(4, '2023-02-03', 'iPhone 13', 5);
INSERT INTO buyingdetails VALUES(5, '2023-02-03', 'iPhone 13', 3);

-----
QUERY
-----

1-
SELECT COUNT(*) FROM Referral GROUP BY userId;

2-
SELECT COUNT(*) FROM Referral WHERE status='Redeemed' GROUP BY userId;

3-
SELECT first_name, last_name FROM Users INNER JOIN buyingDetails ON Users.Userid=buyingDetails.userId WHERE purchase_date='2023-02-11';

4-
SELECT * FROM Customer INNER JOIN BuyingDetails ON Customer.customerid = BuyingDetails.customerid WHERE product_name='iPhone 14';

5-
DELETE FROM Customer WHERE customerid IN (SELECT customerid FROM BuyingDetails WHERE product_name='iPhone 14');

6-
CREATE VIEW userView AS (SELECT first_name, last_name, mobile, email FROM Users);

-
SELECT * FROM UserView ORDER BY email;

-
SELECT * FROM UserView ORDER BY mobile;