import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  public int SNo = 0;
  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  
	  for(Text value : values)
	    {
		  
                  String send = "," + value.toString();
                  SNo ++;  
                  context.write(new Text(Integer.toString(SNo)), new Text(send));
	    }
	  
  }
}
