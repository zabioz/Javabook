/* package chapter6;

class Person{
	String name;
	int age;
	
	Person() {
		this("no name", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person ();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}

*/

package chapter6;

class Person {
	
	String name;
	int age;
	
	
	Person() {
		this("no name",1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	Person returnItSelf(){
		return this;
	}
	
}

public class CallAnotherConst {
	public static void main(String [] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}

