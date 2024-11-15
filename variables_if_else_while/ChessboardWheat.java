import java.math.BigInteger;

public class ChessboardWheat {
    public static void main(String[] args){
        BigInteger wheat = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                sum = sum.add(wheat);
                wheat = wheat.multiply(BigInteger.valueOf(2));
            }
        }
        System.out.println("Total amount of wheat: " + sum);
    }
}

