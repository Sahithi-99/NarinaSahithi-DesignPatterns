package com.epam1.Design_Patterns;


import behavioural_patterns.*;
import structural_patterns.*;
import creational_patterns.*;
import creational_patterns.PrototypeFactory.ModelType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Testing of BEHAVIOURAL PATTERN-MEMENTO");
    	Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        System.out.println(article);
         
        ArticleMemento memento = article.createMemento();   //created immutable memento
         
        article.setContent("123");      //changed content
        System.out.println(article);
         
        article.restore(memento);       //UNDO change
        System.out.println(article);    //original content
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Testing of BEHAVIOURAL PATTERN-STRATEGY");
        Socialmediacontext sc=new Socialmediacontext();
        sc.setSocialmediaStrategy(new Facebook());
        sc.connect("swetha");
        System.out.println("===========");
        sc.setSocialmediaStrategy(new Twitter());
        sc.connect("vaishnavi");
        System.out.println("Testing of STRUCTURAL PATTERN-COMPOSITE");
     // Creating a component tree
        Composite1 component = new CompositeAccount();
 
        // Adding all accounts of a customer to component
        component.add(new DepositAccount("DA001", 100));
        component.add(new DepositAccount("DA002", 150));
        component.add(new SavingsAccount("SA001", 200));
 
        // getting composite balance for the customer
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);
         
        Accountstatement mergedStatement = component.getStatement();
        System.out.println("Merged Statement : " + mergedStatement);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Testing of CREATIONAL-PATTERN-pROTOTYPE");
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("testing CREATIONAL PATTERN-BUILDER");
        Builder user1 = new Builder.UserBuilder("Lokesh", "Gupta")
        	    .age(30)
        	    .phone("1234567")
        	    .address("Fake address 1234")
        	    .build();
        	 
        	    System.out.println(user1);
        	 
        	    Builder user2 = new Builder.UserBuilder("Jack", "Reacher")
        	    .age(40)
        	    .phone("5655")
        	    //no address
        	    .build();
        	 
        	    System.out.println(user2);
        	 
        	    Builder user3 = new Builder.UserBuilder("Super", "Man")
        	    //No age
        	    //No phone
        	    //no address
        	    .build();
        	 
        	    System.out.println(user3);
    }
}
