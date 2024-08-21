public class House {
    private int numStories;
    private int numWindos;
    private String color;

    public House(){
        numStories = 1;
        numWindos = 4;
        color = "black";
    }

    public House(int numStories, int numWindos, String color){
        this.numStories = numStories;
        this.numWindos = numWindos;
        this.color = color;
    }

    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories){
        this.numStories = numStories;

    }

    public int getNumWindos(){
        return numWindos;
    }

    public void setNumWindos(int numWindos){
        this.numWindos = numWindos;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}//end house
