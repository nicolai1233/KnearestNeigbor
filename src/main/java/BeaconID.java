public class BeaconID {


    //variables
    private String time;
    private int beaconID;
    private double realX;
    private double realy;
    private double edge1;
    private double edge2;
    private double edge3;
    private double edge8;
    private double edge9;
    private double edge10;
    private double edge11;
    private double edge12;
    private double edge13;
    private double lenght;


    public BeaconID(String time, int beaconID, double realX, double realy, double edge1, double edge2, double edge3, double edge8, double edge9, double edge10, double edge11, double edge12, double edge13) {
        this.time = time;
        this.beaconID = beaconID;
        this.realX = realX;
        this.realy = realy;
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.edge8 = edge8;
        this.edge9 = edge9;
        this.edge10 = edge10;
        this.edge11 = edge11;
        this.edge12 = edge12;
        this.edge13 = edge13;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBeaconID() {
        return beaconID;
    }

    public void setBeaconID(int beaconID) {
        this.beaconID = beaconID;
    }

    public double getRealX() {
        return realX;
    }

    public void setRealX(double realX) {
        this.realX = realX;
    }

    public double getRealy() {
        return realy;
    }

    public void setRealy(double realy) {
        this.realy = realy;
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public double getEdge8() {
        return edge8;
    }

    public void setEdge8(double edge8) {
        this.edge8 = edge8;
    }

    public double getEdge9() {
        return edge9;
    }

    public void setEdge9(double edge9) {
        this.edge9 = edge9;
    }

    public double getEdge10() {
        return edge10;
    }

    public void setEdge10(double edge10) {
        this.edge10 = edge10;
    }

    public double getEdge11() {
        return edge11;
    }

    public void setEdge11(double edge11) {
        this.edge11 = edge11;
    }

    public double getEdge12() {
        return edge12;
    }

    public void setEdge12(double edge12) {
        this.edge12 = edge12;
    }

    public double getEdge13() {
        return edge13;
    }

    public void setEdge13(double edge13) {
        this.edge13 = edge13;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getLenght(){
        return lenght;
    }

    @Override
    public String toString() {
        return "BeaconID{" +
                "realX=" + realX +
                ", realy=" + realy +
                '}';
    }
}
