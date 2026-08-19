package solo;

public class ComMain {
    public static void main(String[] args) {

        Computer[] com = new Computer[5];
        for (int i = 0; i < com.length; i++) {
            com[i] = new Computer();
        }
        com[0].setCpu("e3 1220");
        com[0].setGpu("gt520");
        com[0].setRam("16gb");
        com[0].setSsd("256gb");

        com[1].setCpu("4415u");
        com[1].setGpu("gt520");
        com[1].setRam("16gb");
        com[1].setSsd("256gb");

        com[2].setCpu("5200u");
        com[2].setGpu("gt520");
        com[2].setRam("16gb");
        com[2].setSsd("256gb");

        com[3].setCpu("11320");
        com[3].setGpu("gt520");
        com[3].setRam("16gb");
        com[3].setSsd("256gb");

        com[4].setCpu("1220");
        com[4].setGpu("gt520");
        com[4].setRam("16gb");
        com[4].setSsd("256gb");

        com[0].setCpu("1220");
        com[0].setGpu("gt520");
        com[0].setRam("16gb");
        com[0].setSsd("256gb");

        for (int i = 0; i < com.length; i++) {
            System.out.printf("%s %s %s %s\t\n", com[i].getCpu(), com[i].getGpu(), com[i].getRam(),com[i].getSsd()  );
        }



    }
}
