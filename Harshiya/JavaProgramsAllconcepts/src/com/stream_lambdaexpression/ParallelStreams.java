package com.stream_lambdaexpression;


	
	import java.util.Arrays;
	import java.util.List;

	class Student{
		String name;
		int score;
		
		Student(String name,int score)
		{
			this.name=name;
			this.score=score;
		}
		
		public String getName()
		{
			return this.name;
		}
		public int getScore()
		{
			return this.score;
		}
	}
	public class ParallelStreams {
		public static void main(String[] args) {
			
			List<Student> studentList=Arrays.asList(
					new Student("John",50),
					new Student("smith",60),
					new Student("scott",80),
					new Student("Joseph",90),
					new Student("Jhony",70));
			//using stream-sequential 
			studentList.stream().filter(s->s.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
					
			
			//parallel stream
			studentList.parallelStream().filter(s->s.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
			

		}
		

	}



