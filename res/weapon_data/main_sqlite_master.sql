INSERT INTO sqlite_master (type, name, tbl_name, rootpage, sql) VALUES ('table', 'weapons', 'weapons', 2, 'CREATE TABLE weapons (
     NAME text not null,
     CATEGORY text not null,
     MAGAZINE_CAPACITY int not null,
     TOTAL_MAGAZINE_CAPACITY int not null,
     DAMAGE int not null,
     RANGE_OF_FIRE int not null,
     WAIT_AFTER_SHOT int not null,
     RELOAD_TIME int not null,
     FIRE_MODE int not null
)');