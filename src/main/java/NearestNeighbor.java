import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class NearestNeighbor {

    double random = new Random().nextDouble();

    private final ArrayList<BeaconID> FingerprintMap = new ArrayList();
    private ArrayList<BeaconID> testMap = new ArrayList<>();

    public NearestNeighbor(){

        readFile();
    }


    public void readFile(){
        String splitLine = ",";
        String line = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\tfvg-pc11\\Desktop\\ubiquitous\\KNearestNeighbor\\src\\main\\2018-09-24T23-22-15-500000_9_data_wide.csv"));
            while((line = bf.readLine()) != null){
                String[] stringArr = line.split(splitLine);
                FingerprintMap.add(new BeaconID(stringArr[0],Integer.parseInt(stringArr[1]),Double.parseDouble(stringArr[2]),Double.parseDouble(stringArr[3]),
                        Double.parseDouble(stringArr[4]),Double.parseDouble(stringArr[5]),Double.parseDouble(stringArr[6]),Double.parseDouble(stringArr[7]),
                        Double.parseDouble(stringArr[8]),Double.parseDouble(stringArr[9]),Double.parseDouble(stringArr[10]),Double.parseDouble(stringArr[11]),Double.parseDouble(stringArr[12])));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\tfvg-pc11\\Desktop\\ubiquitous\\KNearestNeighbor\\src\\main\\2018-10-01T20-28-00-500000_1_data_wide.csv"));
            while((line = bf.readLine()) != null){
                String[] stringArr = line.split(splitLine);
                testMap.add(new BeaconID(stringArr[0],Integer.parseInt(stringArr[1]),Double.parseDouble(stringArr[2]),Double.parseDouble(stringArr[3]),
                        Double.parseDouble(stringArr[4]),Double.parseDouble(stringArr[5]),Double.parseDouble(stringArr[6]),Double.parseDouble(stringArr[7]),
                        Double.parseDouble(stringArr[8]),Double.parseDouble(stringArr[9]),Double.parseDouble(stringArr[10]),Double.parseDouble(stringArr[11]),Double.parseDouble(stringArr[12])));
            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public ArrayList<BeaconID> getTestMap() {
        return testMap;
    }

    public void findPosition(BeaconID beaconID, int k){

        String test = "";
        for(int i = 0; i<FingerprintMap.size();i++){
            FingerprintMap.get(i).setLenght(
                    Math.sqrt(
                    Math.pow(beaconID.getEdge1()-FingerprintMap.get(i).getEdge1(),2)+
                    Math.pow(beaconID.getEdge2()-FingerprintMap.get(i).getEdge2(),2)+
                    Math.pow(beaconID.getEdge3()-FingerprintMap.get(i).getEdge3(),2)+
                    Math.pow(beaconID.getEdge8()-FingerprintMap.get(i).getEdge8(),2)+
                    Math.pow(beaconID.getEdge9()-FingerprintMap.get(i).getEdge9(),2)+
                    Math.pow(beaconID.getEdge10()-FingerprintMap.get(i).getEdge10(),2) +
                    Math.pow(beaconID.getEdge11()-FingerprintMap.get(i).getEdge11(),2)+
                    Math.pow(beaconID.getEdge12()-FingerprintMap.get(i).getEdge12(),2)+
                    Math.pow(beaconID.getEdge13()-FingerprintMap.get(i).getEdge13(),2)));

        }


        Collections.sort(FingerprintMap,new SortBy());


        double x = 0,y = 0;

        for( int i = 0; i < k; i++){
            x = x+ FingerprintMap.get(i).getRealX();
            y = y + FingerprintMap.get(i).getRealy();
        }
        y = y/k;
        x = x/k;
        System.out.println("the guss location is x: " + x + " y: " +y);





    }



}
class SortBy implements Comparator<BeaconID> {
    @Override
    public int compare(BeaconID o1, BeaconID o2) {
       return Double.compare(o1.getLenght(),o2.getLenght());
    }
}
