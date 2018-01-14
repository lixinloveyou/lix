import  java.util.LinkedList;
import java.util.List;

public class CaculateTotalPrice {


    public List<Book>  books ;

    public double totalPrice;

    public CaculateTotalPrice(List<Book> books){

       this.books  = books;

    }

    public  double Caculate(){

       for ( int i =0 ;i<books.size();i++){

          totalPrice += books.get(i).getBookPricet()* books.get(i).getNum()* books.get(i).getBookDisount();

       }
       return totalPrice;

    }

}
