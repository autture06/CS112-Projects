package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Uset his file to test restock

        Warehouse w = new Warehouse();

        StdIn.readInt();

        while(StdIn.hasNextLine() && !StdIn.isEmpty())
        {  
            String aOr = StdIn.readString();
            int day = 0;
            int id = 0;
            String name = "";
            int stock = 0;
            int demand = 0;

            if(aOr.equals("add"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                name = StdIn.readString();
                stock = StdIn.readInt();
                demand = StdIn.readInt();
                
                w.addProduct(id, name, stock, day, demand);
            }
            else if(aOr.equals("restock"))
            {
                id = StdIn.readInt();
                demand = StdIn.readInt();
                w.restockProduct(id, demand);
            }
        }
        StdOut.println(w.toString());
    }
}
