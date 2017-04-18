import java.util.*;

public class Pincode_to_Area 
{
	private HashMap<String, String> map = new HashMap<String, String>();
	
	void initialize()
	{
		String[] array = {"Central Bronx","10453", "10457","10460"};
		
		for(int j = 1;j < array.length;j++)
		{
			map.put(array[j], array[0]);
		}
		
        String[] data_area1 = {"Bronx Park and Fordham","10458", "10467", "10468"};
		
		for(int j = 1;j < data_area1.length;j++)
		{
			map.put(data_area1[j], data_area1[0]);
		}
		
        String[] data_area2 = {"High Bridge and Morrisania","10451", "10452", "10456"};
		
		for(int j = 1;j < data_area2.length;j++)
		{
			map.put(data_area2[j], data_area2[0]);
		}
		
	    String[] data_area3 = {"Hunts Point and Mott Haven","10454", "10455", "10459", "10474"};
			
		for(int j = 1;j < data_area3.length;j++)
		{
			map.put(data_area3[j], data_area3[0]);
		}
		
		String[] data_area4 = {"Kingsbridge and Riverdale","10463", "10471"};
			
		for(int j = 1;j < data_area4.length;j++)
		{
			map.put(data_area4[j], data_area4[0]);
		}
		
		String[] data_area5 = {"Northeast Bronx","10466", "10469", "10470", "10475"};
		
		for(int j = 1;j < data_area5.length;j++)
		{
			map.put(data_area5[j], data_area5[0]);
		}
		
		String[] data_area6 = {"Southeast Bronx","10461", "10462","10464", "10465", "10472", "10473"};
		
		for(int j = 1;j < data_area6.length;j++)
		{
			map.put(data_area6[j], data_area6[0]);
		}
		
		String[] data_area7 = {"Central Brooklyn","11212", "11213", "11216", "11233", "11238"};
		
		for(int j = 1;j < array7.length;j++)
		{
			map.put(array7[j], array7[0]);
		}
		
		String[] data_area8 = {"Southwest Brooklyn","11209", "11214", "11228"};
		
		for(int j = 1;j < data_area8.length;j++)
		{
			map.put(data_area8[j], data_area8[0]);
		}
		
		String[] data_area9 = {"Borough Park","11204", "11218", "11219", "11230"};
		
		for(int j = 1;j < data_area9.length;j++)
		{
			map.put(data_area9[j], data_area9[0]);
		}
		
		String[] data_area10 = {"Canarsie and Flatlands","11234", "11236", "11239"};
		
		for(int j = 1;j < data_area10.length;j++)
		{
			map.put(data_area10[j], data_area10[0]);
		}		
				
		String[] data_area11 = {"Southern Brooklyn","11223", "11224", "11229", "11235"};
		
		for(int j = 1;j < data_area11.length;j++)
		{
			map.put(data_area11[j], data_area11[0]);
		}
		
		String[] data_area12 = {"Northwest Brooklyn","11201", "11205", "11215", "11217", "11231"};
		
		for(int j = 1;j < data_area12.length;j++)
		{
			map.put(data_area12[j], data_area12[0]);
		}	
		
		String[] data_area13 = {"Flatbush","11203", "11210", "11225", "11226"};
		
		for(int j = 1;j < data_area13.length;j++)
		{
			map.put(data_area13[j], data_area13[0]);
		}	
		
		String[] data_area14 = {"East New York and New Lots","11207", "11208"};
		
		for(int j = 1;j < data_area14.length;j++)
		{
			map.put(data_area14[j], data_area14[0]);
		}	
		
		String[] data_area15 = {"Greenpoint","11211", "11222"};
		
		for(int j = 1;j < data_area15.length;j++)
		{
			map.put(data_area15[j], data_area15[0]);
		}		
		
		String[] data_area16 = {"Sunset Park","11220", "11232"};
		
		for(int j = 1;j < data_area16.length;j++)
		{
			map.put(data_area16[j], data_area16[0]);
		}	
		
		String[] data_area17 = {"Bushwick and Williamsburg","11206", "11221", "11237"};
		
		for(int j = 1;j < data_area17.length;j++)
		{
			map.put(data_area17[j], data_area17[0]);
		}
		
		String[] data_area18 = {"Central Harlem","10026", "10027", "10030", "10037", "10039"};
		
		for(int j = 1;j < data_area18.length;j++)
		{
			map.put(data_area18[j], data_area18[0]);
		}
		
		String[] data_area19 = {"Chelsea and Clinton","10001", "10011", "10018", "10019", "10020", "10036"};
		
		for(int j = 1;j < data_area19.length;j++)
		{
			map.put(data_area19[j], data_area19[0]);
		}
		
		String[] data_area20 = {"East Harlem","10029", "10035"};
		
		for(int j = 1;j < data_area20.length;j++)
		{
			map.put(data_area20[j], data_area20[0]);
		}
		
		
		
        String[] data_area22 = {"Gramercy Park and Murray Hill","10010", "10016", "10017", "10022"};
        
        for(int j = 1;j < data_area22.length;j++)
        {
            map.put(data_area22[j], data_area22[0]);
        }


    String[] data_area23 = {"Greenwich Village and Soho","10012", "10013", "10014" };
        
        for(int j = 1;j < data_area23.length;j++)
        {
            map.put(data_area23[j], data_area23[0]);
        }


    String[] data_area24 = {"Lower Manhattan","10004", "10005", "10006", "10007", "10038", "10280" };
        
        for(int j = 1;j < data_area24.length;j++)
        {
            map.put(data_area24[j], data_area24[0]);
        }


    String[] data_area25 = {"Lower East Side","10002", "10003", "10009" };
        
        for(int j = 1;j < data_area25.length;j++)
        {
            map.put(data_area25[j], data_area25[0]);
        }


    String[] data_area26 = {"Upper East Side","10021", "10028", "10044", "10065", "10075", "10128" };
        
        for(int j = 1;j < data_area26.length;j++)
        {
            map.put(data_area26[j], data_area26[0]);
        }


    String[] data_area27 = {"Upper West Side","10023", "10024", "10025" };
        
        for(int j = 1;j < data_area27.length;j++)
        {
            map.put(data_area27[j], data_area27[0]);
        }


    String[] data_area28 = {"Inwood and Washington Heights","10031", "10032", "10033", "10034", "10040" };
        
        for(int j = 1;j < data_area28.length;j++)
        {
            map.put(data_area28[j], data_area28[0]);
        }


    String[] data_area29 = {"Northeast Queens","11361", "11362", "11363", "11364" };
        
        for(int j = 1;j < data_area29.length;j++)
        {
            map.put(data_area29[j], data_area29[0]);
        }


    String[] data_area30 = {"North Queens","11354", "11355", "11356", "11357", "11358", "11359", "11360" };
        
        for(int j = 1;j < data_area30.length;j++)
        {
            map.put(data_area30[j], data_area30[0]);
        }


    String[] data_area31 = {"Central Queens","11365", "11366", "11367" };
        
        for(int j = 1;j < data_area31.length;j++)
        {
            map.put(data_area31[j], data_area31[0]);
        }


    String[] data_area32 = {"Jamaica","11412", "11423", "11432", "11433", "11434", "11435", "11436" };
        
        for(int j = 1;j < data_area32.length;j++)
        {
            map.put(data_area32[j], data_area32[0]);
        }


    String[] data_area33 = {"Northwest Queens","11101", "11102", "11103", "11104", "11105", "11106" };
        
        for(int j = 1;j < data_area33.length;j++)
        {
            map.put(data_area33[j], data_area33[0]);
        }


    String[] data_area34 = {"West Central Queens","11374", "11375", "11379", "11385" };
        
        for(int j = 1;j < data_area34.length;j++)
        {
            map.put(data_area34[j], data_area34[0]);
        }


    String[] data_area35 = {"Rockaways","11691", "11692", "11693", "11694", "11695", "11697" };
        
        for(int j = 1;j < data_area35.length;j++)
        {
            map.put(data_area35[j], data_area35[0]);
        }


    String[] data_area36 = {"Southeast Queens","11004", "11005", "11411", "11413", "11422", "11426", "11427", "11428", "11429" };
        
        for(int j = 1;j < data_area36.length;j++)
        {
            map.put(data_area36[j], data_area36[0]);
        }


    String[] data_area37 = {"Southwest Queens","11414", "11415", "11416", "11417", "11418", "11419", "11420", "11421" };
        
        for(int j = 1;j < data_area37.length;j++)
        {
            map.put(data_area37[j], data_area37[0]);
        }


    String[] data_area38 = {"West Queens","11368", "11369", "11370", "11372", "11373", "11377", "11378" };
        
        for(int j = 1;j < data_area38.length;j++)
        {
            map.put(data_area38[j], data_area38[0]);
        }


    String[] data_area39 = {"Port Richmond","10302", "10303", "10310" };
        
        for(int j = 1;j < data_area39.length;j++)
        {
            map.put(data_area39[j], data_area39[0]);
        }


    String[] data_area40 = {"South Shore","10306", "10307", "10308", "10309", "10312" };
        
        for(int j = 1;j < data_area40.length;j++)
        {
            map.put(data_area40[j], data_area40[0]);
        }


    String[] data_area41 = {"Stapleton and St. George","10301", "10304", "10305" };
        
        for(int j = 1;j < data_area41.length;j++)
        {
            map.put(data_area41[j], data_area41[0]);
        }


    String[] data_area42 = {"Mid-Island","10314"};
        
        for(int j = 1;j < data_area42.length;j++)
        {
            map.put(data_area42[j], data_area42[0]);
        }
		
	}
	
	String getArea(String pincode)
	{
		return map.get(pincode);
	}
}
