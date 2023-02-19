/**
 * Author:  kriger
 * Created: May 30, 2022
 */

DROP DATABASE IF EXISTS ontario;
CREATE DATABASE ontario;
USE ontario;

CREATE TABLE Recipients (
    AwardID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name varchar(40) NOT NULL,
    Year int NOT NULL,
    City varchar(30) NOT NULL,
    Category varchar(40) NOT NULL
);
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lapierre; André', '2020', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Levesque; André M.', '2020', 'Ottawa','History Preservation/ Commemoration');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Liu; Peter', '2020', 'Ottawa','Medicine');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Jotham; Neal', '2018', 'Ottawa','Animal Welfare');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'McGuinty; Hon. Dalton', '2018', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Pitre; Lyne', '2018', 'Ottawa','Medicine');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Gingras; Claude', '2013', 'Ottawa','Business');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Thomson; Shirley', '2009', 'Ottawa','Arts');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Pinel; Suzanne', '2011', 'Ottawa','Arts/Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Des Rosiers; Nathalie', '2011', 'Ottawa','Law');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Ogilvie; Margaret Helen ', '2007', 'Ottawa','Law');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Caza; Ronald', '2016', 'Ottawa','Law ');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Bond; Jennifer', '2016', 'Ottawa','Law/Human Rights');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Greenberg; Shirley', '2016', 'Ottawa','Law/Human Rights');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Backhouse; Constance', '2009', 'Ottawa','Law/Human Rights  ');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Tierney; Frank', '2012', 'Ottawa','Publishing');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lamoureux; Sylvie', '2014', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'McLeod; Lyn', '2013', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Collenette; Penny', '2013', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Labelle; Huguette', '2010', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Gauthier; Hon. Jean Robert *', '2008', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Keeping; Max', '2007', 'Ottawa','Broadcast Journalism');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Staines; David', '2010', 'Ottawa','Literature');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Turnbull; Jeffrey', '2014', 'Ottawa','Medicine');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Beck; Gail', '2010', 'Ottawa','Medicine/Human Rights');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Patry; Gilles', '2010', 'Ottawa','Academia');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Corkum; Paul', '2013', 'Ottawa','Science');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'LeVasseur; Gilles', '2014', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Fisher; Allison', '2013', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Harris; Christopher A. ', '2007', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Allen; Danielle', '2000', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Kinsella; Elizabeth Ann', '2010', 'Ottawa','Social Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Logue; Louise', '2010', 'Ottawa','Social Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Dinsdale; Peter', '2017', 'Ottawa','Social Justice/Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Geist; Michael', '2017', 'Ottawa','Law/Technology');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lapierre; Myrtha', '2017', 'Ottawa','Healthcare/Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Rock; Allan', '2017', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Sheehy; Elizabeth', '2017', 'Ottawa','Law');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Adrian; Melanie', '2019', 'Ottawa','Law/Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Pitre; J.U. René', '2015', 'Ottawa','Business');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Franca; Celia', '1987', 'Ottawa','Arts-Dance');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'McDermott; Dennis', '1988', 'Ottawa','Advocacy');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'McCausland Benidickson; Agnes * ', '1991', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Sarazin; Wilfrid ', '1990', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lemieux; Charlotte', '1988', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Guindon; Roger', '1987', 'Ottawa','Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Marin; René ', '2004', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'MacDonald; Hon. Flora', '1994', 'Ottawa','Public Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Ali Khan; Mohammed Azhar ', '2004', 'Ottawa','Journalism');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Flamand; Jacques', '2009', 'Ottawa','Literature');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Chadderton; Hugh Clifford *', '1991', 'Ottawa','Medicine/Education');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Ratushny; Ed ', '2008', 'Ottawa','Academia');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'DeGagné; Mike', '2009', 'Ottawa','Academia/Advocacy');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Mendes; Errol Patrick', '2015', 'Ottawa','Academia/Human Rights');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Georganas; Nicolas D.', '2001', 'Ottawa','Academia/Engineering');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Smith; David ', '2008', 'Ottawa','Philanthropy');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lu; Benjamin C.Y.', '1993', 'Ottawa','Science');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Girvan; June', '2015', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Leroux; Rhéal ', '2002', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Cassidy; Nickie', '2000', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Pellerin; Normand', '2000', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Lortie; Andrée', '1998', 'Ottawa','Community Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Swail; James Carl', '1987', 'Ottawa','Social Service');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Campbell; Monica Elaine', '2015', 'Ottawa','Healthcare');
INSERT INTO Recipients (Name,Year,City,Category) VALUES (
'Katz; Leon', '2005', 'Ottawa','Engineering');
