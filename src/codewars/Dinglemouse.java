package codewars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dinglemouse {

	String name;
	int age;
	char sex;

	String ageString = " I am %2$d.";
	String nameString = " My name is %1$s.";
	String sexString = " I am %3$s.";
	String resultString = "";

	public ArrayList<Object> list = new ArrayList<Object>();

	public Dinglemouse() {
	}

	public Dinglemouse setAge(int age) {
		this.age = age;
		if (!list.contains(ageString)) {
			list.add(ageString);
		}
		return this;
	}

	public Dinglemouse setSex(char sex) {
		this.sex = sex;
		if (!list.contains(sexString)) {
			list.add(sexString);
		}
		return this;
	}

	public Dinglemouse setName(String name) {
		this.name = name;
		if (!list.contains(nameString)) {
			list.add(nameString);
		}
		return this;
	}

	public String hello() {

		for (int i = 0; i < list.size(); i++) {
			resultString += list.get(i);
		}

		return String.format("Hello." + resultString, name, age, sex == 'M' ? "male" : "female");
	}


}
