package Heranca;

/**
 * komonata
 */
public class komonata {

    private String id;
    private int number;
    private float manyPeople;
    private int price;

    public komonata( String id, int number, float manyPeople, int price){
        this.id = id;
        this.number  = number;
        this.manyPeople = manyPeople;
        this.price = price;
    }

    public String getId(){
        return id;

    }

    public int  getNumber(){
        return number;
        
    }


    public float getManyPeople(){
        return manyPeople;
        
    }
    public int getPrice(){
        return price;
        
    }

    @Override
    public String toString()
    {
        return("\nкомната "+ this.getId()+
               ".\nКоличество человек " +this.getManyPeople()
             //   +"\nКомфортность " + this.getconfortType()
                + "\nКод номера "+ this. getNumber()
                +"\nцена "+ this.getPrice());
    }
}