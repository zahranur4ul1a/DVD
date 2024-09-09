public class DVD extends product{
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        length = 0;
        rating = "";
        studio = "";
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print(){
        super.print();
        System.out.println("length:\t" +length);
        System.out.println("Rating:\t" +rating);
        System.out.println("studio:\t" +studio);
    }

   
}
