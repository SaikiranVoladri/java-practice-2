public class operaters {
    public static void main(String[] args) {
        boolean a =true;
       if(a){
        System.out.println("-");
       }
       {
        int i = 4;   //line 1
        String str = (i<3)?"sunday":(i<5)?"monday":"friday";   //line 2
        System.out.println(str);   // line 3
    }

    {
		System.out.println(10.0/0); 
		System.out.println(0.0/0); 	
                System.out.println(0.0/10); 
		System.out.println(-10.0/0); 
    }

        // String a="sai";
      
        // int aa= 100;
        // int  b= 200;
        // double d= 12345678.1234567;
        // String aaa= "asd";
        // System.out.println(a+aa+d+b+aaa);
        // System.out.println(a);
        // a= a+aa;
        
        // System.out.println(a);
        


        // int a=1;
        // byte b=10;
        // short s= 1;
        // short aa= Short.MAX_VALUE;
        // System.out.println(aa);

        // long var= (a+b+s)*1000;
        // short v= (short)((a+b+s)*1000);
        // System.out.println(v);
        // float petrol_quantity, diesel_quantity;
        // Double petrol_quantity1, diesel_quantity1;
        // float petrol_prices = 74.91f;
        // float diesel_prices = 84.11f;
        // float wallet_balance = 1546.12f;
        // petrol_quantity = wallet_balance / petrol_prices;
        // diesel_quantity = wallet_balance / diesel_prices;
        // Double petrol_prices1 = 74.91;
        // Double diesel_prices1 = 84.11;
        // Double wallet_balance1 = 1546.12;
        // petrol_quantity1 = wallet_balance1 / petrol_prices1;
        // diesel_quantity1 = wallet_balance1 / diesel_prices1;

        // System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + petrol_quantity);
        // System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + diesel_quantity);
        // System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + petrol_quantity1);
        // System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + diesel_quantity1);

        // int maxval= Integer.MAX_VALUE;
        // int minval= Integer.MIN_VALUE;


        // int a= Byte.MAX_VALUE;
        // int b= Byte.MIN_VALUE;
        
        // System.out.println(maxval +" "+ minval);
        // System.out.println(maxval+1 +" "+ minval+1);

        // System.out.println(a+" "+ b);

        // char a='\u013F';
        // System.out.println(a);


    }
}
