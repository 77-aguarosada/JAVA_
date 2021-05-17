
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* package gasti; */


import static java.lang.System.in;
import java.util.*;
import java.io.*;
/**
 *
 * @author windows
 */
class Student {
	int rollno;
	String title, date,work;

	// Constructor
	public Student(int rollno, String title, String date /* String work */)
	{
		this.rollno = rollno;
		this.title = title;
		this.date = date;
       /*  this.work = work; */
	}

	// Used to print student details in main()
        @Override
	public String toString()
	{
		return this.rollno + " " + this.title + " "
			+ this.date+ ""+ this.work;
	}
    }
    
    class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
        @Override
	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

   class Sortbytitle implements Comparator<Student> {
	// Used for sorting in ascending order of
	// title
        @Override
	public int compare(Student a, Student b)
	{
		return a.title.compareTo(b.title);
	}
}

class SortbyWork implements Comparator<Student> {
	// Used for sorting in ascending order of
	// title
        @Override
	public int compare(Student a, Student b)
	{
		return a.work.compareTo(b.work);
	}
}

 /* class Read{
    private Scanner x;
    
    public void OpenFILE(){
         try{
                   x = new Scanner(new File("rosada.txt"));

                }
             catch(Exception error){
                 System.out.println("could not find file");
              
             }

                                     
                                     
    }
    
    public void ReadFile(){
        String[] ad = new String[100];
         while(x.hasNext()){
           String a = x.next();
           String b = x.next();
           String c = x.next();
             String d = x.next();
           //stem.out.print(" a, b , c"+ a+" "+  b +""+c+" "+ d);
                                      }
         
         
        
         for(int i = 0 ; x.hasNext() ; i++){
             ad[i]= x.next();
              System.out.print(" a, b , c"+ad[i]);
         }
    }
    
    public void CloseFIle(){
         x.close();
    }
} */
public class Gasti {
   
        
   public static void main(String[] args) {
      // TODO code application logic here
      
      ArrayList<Student> ar = new ArrayList<>();
      /* Read ffile = new Read(); */
     
      int opcao;
      Scanner entradaa = new Scanner(System.in);
		//ar.add(new Student(111, "agua rosada", "portugal"));
		Scanner s = new Scanner(System.in);
            String[] title = new String[100];
            String[] country = new String[100];
            int[] number_rooms = new int[100];
            String[] job = new String[100];           
                        do{
       System.out.println("\tRegister of books");
        System.out.println("\n");
        System.out.println("1 -  Create new Book");
        System.out.println("2 - Show collection Unsorted");
        System.out.println("3 - Show collection Sorted by number date");
        System.out.println("4 - Show collection Sorted by author title ");
        System.out.println("5 - Show all collection ");
        System.out.println("6 - add new Book ");
        System.out.println("7 -   add job from fail in collection ");
        
        System.out.println("9 - Exit");      
       System.out.println("Option:");
        opcao = entradaa.nextInt();
        switch(opcao){
            case 1:
  
            System.out.println("You entered the method Create new Book.");
           
            
            
            
                    
                   /// String title , country;   
                    System.out.println("Vvedite nazvaniye author ....");    
                    for (int i = 1; i <= 3; i++){
                     title[i]= s.nextLine();   
                     
                    } 
                    System.out.println("\n");
                    System.out.println("Vvedite nazvaniye title ....");
                    for (int i = 1; i <= 3; i++){
                        country[i]= s.nextLine();   
                       
                    } 
                    System.out.println("\n");
                    System.out.println("Vvedite nazvaniye date....");
                    for (int i = 1; i <= 3; i++){
                        number_rooms[i]= s.nextInt();   
                       
                    } 
                    System.out.println("\n");
                   /*  System.out.println("Vvedite nazvaniya Rabota....");
                    for (int i = 1; i <= 2; i++){
                        job[i]=  s.nextLine();   
                       
                    } 
                    for (int i = 1; i <= 2; i++){
                        ar.add(new Student(number_rooms[i], title[i], country[i], job[i]));
                       
                    }  */
                  
                break;
                   
                            case 2:
                            System.out.println("You entered the method Show collection.");
                            System.out.println("Unsorted");
                            for (int i = 0; i < ar.size(); i++)
                                    System.out.println(ar.get(i));
                    
  
                                break;
                                
                            case 3:
                            Collections.sort(ar, new Sortbyroll());
                    
                            System.out.println("\nSorted by number rooms");
                            for (int i = 0; i < ar.size(); i++)
                                    System.out.println(ar.get(i));
                                break;
                                
                            case 4:
                            Collections.sort(ar, new Sortbytitle());
                    
                            System.out.println("\nSorted by title");
                            for (int i = 0; i < ar.size(); i++)
                                    System.out.println(ar.get(i));
                                break;
                                case 5:
                                System.out.println("Unsorted");
                                for (int i = 0; i < ar.size(); i++)
                                        System.out.println(ar.get(i));
                        
                                Collections.sort(ar, new Sortbyroll());
                    
                                System.out.println("\nSorted by number rooms");
                                for (int i = 0; i < ar.size(); i++)
                                        System.out.println(ar.get(i));

                                Collections.sort(ar, new Sortbytitle());
                        
                                System.out.println("\nSorted by title");
                                for (int i = 0; i < ar.size(); i++)
                                        System.out.println(ar.get(i));
                                    break;
                                    case 6:
                                    System.out.println("You entered the method Add new Book.");
                                    System.out.println("Vvedite nazvaniye author ....");    
                                    for (int i = 1; i <= 3; i++){
                                     title[i]= s.nextLine();   
                                     
                                    } 
                                    System.out.println("\n");
                                    System.out.println("Vvedite nazvaniye title ....");
                                    for (int i = 1; i <= 3; i++){
                                        country[i]= s.nextLine();   
                                       
                                    } 
                                    System.out.println("\n");
                                    System.out.println("Vvedite nazvaniye date....");
                                    for (int i = 1; i <= 3; i++){
                                        number_rooms[i]= s.nextInt();   
                                       
                                    } 
                                    for (int i = 1; i <= 3; i++){
                                        ar.add(new Student(number_rooms[i], title[i], country[i]/* , job[i] */));
                                       
                                    } 
                                  
                                    break;
                                    case 7:
                               /*   ffile.OpenFILE();
                                 ffile.ReadFile(); */
                                 
                                
                                    break;
                            default:
                                System.out.println("Invalid option.");
                            }
                        } while(opcao != 0);
                 
         
		
   
   }
}




