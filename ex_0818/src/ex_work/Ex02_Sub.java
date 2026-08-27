package ex_work;

public class Ex02_Sub {

    public void findActor(String[][] actor, String name, int cnt) {

        for (int i = 0; i < actor.length; i++) {
            if (actor[i][0].equals("[" + name + "]")) {
                for (int j = 0; j < actor[i].length; j++) {
                    System.out.println(actor[i][j]);
                }

            } else {
                cnt++;
                if (cnt == actor.length) {
                    System.out.println("해당 배우의 정보가 없습니다");
                }
            }
        }
    }// findActor
}
