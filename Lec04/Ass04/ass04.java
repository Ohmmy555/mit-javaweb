package Lec04.Ass04;

public class ass04 {
    ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");		
		Collections.sort(cars);
		
		for(int i = 0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
}
