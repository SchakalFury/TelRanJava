public class House {
    private int length;
    private int width;
    int hight;
    String owner;
    private String address;

    public House(int hight){
        this.hight = hight;
    }

    public House(int hight, String owner){
        this.hight = hight;
        this.owner = owner;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
