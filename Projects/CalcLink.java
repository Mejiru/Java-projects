/*
Group Members:

Mohammed AlHammad
202101000

Abdulmalik Alshammari
202200093

Irfan Bin Islam
202200144

Abdulrahman Omar Al-Ali
202101414

 */
import java.util.*;
class Calculator
{
		LinkedList<Integer> FirNumber;
	      LinkedList<Integer> SecNumber;
	Calculator(String num1,String num2)
	{
		    FirNumber = new LinkedList<Integer>();  
            SecNumber = new LinkedList<Integer>();  
	    
		 // fetching each character , converting to numbers and storing in LinkedList
		 for(int i=0;i<num1.length();i++)
		 {
		     // converting Character to integer and adding to linked list
		     FirNumber.add(Character.getNumericValue(num1.charAt(i)));
		 }
      	
		 // fetching each character , converting to numbers and storing in LinkedList
		
		 for(int i=0;i<num2.length();i++)
		 {
		     SecNumber.add(Character.getNumericValue(num2.charAt(i)));
		 }
	}
	//add method for addition
    public  LinkedList<Integer> add()
    {
        // to store size of number with max digit    
        		 int  maxSize=0;
    // if FirNumber has more digit than SecNumber maxSize will store size of FirNumber
		 if(FirNumber.size()>SecNumber.size())
		    maxSize=FirNumber.size();
		 else // maxsize will store size of SecNumber
		    maxSize=SecNumber.size();
		    
		    // i for counting number of digits added
		    int i=1;
		 // to store result
		 LinkedList<Integer> answer = new LinkedList<Integer>();  
	     int carry =0;
         // loop will work till it is less than equal to maxsize
		 while(i<=maxSize)
		 {
		     int digit1,digit2;// to store digit of each number
		     if(FirNumber.size()-i >=0) // if FirNumber has digit
		        digit1=FirNumber.get(FirNumber.size()-i);// store digit in digit1
		      else // digit1 will be zero
		        digit1=0;
		        
		     if(SecNumber.size()-i >=0) // if SecNumber has digit
		        digit2=SecNumber.get(SecNumber.size()-i); // store digit in digit2
		      else
		        digit2=0;
		      // add digit1 + digit2 +  carry  
		     int ans=digit1+digit2+carry;
		     // if ans is > 10 then will store last digit in answer and carry will be 1
		     if(ans>=10)
		        {
		            ans=ans%10;
		            carry=1;
		        }
		       else
		       carry=0;
            // add ans (current digit addition)   to answer LinkedList
            answer.addFirst(ans);
            i++;
            // increase digit count means now loop will add next digit
		 }
		 if(carry==1) // after all digit finish if carry has value 1 add 1 to answer
		    answer.addFirst(carry);
		 return answer;

    }
    public  LinkedList<Integer> sub()
    {
        // to store size of number with max digit    
        		 int  maxSize=0;
    // if FirNumber has more digit than SecNumber maxSize will store size of FirNumber
		 if(FirNumber.size()>SecNumber.size())
		    maxSize=FirNumber.size();
		  else
		    maxSize=SecNumber.size();
		    // i for counting number of digits added
		    int i=1;
		 // to store result
		 LinkedList<Integer> answer = new LinkedList<Integer>();  
	     int carry =0;
         int ans=0;
	     // loop will work till it is less than equal to maxsize
		 while(i<=maxSize)
		 {
		     int digit1,digit2; // to store digit of each number

		     if(FirNumber.size()-i >=0) // if FirNumber has digit
		        digit1=FirNumber.get(FirNumber.size()-i); // store digit in digit1
		      else // digit1 will be zero
		        digit1=0;
		        
		     if(SecNumber.size()-i >=0 ) // if SecNumber has digit
 		        digit2=SecNumber.get(SecNumber.size()-i); // store digit in digit2
		      else
		        digit2=0;
		        //if FirNumber has more digit means Fir Number is larger
		       if(FirNumber.size()>SecNumber.size())
		       {
		           ans=digit1-digit2-carry; // digit1-digit2 carry for calculation
		       }
		       else // if SecNumber has more digit than FirNumber if SecNumber is larger
		       {
		           ans=digit2-digit1-carry; // digit2-digit1 carry for calculation
		       }
		       // ans is < 0  means negative
		       
		     if(ans<0)
		        {
		            ans=10-Math.abs(ans); // ans will store 10 - ans 
		            carry=1; // carry will be 1
		        }
		       else
		       carry=0;
            
            // add current digit Substraction ans to answer LinkedList 
            answer.addFirst(ans);
          	
            i++;
            // increase count
		 }
		 while(answer.get(0)==0) // if answer has extra 0 then remove it like 0000124
		 {
		     answer.removeFirst();
		 }
		 // SecNumber is larger then first digit will be negative
		 if(FirNumber.size()<SecNumber.size() || (FirNumber.size()==SecNumber.size() && FirNumber.get(0)<SecNumber.get(0) ) )
		 {
		    int a= answer.removeFirst();
		     answer.addFirst(0-a);
		 }

        return answer;
    }
    public  LinkedList<Integer> mult()
    {
		 // to store result
        LinkedList<Integer> ans1 = new LinkedList<Integer>();
        
        // for each digit of FirNumber
        for(int i=0;i<FirNumber.size();i++)
        {
            // x tgo store multiplication of each digit to SecNumber's all digit
            LinkedList<Integer> x = new LinkedList<Integer>();
            int carry=0;
            // this will add zero at end or some time we skip last place 
            for(int k=0;k<i;k++)
                x.addFirst(0);
                // for each digit of second digit
            for(int j=0;j<SecNumber.size();j++)
            {
                //multiplication of two digit
                int temp=FirNumber.get(FirNumber.size()-i-1)*SecNumber.get(SecNumber.size()-j-1) + carry;
                // digit multiplication greaterthan 10
                if(temp>10)
                {
                    carry=temp/10;  // carry digits other than last
                    temp=temp%10; // last will be store in temp
                }
                else
                carry=0;
                //add temp to x LinkedList
                x.addFirst(temp);
            }
            // at last if carry then add to x
            if(carry!=0)
            {
                x.addFirst(carry);
            }
         // add ans1 and x number // x is mulitplication of particular digit of FirNumber into whole SecNumber
            Calculator cal1= new Calculator(getString(ans1),getString(x));
			ans1=cal1.add();    
            }
            //return answer
            return ans1;
    }
   
