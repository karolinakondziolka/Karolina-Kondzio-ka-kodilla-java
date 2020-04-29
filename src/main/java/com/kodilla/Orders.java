import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Order
{
    int orderNo;
    LocalDate dateOfOrder;

    public Order(int orderNo, int year, int month, int day)
    {
        this.orderNo = orderNo;
        this.dateOfOrder = (LocalDate.of(year, month, day));
    }

    public int hashCode()
    {
        return ((dateOfOrder.getMonthValue() * 100 + dateOfOrder.getDayOfMonth() ))* 100000 + orderNo;
    }


    public boolean equals(Object o)
    {
        Order or = (Order) o;
        if (or.getOrderNo() == orderNo)
        {
            return true;
        }else{
            return false;
        }
    }

    public int getOrderNo()
    {
        return orderNo;
    }

    public LocalDate getDateOfOrder()
    {
        return dateOfOrder;
    }


}
class Kodilla
{
    public static void main (String[] args)
    {
        Order orderNo1 = new Order(01, 2020, 04, 21);
        Order orderNo2 = new Order(02, 2020, 04, 21);
        Order orderNo3 = new Order(03, 2020, 04, 21);
        Order orderNo4 = new Order(01, 2020, 04, 21);
        Order orderNo5 = new Order(03, 2020, 04, 21);


        HashSet<Order> ordersSet = new HashSet<Order>();
        ordersSet.add(orderNo1);
        ordersSet.add(orderNo2);
        ordersSet.add(orderNo3);
        ordersSet.add(orderNo4);
        ordersSet.add(orderNo5);

        for(Order theOrderNo: ordersSet)
        {
            System.out.println("Order: " + theOrderNo.hashCode());
        }

    }
}