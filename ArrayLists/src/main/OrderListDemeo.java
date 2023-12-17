package main;
import java.util.ArrayList;
import lib.OrderLine;
public class OrderListDemeo {
public static void main(String[] args) {
   ArrayList <OrderLine>m = new ArrayList<OrderLine>();
   
   m.add(new OrderLine("milk",100,30));
   m.add(new OrderLine("meat",40,30));
   m.forEach(s->System.out.println(s.getUnitPrice()));
   
double a= m.stream().mapToInt(s->s.getUnitPrice()).average().getAsDouble();
System.out.println(a);

   }
  
}

