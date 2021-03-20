package Heranca;

public class KomonataPolu extends komonata {
  
    public KomonataPolu (String id,int number,float manyPeople,int price){
         super(id, number,manyPeople,price);

   }
   @Override
   public String toString()
   {
       return("\nКомната полулюкс " +"\nкомната "+ this.getId()+
              ".\nКоличество человек " +this.getManyPeople()
            //   +"\nКомфортность " + this.getconfortType()
               + "\nКод номера "+ this. getNumber()
               +"\nцена "+ this.getPrice()
              
               );
   }
}
