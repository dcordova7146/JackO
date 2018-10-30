public class JackOlantern {
    private String[][]facefeatures;

    public JackOlantern(String[][]facefeatures){
        this.facefeatures = facefeatures;
    }

    public String toString(){
        String outputs = "";
        for(int i = 0;i<facefeatures.length;i++){
            for(int j = 0;j<facefeatures[i].length;i++){
                outputs += facefeatures[i][j];
            }
            outputs += "\n";
        }
        return outputs;
    }

    public void fill(String letter){
        for(int i = 0;i<this.facefeatures.length;i++){
            for(int j = 0;j<this.facefeatures[i].length;j++){
                this.facefeatures[i][j] = letter;
            }
        }
    }
    public void carve(String str,int row,int column){
        this.facefeatures[row][column] = str;
    }
}
