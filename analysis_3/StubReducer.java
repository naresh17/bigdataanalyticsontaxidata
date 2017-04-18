import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  double total = 0;
	  for(Text value : values)
	    {
		  total = total + Double.parseDouble(value.toString());
	    }
	  String Send_Key = "";
      Send_Key = key.toString() + ",";
    context.write(new Text(Send_Key),  new Text(Double.toString(total)));
  }
}
