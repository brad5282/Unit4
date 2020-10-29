
package Searching;


public class State implements Comparable {
    private String name;
    private int population;
    
    public State(String n){
        name = n;
        population = (int)(Math.random()*1000000) + 8000000;
    }

    public String toString(){
        return name + "\tpopulation: " + population;
    }
    
    public int getPopulation(){
        return population;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        State other = (State)t;
        return name.compareTo(other.getName());
    }
    
}
