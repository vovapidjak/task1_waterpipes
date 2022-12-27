package Pipes;

public class Bath extends Pipe{

    public Bath(int entry, int out) {

        this.clearwaterDiameter = entry;
        this.wastewaterDiameter = out;
    }

    public String[] draw() {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = "BBB";
        }

        return str;
    }


}
