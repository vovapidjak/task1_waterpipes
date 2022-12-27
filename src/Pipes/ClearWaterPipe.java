package Pipes;

public class ClearWaterPipe extends Pipe{

    public ClearWaterPipe(int diameter) {

        this.clearwaterDiameter = diameter;

    }

    public String[] draw() {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = "---";
        }

        return str;
    }
}
