public class Product {


    String name;
    String description;
    String ProductID;
    double cost;
    public Product(String name, String description, String ProductID, double cost) {
        this.name = name;
        this.description = description;
        this.ProductID = ProductID;
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ProductID;
    }

    public void setID(String ID) {
        this.ProductID = ID;
    }

public String getProductInfo() {
        return this.name + " , " + this.description + " , " + this.ProductID + " , " + String.valueOf(this.cost);
}
    public String toCSVProductDataRecord()
    {
        return this.name + ", " + this.description + ", " + this.ProductID + this.cost;
    }


}
