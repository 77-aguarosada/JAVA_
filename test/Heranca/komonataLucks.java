package Heranca;

public class komonataLucks  extends komonata{
    private int min;
    private int max;
    
    public komonataLucks (String id,int number,float manyPeople,int price ,int min , int max){
        super(id, number,manyPeople,price);
        this.min = min;
        this.max = max;

  
    }

    @Override
    public String toString()
    {
        return("\nКомната люкс " +"\nкомната "+ this.getId()+
               ".\nКоличество человек " +this.getManyPeople()
             //   +"\nКомфортность " + this.getconfortType()
                + "\nКод номера "+ this. getNumber()
                +"\nцена "+ this.getPrice()
                +"\nмин срок сдачи "+ min
                +"\nмах срок сдачи "+ max
                );
    }
}
