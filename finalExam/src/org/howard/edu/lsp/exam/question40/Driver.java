package org.howard.edu.lsp.exam.question40;

public class Driver {

	public static void main(String[] args) {
		Animal thisAnimal1 = new Goose();
		Animal thisAnimal2 = new Tiger();

        thisAnimal1.speak();
        thisAnimal2.speak();
      

        Flying thisFlies1 = new Goose();
        Flying thisFlies2 = new Airplane();

        thisFlies1.fly();
        thisFlies2.fly();

	}

}
