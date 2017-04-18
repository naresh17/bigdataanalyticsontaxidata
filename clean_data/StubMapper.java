import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.FileReader;

public class StubMapper 
	extends Mapper<LongWritable, Text, Text, Text> {
	
	public int SNo = 1;
	private static HashMap<Double, Integer> mapper1 = new HashMap<Double, Integer>();
	private static HashMap<Integer, Double> mapper2 = new HashMap<Integer, Double>();
	private static HashMap<Double, Integer> mapper3 = new HashMap<Double, Integer>();
	private static HashMap<Integer, Double> mapper4 = new HashMap<Integer, Double>();
	
	private static HashMap<Integer, Double> mapper5 = new HashMap<Integer, Double>();
	

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException
  {    
		String Data_path = "/home/cloudera/Desktop/train.csv";
		
		BufferedReader Buffer_Reader = new BufferedReader(new FileReader(Data_path));
		
		
		String data_line = "";
		
		while((data_line = Buffer_Reader.readLine()) != null)
		{
			String[] data = data_line.split(",");
			
			
			mapper1.put(Double.parseDouble(data[1]), Integer.parseInt((data[0])));
			mapper3.put(Double.parseDouble(data[2]), Integer.parseInt((data[0])));	
		}
		
		  data_line = value.toString();
		  String[] data = data_line.split(",");
		  
		  String longitude = data[1];
		  String latitude = data[2];
		  String pincode = "";
		  
		  Iterator it = mapper1.entrySet().iterator();
		    while (it.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)it.next();
		        double diff = Math.abs(Double.parseDouble(pair.getKey().toString()) - Double.parseDouble(latitude));
		        
		        mapper2.put(Integer.parseInt(pair.getValue().toString()), diff);
		    }
		    
		    
		    Iterator iteration1 = mapper3.entrySet().iterator();
		    while (iteration1.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)iteration1.next();
		        double diff = Math.abs(Double.parseDouble(pair.getKey().toString()) - Double.parseDouble(longitude));
		        
		        mapper4.put(Integer.parseInt(pair.getValue().toString()), diff);
		    }
		    
		    
		    Iterator iteration2 = mapper2.entrySet().iterator();
		    while (iteration2.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)iteration2.next();
		        double value1 = Double.parseDouble(pair.getValue().toString());
		        
		        double value2  = mapper4.get(pair.getKey());
		        mapper5.put(Integer.parseInt(pair.getKey().toString()), Math.sqrt((Math.pow(value1, 2) + Math.pow(value2, 2))));
		    }
		    
		    Double min = Collections.min(mapper5.values());
		    
		    Iterator iteration3 = mapper5.entrySet().iterator();
		    while (iteration3.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)iteration3.next();
		        if(pair.getValue() == min)
		        {
		        	pincode = pair.getKey().toString();
		        	break;
		        }
		    }
		    
	      Pincode_to_Area obj = new Pincode_to_Area();
	      obj.initialize();
	      String area = "";

	      
	      if(pincode != "")
	    	  area = obj.getArea(pincode);
	      
	      if(area != "" || area != null)
	      {
	    	  String clean_data = data[0] + "," + area + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
	    	  context.write(new Text(Integer.toString(SNo)), new Text(clean_data));
	    	  
	    	  SNo++;
	      }	
 }
}
