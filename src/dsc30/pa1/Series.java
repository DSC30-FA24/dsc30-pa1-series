package dsc30.pa1;

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
    }

    /**
     * Method: getLength
     * Returns the length of the series object.
     */
    public int getLength() {
         // TODO
    }

    /**
     * Method: getRowNames
     * Returns the row names of this Series object.
     */
    public String[] getRowNames() {
         // TODO
    }

    /**
     * Method: getData
     * Returns the data of this Series object as strings.
     */
    public String[] getData() {
        // TODO
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
    }

    /**
     * Method: loc (multiple)
     * Retrieves multiple data values given an array of row names.
     *
     * @param rn an array of row names to search for
     */
    public int[] loc(String[] rn) {
        // TODO
    }

    /**
     * Method: iloc
     * Retrieves a data value based on its integer index.
     *
     * @param ind the index of the data to retrieve
     */
    public int iloc(int ind) {
         // TODO
    }

    /**
     * Method: drop
     * Removes a pair of rowname-data from the Series, given a row name.
     *
     * @param rn the row name of the pair to be removed
     */
    public boolean drop(String rn) {
         // TODO
    }
}