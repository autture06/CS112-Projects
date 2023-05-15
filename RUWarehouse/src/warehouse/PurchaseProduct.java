package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test purchaseProduct

        Warehouse w = new Warehouse();

        StdIn.readInt();

        while(StdIn.hasNextLine() && !StdIn.isEmpty())
        {  
            String aOp = StdIn.readString();
            int day = 0;
            int id = 0;
            String name = "";
            int stock = 0;
            int demand = 0;

            if(aOp.equals("add"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                name = StdIn.readString();
                stock = StdIn.readInt();
                demand = StdIn.readInt();
                
                w.addProduct(id, name, stock, day, demand);
            }
            else if(aOp.equals("purchase"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                stock = StdIn.readInt();
                w.purchaseProduct(id, day, stock);
            }
        }
        StdOut.println(w.toString());
    }
}
