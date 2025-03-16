package Lec49;
import java.util.*;

 
    //CASE1
//   public class Genrics_Demo <T> {    //  <T>    ye likhne se class Generic bn gyi // yha T ke bdle A ya fir kuch b likh skte h
//  
//	   T x;  // Genrics_Client class me CASE1 me kisi ek line ko uncomment krne pr "T" automatically String ya Integer me convert ho jaega


    //CASE2
  public class Genrics_Demo <T,P> {  // eg:- "T" is for Integer  && "P" is for String   see in generics client class me Integer,String me convert kiya h  

	   T x;    //"T" is for Integer see in Genrics_Client class
	   P y;    //"P" is for String  see in Genrics_Client class
	
}

