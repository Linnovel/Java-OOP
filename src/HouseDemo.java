public class HouseDemo {
    public static void main(String[] args){
    House myHouse = new House();
    House yourHouse = new House(3 , 10, "blue");

    myHouse.setNumStories(2);
    myHouse.setNumWindos(6);
    myHouse.setColor("red");


//    yourHouse.setNumStories(3);
//    yourHouse.setNumWindos(4);
//    yourHouse.setColor("orange ");


    System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories" + myHouse.getNumStories() + " ventanas ");
        System.out.println("Your house is  " + yourHouse.getColor() + " and has " + yourHouse.getNumStories() + " stories" + yourHouse.getNumStories() + " and ventanas ");
    }//main end
}
