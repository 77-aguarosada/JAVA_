package Heranca;

public class exem {
    int id;
    String CodeNumbers;
    int numberPeople;
    String confortType;
    int price;
 
    // Constructor Declaration of Class

    /**
     */
    public exem (int id, String CodeNumbers,
                    int numberPeople, String confortType,int price)
    {
        this.id = id;
        this.CodeNumbers = CodeNumbers;
        this.numberPeople = numberPeople;
        this.confortType =confortType;
        this.price = price;
    }
 
    // method 1
    public int getId()
    {
        return id;
    }
 
    // method 2
    public String getCodeNumbers()
    {
        return CodeNumbers;
    }
 
    // method 3
    public int getnumberPeople()
    {
        return numberPeople;
    }
 
    // method 4
    public String getconfortType()
    {
        return confortType;
    }
     public int getprice() {
        return price;
    }
             
    @Override
    public String toString()
    {
        return("\nкомната "+ this.getId()+
               ".\nКоличество человек " +this.getnumberPeople()
                +"\nКомфортность " + this.getconfortType()
                + "\nКод номера "+ this. getCodeNumbers()
                +"\nцена "+ this.getprice());
    }
    
   ;
    public static void main(String[] args)        
    {
      
        
        exem  tuffy = new exem(2,"A5D",3,"DA",55);
        System.out.println(tuffy.toString());
    }
  


}
