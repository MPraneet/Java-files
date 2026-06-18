package project_files;

public class bill_hotel {
    public static void main(String[] args) {
        //Dish and cost are in same order
        String []dish={"Sandwich","Coffee","French Fries","Salad"};
        double []cost = {6.5,3.2,4.0,3.5};
        Bill myBill = new Bill();
        //pass copies of array references corresponding to dish ,cost.
        myBill.addOrder("Sandwich",2,dish,cost);
        myBill.addOrder("Coffee",3,dish,cost);
        myBill.addOrder("French Fries",2,dish,cost);
        myBill.getOrder();
        System.out.println(myBill.getTotal());
    }
}
