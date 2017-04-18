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
	  String[] raw_data = raw_data_line.split(",");
	  
	  String Pick_up_Address = raw_data[0];
	  String Date_Time = raw_data[1];
	  
	  String[] time_data = Date_Time.split("\\s+");
	  
	  String time = time_data[1].split(":")[0];
	  
	  int hour_limit = Integer.parseInt(time);
	  
	  String time_span = "00000000";
	  
	  if(hour_limit <= 2)
	  {

		  time_span = "10000000";
	  }
	  else if(hour_limit <= 5)
	  {

		  time_span = "01000000";
	  }
	  
	  else if(hour_limit <= 8)
	  {
	
		   time_span = "00100000";
	  }
	  
	  else if(hour_limit <= 11)
	  {
		  
		  time_span = "00010000";
	  }
	  else if(hour_limit <= 14)
	  {
		 
		  time_span = "00001000";
	  }
	  else if(hour_limit <= 17)
	  {
		 
		  time_span = "00000100";
	  }
	  else if(hour_limit <= 20)
		 
		  time_span = "00000010";
	  }
	  else if(hour_limit <= 23)
	  {
		 
		  time_span = "00000001";
	  }

      context.write(new Text(Pick_up_Address), new Text(time_span)); 
  }
}

