package Enron;

import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EnronPartitioner<K, V> extends Partitioner<K, V>
{
    private int m=22;
    private int firstLetterValue=0;
    
    public int getPartition(K key, V value, int numReduceTasks) {
        // TODO override getPartition(K, V, int) method
        String DomainValue = key.toString();
        
        char m = 'm';
        char a = 'a';
        char n = 'n';
        char z = 'z';
        int mi = (int)m;
        int ni = (int)n;
        int ai = (int)a;
        int returnval=0;
        char firstcharInt = DomainValue.charAt(0);
        
        int zi = (int)z;
        
        if(numReduceTasks>=0&&numReduceTasks<3)
        {
            if(firstcharInt >= ai && firstcharInt <= mi)
            {
                returnval =0;
            }
            
            else if(firstcharInt >= ni && firstcharInt <= zi)
            {
                
                returnval=1;
            }
        }
        else
            
        {
            returnval = -1;
        }
        
        return returnval;
        
        
        
        
    }
    
    
}

