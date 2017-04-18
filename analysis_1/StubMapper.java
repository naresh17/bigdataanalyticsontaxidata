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
	  String[] data = data_line.split(",");
	  
	  String pickup_address = data[0];
	  String given_tip = data[1];
	  String fare_amount = data[2];
	  
	  if(Double.parseDouble(fare_amount) != 0)
	  {
		  double percentage_tip = (Double.parseDouble(given_tip) / Double.parseDouble(fare_amount))*100;
		  String percent_tip = Double.toString(percentage_tip); 
	      context.write(new Text(pickup_address), new Text(percent_tip)); 
	  }
  }
}

