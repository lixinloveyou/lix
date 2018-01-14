import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Checkout {

    public static void main(String args[]){

        String input="";
        String  spliInput[];
        String  end ="";
        String temp1 ="";


        double p;
        double d;
        int n;

        Scanner scanner = new Scanner(System.in);//input: price1,discount1,num1 price2,discount2,num2 price3,discount3,num3
        System.out.println("请输入书籍信息，格式：价格1，折扣1， 数量1 价格2，折扣2，数量2 …… ");
        input= scanner.nextLine();
        spliInput  = input.split(" ");
        List<Book> list = new LinkedList<Book>();
        for (int i =0;i<spliInput.length; i++){

            temp1 = spliInput[i];
            p =Double.parseDouble(temp1.split(",")[0]);
            d =Double.parseDouble(temp1.split(",")[1]);
            n =Integer.parseInt(temp1.split(",")[2]);
            list.add(new Book(p,d,n));
        }
        System.out.print("总价是："+new CaculateTotalPrice(list).Caculate());





    }
}
