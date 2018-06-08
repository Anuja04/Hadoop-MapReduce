package Houses;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.*;
public class HousesMapper  extends Mapper <LongWritable,Text,Text,IntWritable> {
	private static Log log = LogFactory.getLog(HousesMapper.class);

public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
try {
     
     // TODO: skip  very first record (schema line)
     
     LongWritable val= new LongWritable(0);
     
if(key==val && value.toString().contains("MSSubClass"))
     return;

     else {

     // TODO: create iterator over record assuming comma-separated fields

      StringTokenizer iterator= new StringTokenizer(value.toString(),",");

// TODO validate number of tokens in iterator 
     
// TODO if invalid, then write a message to log    

// TODO get neighborhodd

for(int i=0;i<12;i++)
     {  
        iterator.nextToken();
     }

 String Neighbourhood= iterator.nextToken();
   // TODO validate number of tokens in iterator
  // TODO if invalid, then write a message to log

if(Neighbourhood==null|| Neighbourhood=="")
 {
  log.error("its an empty value");                                            
   System.out.println("its an empty value");
 }
// TODO get price

for(int i=12;i<79;i++)
{
  iterator.nextToken();
} 

String Sprice=iterator.nextToken();

// TODO validate the price is greater than zero 
// TODO if price <= 0, then write a message to log
if(Sprice==null|| Integer.parseInt(Sprice)<0 ||Sprice=="");
                  {
                      log.error("its a empty value");
                  }

// TODO convert price to int
int Sales_Price=Integer.parseInt(Sprice);

// TODO emit key-value as (neighborhood, price) 

context.write(new Text(Neighbourhood), new IntWritable(Sales_Price));
}
} catch (Exception e){
e.printStackTrace();
}
}	
 
      
   	}


