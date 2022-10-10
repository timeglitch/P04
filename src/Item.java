public class Item {
    String description;
    int expirationDate;

    public Item(String description, int expirationDate) {
        this.description = description;
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setDescription(String input) {
        description = input;
    }

    @Override
    public String toString() {
        return description + ": " + Integer.toString(expirationDate);
    }
    
}
