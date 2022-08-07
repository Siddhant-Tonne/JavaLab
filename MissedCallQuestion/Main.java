import java.util.*;

public class Main{
    static LinkedList<helper> missedCalls = new LinkedList<>();
    static Map<Long,String> contacts = new HashMap<>();

    Main(){
        contacts.put(84738783l,"person1");
        contacts.put(54387843l,"person2");
        contacts.put(34235344l,"person3");
        contacts.put(63542455l,"person4");
        contacts.put(14545334l,"person5");
        contacts.put(65245453l,"person6");
    }




    public static void main(String args[]){
           new Main();
         Scanner sc = new Scanner(System.in);
        System.out.println("Adding missed calls");
        while(true){
            System.out.println("Enter phone number");
            long number = sc.nextLong();
            String name = "private Caller";
            if(contacts.containsKey(number)){
                name = contacts.get(number);
            }
            missedCalls.add(new helper(name,number));

            if(missedCalls.size() > 10)
                missedCalls.removeLast();

            System.out.println("Enter 0 to exit");
            int x = sc.nextInt();
            if( x == 0)
                break;
            sc.nextLine();
                    
        }

        tester();

    }

    public static void tester(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Missed Call button pressed!!");

        int choice = 0;
       Iterator<helper> i = missedCalls.iterator();
        while(true){

            System.out.println("Enter 1 to go to next missed call\n 2)2) To delete a missed call\n 3)To displayall calls\n 4)To exit\n");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    if(i.hasNext())
                        System.out.println(i.next());
                    else{
                        System.out.println("End of the list reached!!");
                        System.exit(0);
                    }

                    break;

                case 2:
                    i.remove();
                    break;

                case 3:
                    System.out.println(missedCalls);
                    break;

                case 4: 
                    System.exit(0);
                    break;
            }
            

        }
    }
}