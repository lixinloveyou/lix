public class Book {
    //private String bookName;
    private double bookPrice;
    private double bookDisount;
    private int num;

    /*public void setBookName(String name){
        this.bookName = name;
    }
    public String getBookName(){
        return bookName;
    }*/

    public  void setPrice(double price){

        this.bookPrice = price;
    }
    public double getBookPricet(){
        return bookPrice;
    }

    public  void setBookDisounte(double disount){

        this.bookDisount = disount;
    }
    public double getBookDisount(){
        return bookDisount;
    }

    public void setNum(int num){
        this.num  = num;
    }
    public int getNum(){
        return  num;
    }

    public Book ( double price,double discount , int num){

        this.bookPrice = price;
        this.bookDisount = discount;
        this.num = num;


    }





}
