package accessingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapMethod {
	public static void main(String[] args)
    {
 
        ArrayList<Integer> marks = new ArrayList<Integer>();
 
       
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
 
        // Printing the marks of the students before grace
        System.out.println(
            "Marks of students before grace : " + marks);
 
        
        List<Integer> updatedMarks
            = marks.stream()
                  .map(i -> i + 10)
                  .collect(Collectors.toList());
 
        // Printing the marks of the students after grace
        System.out.println(
            "Marks of students  after grace : " + updatedMarks);
    }

}
