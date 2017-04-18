import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class StubMapper 
	extends Mapper<LongWritable, Text, Text, Text> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException
  {
	  String data_line = value.toString();
	  String[] data = raw_data_line.split(",");
	  
	  String Trip_Distance = raw_data[1];
	  String Date_Time = raw_data[0];
	  
	  String[] data_time = Date_Time.split("\\s+");
	  
	  String date = data_time[0];
	  String[] data_date = date.split("/");
	  
	  int month = Integer.parseInt(data_date[0]);
	  int days = Integer.parseInt(data_date[1]);
	  
	  String time_span = "00-00-00-00-00-00-00-00-00-00-00-00";
	  //Monthly intervals for every 15 days.
	  
	  if(month == 1)
	  {
		  if(days <=15)
			  time_span = "10-00-00-00-00-00-00-00-00-00-00-00";
		  else
			  time_span = "01-00-00-00-00-00-00-00-00-00-00-00";
	  }  
	  else if(month == 2)
	  {
		  if(days <=15)
			  time_span = "00-10-00-00-00-00-00-00-00-00-00-00";
		  else
			  time_span = "00-01-00-00-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 3)
	  {
		  if(days <=15)
			  time_span = "00-00-10-00-00-00-00-00-00-00-00-00";
		  else
			  time_span = "00-00-01-00-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 4)
	  {
		  if(days <=15)
			  time_span = "00-00-00-10-00-00-00-00-00-00-00-00";
		  else
			  time_span = "00-00-00-01-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 5)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-10-00-00-00-00-00-00-00";
		  else
			  time_span = "00-00-00-00-01-00-00-00-00-00-00-00";
	  }
	  else if(month == 6)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-10-00-00-00-00-00-00";
		  else
			  time_span = "00-00-00-00-00-01-00-00-00-00-00-00";
	  }
	  else if(month == 7)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-10-00-00-00-00-00";
		  else
			  time_span = "00-00-00-00-00-00-01-00-00-00-00-00";
	  }
	  else if(month == 8)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-00-10-00-00-00-00";
		  else
			  time_span = "00-00-00-00-00-00-00-01-00-00-00-00";
	  }
	  else if(month == 9)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-00-00-10-00-00-00";
		  else
			  time_span = "00-00-00-00-00-00-00-00-01-00-00-00";
	  }
	  else if(month == 10)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-00-00-00-10-00-00";
		  else
			  time_span = "00-00-00-00-00-00-00-00-00-01-00-00";
	  }
	  else if(month == 11)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-00-00-00-00-10-00";
		  else
			  time_span = "00-00-00-00-00-00-00-00-00-00-01-00";
	  }
	  else if(month == 12)
	  {
		  if(days <=15)
			  time_span = "00-00-00-00-00-00-00-00-00-00-00-10";
		  else
			  time_span = "00-00-00-00-00-00-00-00-00-00-00-01";
	  }
	  

      context.write(new Text(interval), new Text(Trip_Distance)); 
  }
}

