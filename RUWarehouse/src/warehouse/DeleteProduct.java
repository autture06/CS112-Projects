package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test deleteProduct

        Warehouse w = new Warehouse();

        StdIn.readInt();

        while(StdIn.hasNextLine() && !StdIn.isEmpty())
        {  
            String aOd = StdIn.readString();
            int day = 0;
            int id = 0;
            String name = "";
            int stock = 0;
            int demand = 0;

            if(aOd.equals("add"))
            {
                day = StdIn.readInt();
                id = StdIn.readInt();
                name = StdIn.readString();
                stock = StdIn.readInt();
                demand = StdIn.readInt();
                
                w.addProduct(id, name, stock, day, demand);
            }
            else if(aOd.equals("delete"))
            {
                id = StdIn.readInt();
                w.deleteProduct(id);
            }
        }
        StdOut.println(w.toString());
    }
}
