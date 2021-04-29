import java.util.Random;

public class Driver {


    public static void main(String[] args) {
        NearestNeighbor nn = new NearestNeighbor();
            for (int i = 0; i<nn.getTestMap().size();i++){
                nn.findPosition(nn.getTestMap().get(i), 3);
            }

    }
}
