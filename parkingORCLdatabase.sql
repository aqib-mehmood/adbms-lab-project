--insert into PARKING_TYPE_TABLE(parking_type_name) values('Bike');
select * from employeetable;
--select * from PARKING_TYPE_TABLE;

--CREATE TABLE parking_plots
--( prarking_plot_id number GENERATED ALWAYS AS IDENTITY,
--  Plot_slot_number varchar2(50),
--  vehicle_name_plate varchar(50),
--  entery_date date,
--  entry_time varchar(50),
--  exit_time varchar(50),
--  price int,
--  parking_id number not null,
--    CONSTRAINT PARKING_Plot_PK
--    FOREIGN KEY (parking_id)
--    REFERENCES Parking_Type_Table(parking_id)
--);

drop table parkingInformation;

--CREATE TABLE parking_type_table
--( parking_id number GENERATED ALWAYS AS IDENTITY,
--parking_type_name varchar(200),
--CONSTRAINT parking_pk PRIMARY KEY (parking_id)
--);
--
--CREATE TABLE parkingInformation
--( 
--  prarking_plot_id number GENERATED ALWAYS AS IDENTITY,
--  floor_level varchar(50),
--  plot_name varchar(100),
--  slot_name varchar(100),
--  vehicle_name_plate varchar(50),
--  entrydate varchar(50),
--  entry_time varchar(50),
--  exit_time varchar(50) default null,
--  parkingtype varchar(100),
--  price number,
--  CONSTRAINT parkinginfo_pk PRIMARY KEY (prarking_plot_id)
--);
select * from parkingInformation;


--create table Floor(
--floor_id number GENERATED ALWAYS AS IDENTITY,
--floor_level varchar(50),
--CONSTRAINT floor_pk PRIMARY KEY (floor_id)
--);
--insert into Floor(floor_level) values('Second Floor');
--select *  from Floor;
--create table plotTable(
--plot_id number GENERATED ALWAYS AS IDENTITY,
--plot_name varchar(100),
--no_of_slots number,
--CONSTRAINT plot_pk PRIMARY KEY (plot_id),
--  floor_id number,
--  CONSTRAINT fk_plot
--  FOREIGN KEY (floor_id)
--  REFERENCES Floor (floor_id)
--
--);
--insert into plotTable(plot_name, no_of_slots,floor_id) values('plot-3',15,1);
--insert into plotTable(plot_name, no_of_slots,floor_id) values('plot-1',12,2);
--select * from plotTable;
--
--create table slotsTable(
--slot_id number GENERATED ALWAYS AS IDENTITY,
--slot_name varchar(100),
--CONSTRAINT slot_pk PRIMARY KEY (slot_id),
--  plot_id number,
--  CONSTRAINT fk_plot_plot
--  FOREIGN KEY (plot_id)
--  REFERENCES plotTable (plot_id)
--);
insert into  slotsTable(slot_name,plot_id) values('slot-C',2);
select * from slotsTable;
select * from Floor;
select * from plottable;
create table status(
fk_id number GENERATED ALWAYS AS IDENTITY,
slot_name varchar(100),
CONSTRAINT fk_pk PRIMARY KEY (fk_id),
  slot_id number,
  CONSTRAINT fk_pl
  FOREIGN KEY (slot_id)
  REFERENCES slotsTable (slot_id)
);