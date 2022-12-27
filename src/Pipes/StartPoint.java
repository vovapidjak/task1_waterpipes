package Pipes;

public class StartPoint extends Pipe {

    public String[] draw() {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = "■■■";
        }

        return str;
    }
}
