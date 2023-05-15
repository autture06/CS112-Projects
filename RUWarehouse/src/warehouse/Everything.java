package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
        Warehouse w = new Warehouse();

        StdIn.readInt();

        while(StdIn.hasNextLine() && !StdIn.isEmpty())
        {  
            String every = StdIn.readString();
            int day = 0;
            int id = 0;
            String name = "";
            int stock = 0;
            int demand = 0;

            if(every.equals("add"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                name = StdIn.readString();
                stock = StdIn.readInt();
                demand = StdIn.readInt();
                
                w.addProduct(id, name, stock, day, demand);
            }
            else if(every.equals("restock"))
            {
                id = StdIn.readInt();
                demand = StdIn.readInt();
                w.restockProduct(id, demand);
            }
            else if(every.equals("purchase"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                stock = StdIn.readInt();
                w.purchaseProduct(id, day, stock);
            }
            else if(every.equals("delete"))
            {
                id = StdIn.readInt();
                w.deleteProduct(id);
            }
        }
        StdOut.println(w.toString());
        
    }
}
