public class Item {
    String description;
    int expirationDate;

    public Item(String description, int expirationDate) throws IllegalArgumentException {
        if(expirationDate < 0) {
            throw new IllegalArgumentException("expiration date is invalid");
        }
        if(description == null || description == "") {
            throw new IllegalArgumentException("description is invalid");
        }
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
        if(description == null || description.equals("")) {
            throw new IllegalArgumentException("description is invalid");
        }
        description = input;
    }

    @Override
    public String toString() {
        return description + ": " + Integer.toString(expirationDate);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Item && other.getDescription().equals(description);
    }
}
