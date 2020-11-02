package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Girelecek kişi sayısı
        int n = in.nextInt();
        Map<String,Integer> phoneMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            //isim giriliyor
            String name = in.next();
            //numara girliyor
            int phone = in.nextInt();
            // Write code here
            
            phoneMap.put(name, phone);

            
        }
        while(in.hasNext()){

            String s = in.nextLine();
            if(phoneMap.containsKey(s)){
                System.out.println(phoneMap.get(s));

            }
            else if (!phoneMap.containsKey(s)){
                System.out.println("Not Found");

            }
            else{
                break;
            }
            // Write code here
        }
        in.close();
    }

   
        

        
    }
    

