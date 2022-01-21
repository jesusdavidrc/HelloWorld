package com.company.others;

public class EjercicioOne {
    private int [] wall = {3, 4, 2, 4, 2};

    public static void main(String[] args) {

        EjercicioOne ej1 = new EjercicioOne();

        System.out.println(ej1.blocksAmount());

        int blockAmount = ej1.blocksAmount();
        int avg = ej1.getAvg(blockAmount);

        System.out.println(avg);
        System.out.println(ej1.wallSize(avg));
    }

    public int blocksAmount() {
        int blockAmount = 0;
        for (int i = 0; i < wall.length; i++){
            blockAmount += wall[i];
        }
        return blockAmount;
    }

    public int getAvg(int blockAmount) {
        return blockAmount / wall.length;
    }

    public int wallSize(int blockAvg) {
        int blocksToMove = 0;
        for (int i = 0 ; i < wall.length; i++) {
            if (wall[i] > blockAvg) {
                blocksToMove = blocksToMove + (wall[i] - blockAvg);
            }
        }
        return blocksToMove;
    }
}
