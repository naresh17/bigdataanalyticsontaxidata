# bigdataanalyticsontaxidata
***********************************************************************************
STUDENT NAMES : SAMIR ANGHAN (40040308)
                NARESH DUDHAT (40043135)                
***********************************************************************************
DATA SETS:

1. YELLOW CABS
Name : The official TLC trip record dataset – Yellow Cabs. DECEMBER 2016
Url : http://www.nyc.gov/html/tlc/html/about/trip_record_data.shtml
File type : .CSV File
File Size : 897 MB (941,369,997 bytes)

2. GREEN CABS
Name : The official TLC trip record dataset – Yellow Cabs. DECEMBER 2016
Url : http://www.nyc.gov/html/tlc/html/about/trip_record_data.shtml
File type : .CSV File
File Size : 220 MB (230,989,824 bytes
**********************************************************************************

_______________________________DATA CLEANING_________________________________________________________________________________
STEP 1: Download Dataset files for both yellow & green cabs from above links and clean data using Notepad++ & MS Excel.
STEP 2: Reverse Geocoding (converting latitude and longitude to area)
        For this, place the file 'train.csv' in a folder 'clean_data', set the appropriate path of file 'train.csv' in StubMapper.java, compile files in folder 'clean_data'.
        javac -classpath `hadoop classpath` -d . StubDriver.java StubMapper.java StubReducer.java Pincode_to_Area.java
        jar -cvf Project.jar *.class
        
        Run the jar, 'Project.jar' on the dataset('inp' should contain the dataset in HDFS and 'out' is the output folder) hadoop jar Project.jar StubDriver inp out
        Do the above steps for both yellow and green taxi data. Assuming 'final_yout' and 'final_gout' are the output folders for yellow and green data respectively. 

___________________________HIVE JOBS___________________________________________________________________________________________
STEP 3: Running Hive jobs 

hive> create external table yinp(S_No string, Date_Time_of_pickup string, Area string, Trip_Distance float, Tip_Amount float, Total_Amount float, Payment_Type int)
hive> row format delimited fields terminated by ','
hive> location '/user/cloudera/final_yout/';

hive> create external table ginp(S_No string, Date_Time_of_pickup string, Area string, Trip_Distance float, Tip_Amount float, Total_Amount float, Payment_Type int)
hive> row format delimited fields terminated by ','
hive> location '/user/cloudera/final_gout/';
  
// create tables for respective analysis(1-3)
Analysis 1:
hive> create table a1y row format delimited fields terminated by ',' as select yinp.area,yinp.tip_amount, yinp.total_amount from yinp;
hive> create table a1g row format delimited fields terminated by ',' as select ginp.area,ginp.tip_amount, ginp.total_amount from ginp;

Analysis 2:
hive> create table a2y row format delimited fields terminated by ',' as select yinp.area,yinp.date_time_of_pickup from yinp;
hive> create table a2g row format delimited fields terminated by ',' as select ginp.area,ginp.date_time_of_pickup from ginp;

Analysis 3:
hive> create table a3y row format delimited fields terminated by ',' as select yinp.date_time_of_pickup,yinp.trip_distance from yinp;
hive> create table a3g row format delimited fields terminated by ',' as select ginp.date_time_of_pickup,ginp.trip_distance from ginp;

STEP 4: Combine(append) the 3 files made for each of the tables (eg a1y, a3g etc.) and load them in HDFS for the 3 analysis
Assuming a1y_inp(HDFS input for analytic 1 for yellow dataset), a2y_inp, a3g_inp(HDFS input for analytic 3 for green dataset) etc. are the names of Input for the respective analytic code

_______________________________________________RUN ANALYSIS________________________________________________________________________
STEP 5: Run the different Analytics

Code for different analytics are in the folders analysis_1, analysis_2, analysis_3. 
Compile and run them for the yellow and green taxi dataset.
	For example, to run the analytic 1 on yellow dataset, the following steps may be required 
		javac -classpath `hadoop classpath` -d . StubDriver.java StubMapper.java StubReducer.java
		jar -cvf a1.jar *.class
		hadoop jar a1.jar StubDriver a1y_inp a1y_out

