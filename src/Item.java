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

    
    /** 
     * getter 
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    
    /** 
     * getter 
     * @return int expiration date as int from start time
     */
    public int getExpirationDate() {
        return expirationDate;
    }

    
    /** 
     * setter 
     * @param input item description
     */
    public void setDescription(String input) {
        if(description == null || description.equals("")) {
            throw new IllegalArgumentException("description is invalid");
        }
        description = input;
    }

    
    /** 
     * return item description and name
     * @return String output
     */
    @Override
    public String toString() {
        return description + ": " + Integer.toString(expirationDate);
    }

    
    /** 
     * is same if item has same description
     * @param other vending machine
     * @return boolean is equal or not
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof Item && ((Item) other).getDescription().equals(description);
    }
}
