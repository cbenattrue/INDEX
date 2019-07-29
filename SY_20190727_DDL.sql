/* 
*  DB Script Tool
*  SQLite - 2019-07-27 10:59:22
*  2019-07-27 10:57:17
*/ 
sqlite3 SY.db

/* 
PRAGMA foreign_keys=ON; 
.help 
.databases 
*/ 



/* 
*  SY
*  2019-07-27 10:57:35
*/ 
DROP TABLE IF EXISTS SY;
CREATE TABLE SY (
    SY TEXT(9) DEFAULT '9' NOT NULL
);

CREATE UNIQUE INDEX idx_SY_SY ON SY (SY);