package employeeApp.enums;

public enum Plan {
    BASIC(name:"BASIC", price:3000),
    MEDIUM(name:"MEDIUM",price:5000),
    ADVANCE(name:"ADVANCE",price:9000);



    private String name;
    private int price;


    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

}
