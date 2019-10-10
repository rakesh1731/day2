package pack.task1;

public class ConstructorProg1{
	 public  ConstructorProg1() {
		    this("JAVA");
		    System.out.println("Default const...");
		  }

		  public  ConstructorProg1(int id) {
		    this(3456.5678f);
		    System.out.println(id);
		  }

		  public  ConstructorProg1(String name) {
		    this(12);
		    System.out.println(name);
		  }

		  public  ConstructorProg1(float sal) {
		    System.out.println(sal);
		  }

		  public static void main(String[] args) {
			  ConstructorProg1 a = new  ConstructorProg1();
		  }

		}