    // getstring will concat each digit of linkedlist in string to simple representation of answer
    public static String getString( LinkedList<Integer> Result)
    {
        String txt="";
        for(int i=0;i<Result.size();i++)
        {
            // concating each digit in string
            txt=txt+Result.get(i);
        }
        // return string
        return txt;

    }
}
public class CalcLink
{
    	public static void main(String[] args) {
		//Using Scanner will take input
	     Scanner input = new Scanner(System.in);
            // LinkedList to store numbers 
			Calculator cal;
	      // LinkedList to store result
	      LinkedList<Integer> ResNumber;
	     System.out.println("\t\t\t -------------------------- ");
	     System.out.print("\t\t\t Calcultor using LinkedList \n\n ");
	     System.out.print("\t\t\t -------------------------- \n");
	    // option to store user choice repeat or not
	    char option='y';
		do
		{
		    // intializing LinkedList
	        ResNumber = new LinkedList<Integer>(); 
	        
      	 System.out.print("\n # Enter First number: ");
		 String num1=input.nextLine();  //first store whole number as string
		 System.out.print("\n # Enter Second number: ");
		 String num2=input.nextLine();   //first store whole number as string
		
		cal= new Calculator(num1,num2);
		// options for operations  
		
		System.out.print("\n\n\t Your options:\n\t Addition (+)\n\t Substraction (-) \n\t Multiplication (*)\n\t Enter your choice(+,*,-): ");
         //storing option value
         char Operation=input.nextLine().charAt(0);
         switch(Operation)
         {
             // if user enters + 
             case '+': 	// call add method with passiing both linkedlist as number
                        ResNumber =cal.add(); // store answer in Result
                        System.out.println("\n\t\t "+num1+" + "+num2+" = "+cal.getString(ResNumber)); // getString will store all elements of linkedlist as one string and return
                    break;
             // if user enters - 
             case '-': // call sub method with passiing both linkedlist as number
                       		ResNumber=cal.sub(); // store answer in Result
                        System.out.println("\n\t\t "+num1+" - "+num2+" = "+cal.getString(ResNumber));  // getString will store all elements of linkedlist as one string and return
                    break;
             case '*':             // if user enters * 
                 	ResNumber = cal.mult();	
                        System.out.println("\n\t\t "+num1+" * "+num2+" = "+cal.getString(ResNumber));
                    break;
                    // for invalid choice
            default: System.out.println("Invalid choice !! try again");

                 
            
         }
		// asking  user for nor calculation yes(y) or no 
        System.out.print("\n Do you want to calculate again ? (y/n): ");
         option=input.nextLine().charAt(0);
	}while(option=='y');
// at end print thank you msg
	System.out.println("\t\t Thank you !!");
    	}
}