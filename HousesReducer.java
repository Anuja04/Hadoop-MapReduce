package Houses;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import java.io.IOException;
import java.text.DecimalFormat;


public class HousesReducer  extends Reducer <Text,IntWritable,Text,FloatWritable> {

public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {

 // TODO: initialize min and max value		
       int min=999999;
       int max=0;
       float mean=0f;
       float sum=0f;
       float count=0f;

// TODO: loop through values to determine min, max, count, and sum 
       
    for (IntWritable value: values)
        {
          
         if(value.get()<min)
         {
           min=value.get();
          
          }
        if(value.get()>max)
          {
            max=value.get();
          }

        sum=sum+value.get();
        count++;
          
       }
   
         // TODO: calculate mean   
        mean=sum/count;

       // TODO: write (key, min) to context
       // TODO: write (key, mean) to context
       // TODO: write (key, max) to context
            
            context.write(key,new FloatWritable(min));
            context.write(key, new FloatWritable(mean));
            context.write(key, new FloatWritable(max));
            
                        
                
   	}
} 
