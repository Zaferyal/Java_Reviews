package bootcamp;

class Item{

    private String name;
    private double price;

    public String getName(){
        if (name == null || name.equalsIgnoreCase("unknown")){
            throw new RuntimeException("Invalid name: "+name);
        }
        return name;
    }

    public void setName(String name){
        if(name.trim().isEmpty()){
            throw new RuntimeException("Name can not be empty or blank");
        }
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


public class Encapsulation {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setName(null);
        item1.setPrice(1);

        System.out.println(item1.getName());




    }

}
