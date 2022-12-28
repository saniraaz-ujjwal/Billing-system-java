package project;

import java.util.Scanner;

public class ProjectA 
{
	static int i=1,totalPrice=0,count=0,choice=0;
	static String[] conName=new String[50];
	static int[] prdtValue=new int[50];
	static int[] prdtCost=new int[50];
	
	static Scanner sc=new Scanner(System.in);
	
	static void Menu()
	{
		do 
		{	
			System.out.println("--------------------------------");
			System.out.println("|         1) Fruits            |");
			System.out.println("|         2) Vegetables        |");
			System.out.println("|         3) Chocolates        |");
			System.out.println("|         4) Massala           |");
			System.out.println("|         5) Exit              |");
			System.out.println("--------------------------------");
			System.out.println("Please Choose Your Option :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Fruits();
				break;
			case 2:
				Vegetables();
				break;
			case 3:
				Chocolates();
				break;
			case 4:
				Massala();
				break;
			case 5:
				finalBill();
				break;
			default:
				System.out.println("Please Choose Valid Option!");
			}
		}
		while(choice!=5);
	}
	
	static void shoapAgain()
	{
		int choiceInput;
		System.out.println("Press 1 to continue");
		System.out.println("Press any value(0-9) for exit");
		choiceInput=sc.nextInt();
		if(choiceInput==1)
			Menu();
		else
			finalBill();
	}
	
	static void caseCheck(String s,int price)
	{
		System.out.println("How many kg you want to purchase?");
		int choice3=sc.nextInt();
		conName[i]=s;
		prdtValue[i]=choice3;
		prdtCost[i]=(price*choice3);
		count++;
		i++;
		totalPrice+=(price*choice3);
		shoapAgain();
	}
	
	static void Fruits()
	{
		System.out.println("----------------------------------");
		System.out.println("|  101) Mango------1kg---Rs.200--|");
		System.out.println("|  102) Apple------1kg---Rs.250--|");
		System.out.println("|  103) Papaya-----1kg---Rs.50---|");
		System.out.println("|  104) Orange-----1kg---Rs.70---|");
		System.out.println("|  105) Grapes-----1kg---Rs.60---|");
		System.out.println("----------------------------------");
		System.out.println("Please Choose Your Product Code :");
		int choice2=sc.nextInt();

		switch(choice2)
		{
		case 101:
			caseCheck("Mango",200);						break;	
		case 102:
			caseCheck("Apple",250);
			break;
		case 103:
			caseCheck("Papaya",50);
			break;
		case 104:
			caseCheck("Orange",70);
			break;
		case 105:
			caseCheck("Grapes",60);
			break;
		default:
			System.out.println("Please Choose Valid Product Code!");
			Fruits();
		}	
	}
	
	static void Vegetables()
	{
		System.out.println("-----------------------------------");
		System.out.println("|  201) Potato------1kg---Rs.25--|");
		System.out.println("|  202) Tomato------1kg---Rs.50--|");
		System.out.println("|  203) Onion-------1kg---Rs.30--|");
		System.out.println("|  204) Brinjal-----1kg---Rs.40--|");
		System.out.println("|  205) L.fin..-----1kg---Rs.60--|");
		System.out.println("-----------------------------------");
		System.out.println("Please Choose Your Product Code :");
		int choice2=sc.nextInt();

		switch(choice2)
		{
		case 201:
			caseCheck("Potato",25);
			break;	
		case 202:
			caseCheck("Tomato",50);
			break;
		case 203:
			caseCheck("Onion",30);
			break;
		case 204:
			caseCheck("Brinjal",60); 
			break;
		case 205:
			caseCheck("L.fin..",60);
			break;
		default:
			System.out.println("Please Choose Valid Product Code!");
			Vegetables();
		}
	}
	
	static void Chocolates()
	{
		System.out.println("---------------------------------------");
		System.out.println("|  301) Dairy Milk------1pc---Rs.250--|");
		System.out.println("|  302) Kit-Kat---------1pc---Rs.100--|");
		System.out.println("|  303) Snickers--------1pc---Rs.60---|");
		System.out.println("|  304) Milk Choco------1pc---Rs.120--|");
		System.out.println("|  305) Dark Choco------1pc---Rs.180--|");
		System.out.println("---------------------------------------");
		System.out.println("Please Choose Your Product Code :");
		int choice2=sc.nextInt();

		switch(choice2)
		{
		case 301:
			caseCheck("D.milk",250); 
			break;	
		case 302:
			caseCheck("Kit-Kat",100);
			break;
		case 303:
			caseCheck("Snick..",60);
			break;
		case 304:
			caseCheck("M.Choco",120);
			break;
		case 305:
			caseCheck("D.Choco",180);
			break;
		default:
			System.out.println("Please Choose Valid Product Code!");
			Chocolates();
		}
	}
	
	static void Massala()
	{
		System.out.println("---------------------------------------");
		System.out.println("|  401) Turmeric------1kg---Rs.120--|");
		System.out.println("|  402) Coriander-----1kg---Rs.90---|");
		System.out.println("|  403) Cumin---------1kg---Rs.110--|");
		System.out.println("|  404) Ginger--------1kg---Rs.150--|");
		System.out.println("|  405) Cloves--------1kg---Rs.100--|");
		System.out.println("---------------------------------------");
		System.out.println("Please Choose Your Product Code :");
		int choice2=sc.nextInt();

		switch(choice2)
		{
		case 401:
			caseCheck("Turme..",120);
			break;	
		case 402:
			caseCheck("Coria..",90);
			break;
		case 403:
			caseCheck("Cumin",110);
			break;
		case 404:
			caseCheck("Ginger",150);
			break;
		case 405:
			caseCheck("Cloves",100);
			break;
		default:
			System.out.println("Please Choose Valid Product Code!");
			Massala();
		}
	}
	
	static void finalBill()
	{
		if(count==0)
		{
			System.out.println("Thanks for visiting");
			System.out.println("Program Executed!!!");
		}
		else 
		{
			System.out.print("Enter Your Name :");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Enter your Address :");
			String add=sc.nextLine();
			System.out.print("Enter Your Contact: ");
			long con=sc.nextLong();
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println("------Welcome to Ujjwal's Mart store------");
			System.out.println("---------------------------------------");
			System.out.println("s.no | Qty |    Name    |\tPrice");
			System.out.println("---------------------------------------");
			
			for(int i=1;i<=count;i++)
			{
				System.out.println(" "+i+"\t"+prdtValue[i]+"\t"+conName[i]+"\t\t"+prdtCost[i]);
			}
			System.out.println("----------------------------------------");
			System.out.println("Total bill of Purchased item is : "+totalPrice);
			
			if(totalPrice>=1000)
			{
				double discountPer=(totalPrice/100)*5;
				System.out.println("You received a discount of 5% :"+discountPer);
				System.out.println("Your final bill is :"+(totalPrice-discountPer));
				System.out.println("===Thanku for Shopping You Saved "+discountPer+"===");	
			}
			else
			{
				System.out.println("You will get 5% discount if you Purchased "+(1000-totalPrice)+" more");
			}
			System.out.println("-------------------------------------------------");
			System.out.println("Name :"+name);
			System.out.println("Address :"+add);
			System.out.println("Contact :"+con);
			System.out.println("================Really Java is Awesome==================");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("-------------------------------");
		System.out.println("----Welcome to Organic store----");
		ProjectA.Menu();
	}
}
