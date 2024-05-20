CREATE DATABASE mydatabase;

use mydatabase;

CREATE TABLE mytable
(
  LastNameFirstName VARCHAR(100) PRIMARY KEY,
  playerID INT,
  yeaR_ INT,
  pa INT,
  k_percent FLOAT
  ,
  bb_percent FLOAT,
  woba FLOAT,
  xwOBA FLOAT,
  LAsweetspot_percent FLOAT,
  barrel_percent FLOAT,
  hard_hit_percent FLOAT,
  ev50 FLOAT,
  adjusted_ev50 FLOAT,
  whiff_percent FLOAT,
  swing_percent FLOAT
);

BULK INSERT mytable
FROM 'stats (2).csv'
WITH
(
  FIELDTERMINATOR = ',',
  ROWTERMINATOR = '\n',
  FIRSTROW = 2
);
