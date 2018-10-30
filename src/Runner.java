public abstract class Runner {
    public static void main(String[] args){
        String facefeatures[][] = new String[5][5];
        JackOlantern pumpkin = new JackOlantern(facefeatures);
        pumpkin.fill("x");
        pumpkin.carve("o",2,2);
        pumpkin.carve("o",2,4);
        System.out.println(pumpkin.toString());
    }

}
