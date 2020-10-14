public class Notebook {
    int weight;
    int price;
    int yearMake;
    public Notebook(int weight, int price, int yearMake){
        this.weight = weight;
        this.price = price;
        this.yearMake = yearMake;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        }
        else if(this.price >= 600 && this.price <= 1000 ){System.out.println("The price is good");
    }
        else {System.out.println("This notebook is expensive");
}}
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("low weight");
        }
        else if (this.weight >=1000 && this.weight <= 2000) {
            System.out.println("not too heavy");
        }
        else {System.out.println("goddamn heavy is this thing");

}
}
public void checkYearAndPrice(){
        if (this.price < 600 && this.yearMake < 2007 ) {
            System.out.println("Very Old but cheap - this may be an investment in legacy hardware !");
        }
        else if (this.price >= 600 && this.price < 1000 && this.yearMake >=2007 && this.yearMake < 2015) {
            System.out.println("cheap but way too old for this price - don't buy this under no circumstances ! ");
        }
        else if (this.price >= 1000 && this.price < 1500 && this.yearMake >= 2015 && this.yearMake < 2019) {
            System.out.println("reasonably cheap and not too old - may be a good choice !");
        }
        else if (this.price < 1500 && this.yearMake < 2019) {
            System.out.println("bargain !! buy before others see this");
        }
        else if (this.price >= 1500 && this.yearMake >= 2019) {
            System.out.println(" this is standard price for this make year");
        }
        else {
            System.out.println("what is this ?");
        }

}
}