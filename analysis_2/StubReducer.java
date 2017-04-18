import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  String temporary = "";
	  Integer[] total_count = new Integer[8];
	  
	  for(int j = 0; j < 8; j++)
	  {
		  total_count[j] = 0;
	  }
	  
	  for(Text value : values)
	    {
		  temporary = value.toString();
		  for(int j = 0; j < 8; j++)
		  {
			  if(temporary.charAt(j) == '1')
			  {
				  total_count[j]++;
			  }
		  } 
	    }
          int sum = 0;
          for (int j = 0; j < 8; j++ ) {
              sum += total_count[j];
          }
          Double[] percentage = new Double[8];
           
          for (int j = 0; j < 8; j++ ) {
              
	      percentage[j] = ((double)total_count[j]/(double)sum)*100;
          }
	  
          String fres = Double.toString(percentage[0]) + "," + Double.toString(percentage[1]) + "," +Double.toString(percentage[2]) + "," + Double.toString(percentage[3]) + "," + Double.toString(percentage[4]) + "," + Double.toString(percentage[5]) + "," + Double.toString(percentage[6]) + "," + Double.toString(percentage[7]);
	  String key_toSend = "";
      key_toSend = key.toString() + ",";
    context.write(new Text(key_toSend),  new Text(fres));
  }
}
