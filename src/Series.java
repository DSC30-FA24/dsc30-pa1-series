public class Series {
    
    /** Row names of the series. */
    private String[] rowNames;

    /** The integer array that contains the list of data that constitutes a Series object. */
    private int[] data;

    /**
     * Constructs a new Series object.
     *
     * @param _rowNames an array of row names
     * @param _data an array of int data
     */
    public Series(String[] _rowNames, int[] _data) {
        // TODO
    }

    /**
     * Method: toString
     * Returns a string representation of the Series object.
     */
    public String toString() {
         // TODO
         // Implementation goes here
         return "";
    }

    /**
     * Method: getLength
     * Returns the length of the series object.
     */
    public int getLength() {
         // TODO
         // Implementation goes here
         return 0;
    }

    /**
     * Method: getRowNames
     * Returns the row names of this Series object.
     */
    public String[] getRowNames() {
         // TODO
         // Implementation goes here
         return new String[0];
    }

    /**
     * Method: getData
     * Returns the data of this Series object as strings.
     */
    public String[] getData() {
         // TODO
         // Implementation goes here
         return new String[0];
    }

    /**
     * Method: append
     * Adds a new pair of rowName and data at the end of the Series object.
     *
     * @param rn the row name to be added
     * @param d the data value to be added
     */
    public void append(String rn, int d) {
         // TODO
    }

    /**
     * Method: loc (single)
     * Retrieves a data value given a row name.
     *
     * @param rn the row name to search for
     */
    public int loc(String rn) {
         // TODO
         // Implementation goes here
         return 0;
    }

    /**
     * Method: loc (multiple)
     * Retrieves multiple data values given an array of row names.
     *
     * @param rn an array of row names to search for
     */
    public int[] loc(String[] rn) {
         // TODO
         // Implementation goes here
         return new int[0];
    }

    /**
     * Method: iloc
     * Retrieves a data value based on its integer index.
     *
     * @param ind the index of the data to retrieve
     */
    public int iloc(int ind) {
         // TODO
         // Implementation goes here
         return 0;
    }

    /**
     * Method: drop
     * Removes a pair of rowname-data from the Series, given a row name.
     *
     * @param rn the row name of the pair to be removed
     */
    public boolean drop(String rn) {
         // TODO
         // Implementation goes here
         return false;
    }
}