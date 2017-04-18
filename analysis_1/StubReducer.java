import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  String temporary = "";
	  Double average_tip_received = 0.0;
	  Double tip_sum = 0.0;
	  int counter = 0;
	  for(Text value : values)
	    {
		  temporary = value.toString();
		  if(temporary != "")
		  {
			  tip_sum = tip_sum + Double.parseDouble(temporary);
			  counter++;
		  }
	    }
	  
	  if(counter != 0)
		  average_tip_received = tip_sum / counter;
	  String Key_Send = "";
      Key_Send = key.toString() + ",";
    context.write(new Text(Key_Send),  new Text(average_tip_received.toString()));
  }
}