
package InsertRemove;


public class Person implements Comparable {
    private String name;
    private int age;
    private String gender;
    
    Person(String n, String g, int i){
        name = n;
        gender = g;
        age = i;
    }

    Person(String n) {
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    

    @Override
    public int compareTo(Object t) {
        String other = ((Person)t).getName();
        return name.compareTo(other);
        
    }
    
}
