
import java.util.ArrayList;


 //Vitoria 
 
public class Animal {
    private String Animal;
    private String Pais;
    ArrayList<Animal> AnimalList;
    
    public Animal(){
        AnimalList = new ArrayList();
    }
    
    public Animal(String Animal,String Pais){
        this.Animal = Animal;
        this.Pais = Pais;
        AnimalList = new ArrayList();
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public ArrayList<Animal> getAnimalList() {
        return AnimalList;
    }

    public void setAnimalList(ArrayList<Animal> AnimalList) {
        this.AnimalList = AnimalList;
    }
    
    public void addAnimal(Animal A){
        AnimalList.add(A);
    }
}


