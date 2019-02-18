package leetcode;

/**
 * @project q
 * @authore dgunda on 2/8/19
 */
public class BestPriceForVendor {
    public static class Vendor{
        int startDate;
        int endDate;
        int price;
        public Vendor(int start, int end, int price){
            this.startDate = start;
            this.endDate = end;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Vendor[] listOfVendors = new Vendor[4];
        Vendor a = new Vendor(1,3,10);
        Vendor b = new Vendor(2,10,5);
        Vendor c = new Vendor(4,6,20);
        Vendor d = new Vendor(10,20,15);
        listOfVendors[0] = a;
        listOfVendors[1] = b;
        listOfVendors[2] = c;
        listOfVendors[3] = d;
        System.out.println(bestPrice(30,listOfVendors));
    }

    public static int bestPrice(int date, Vendor[] vendors){
        int minPrice = Integer.MAX_VALUE;
        if (vendors.length == 0 || vendors == null){
            throw  new IllegalArgumentException();
        }
        for(Vendor v: vendors){
            if(date >= v.startDate && date <= v.endDate){
                minPrice = Math.min(minPrice, v.price);
            }
        }
        if(minPrice == Integer.MAX_VALUE){
            throw  new IllegalArgumentException("No Vendors found ");
        }
        return minPrice;
    }

}
