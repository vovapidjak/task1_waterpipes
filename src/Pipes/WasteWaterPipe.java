package Pipes;

public class WasteWaterPipe extends Pipe{

    public WasteWaterPipe(int diameter) {
        this.wastewaterDiameter = diameter;

    }

    public String[] draw() {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = "~~~";
        }

        return str;
    }
}
