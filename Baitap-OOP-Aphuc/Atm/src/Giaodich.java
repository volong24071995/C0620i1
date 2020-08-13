public class Giaodich {
    private String tengiaodich;
    private double sotiengiaodich;
    Giaodich(){};
    Giaodich(String tengiaodich,double sotiengiaodich){
        this.tengiaodich=tengiaodich;
        this.sotiengiaodich=sotiengiaodich;
    }

    public String getTengiaodich() {
        return tengiaodich;
    }

    public double getSotiengiaodich() {
        return sotiengiaodich;
    }

    public Giaodich[] getHistory(Giaodich[] giaodiches, Giaodich newgiaodich){
        if(giaodiches[giaodiches.length-1]!=null){
            for (int i=0;i<giaodiches.length-1;i++){
                giaodiches[i]=giaodiches[i+1];
            }
            giaodiches[giaodiches.length-1]=newgiaodich;
        }else {
            for (int i=0;i<giaodiches.length;i++){
                if (giaodiches[i]==null){
                    giaodiches[i]=newgiaodich;
                    break;
                }
            }
        }
        return giaodiches;
    }
}
