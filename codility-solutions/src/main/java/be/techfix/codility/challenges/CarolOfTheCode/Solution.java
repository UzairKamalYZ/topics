package be.techfix.codility.challenges.CarolOfTheCode;

import java.util.Arrays;

public class Solution {

    public int solution(String[] input) {

        return findTurnToGetPrettyPattern(input);
    }


    private int findTurnToGetPrettyPattern(String[] tiles){
        int numberOfTurns = 0;
        for(int i=tiles.length-1; i>0; i--){
            String currentTile = tiles[i];
            String adjacentTile = tiles[i-1];
            if(isNotAPrettyTile(currentTile,adjacentTile)){
                int turnsForAdjacentTile = turnsForAdjacentTile(currentTile, adjacentTile);
                int turnsForCurrentTile =  turnsForCurrentTile(currentTile,adjacentTile);

                if(turnsForAdjacentTile < turnsForCurrentTile){
                    String tile = turnAdjacent(currentTile, adjacentTile);
                    tiles[i-1] = tile;
                    numberOfTurns += turnsForAdjacentTile;
                }else{
                    String tile = turnCurrentTile(currentTile, adjacentTile);
                    tiles[i] = tile;
                    numberOfTurns += turnsForCurrentTile;
                }

            }
        }
        Arrays.stream(tiles).forEach(System.out::println);
        return numberOfTurns;
    }

    private String turnCurrentTile(String tile1, String tile2) {
        char side = tile2.charAt(1);
        int indexOfCurrentTile = tile1.indexOf(side);
        int clockWiseTurnsRequired = 3 - indexOfCurrentTile;
        int antiClockWiseWiseTurnRequired = 1 + indexOfCurrentTile;

        if(antiClockWiseWiseTurnRequired < clockWiseTurnsRequired){
            return String.valueOf(rotateAntiClockWiseForTurns(tile1.toCharArray(),antiClockWiseWiseTurnRequired));
        }
        return String.valueOf(rotateClockWiseForTurns(tile1.toCharArray(),clockWiseTurnsRequired));
    }

    private String turnAdjacent(String tile1, String tile2) {
        char side = tile1.charAt(3);
        int indexOfAdjacentSide = tile2.indexOf(side);
        int clockWiseTurnsRequired = 0;
        int antiClockWiseWiseTurnRequired = 0;
        if(indexOfAdjacentSide > 2){
            clockWiseTurnsRequired = 2;
            antiClockWiseWiseTurnRequired = 2;
        }else {
            clockWiseTurnsRequired = indexOfAdjacentSide + 1;
            if(indexOfAdjacentSide == 0){
                antiClockWiseWiseTurnRequired = 3;
            }else{
                antiClockWiseWiseTurnRequired = 1;
            }
        }

        if(antiClockWiseWiseTurnRequired < clockWiseTurnsRequired){
           return String.valueOf(rotateAntiClockWiseForTurns(tile2.toCharArray(),antiClockWiseWiseTurnRequired));
        }
        return String.valueOf(rotateClockWiseForTurns(tile2.toCharArray(),clockWiseTurnsRequired));

    }

    private int turnsForCurrentTile(String tile1, String tile2) {
        char side = tile2.charAt(1);
        int indexOfCurrentTile = tile1.indexOf(side);
        int clockWiseTurnsRequired = 3 - indexOfCurrentTile;
        int antiClockWiseWiseTurnRequired = 1 + indexOfCurrentTile;
        return Math.min(clockWiseTurnsRequired, antiClockWiseWiseTurnRequired);
    }

    private int turnsForAdjacentTile(String tile1, String tile2) {
        char side = tile1.charAt(3);
        int indexOfAdjacentSide = tile2.indexOf(side);
        int clockWiseTurnsRequired = 0;
        int antiClockWiseWiseTurnRequired = 0;
       if(indexOfAdjacentSide > 2){
           clockWiseTurnsRequired = 2;
           antiClockWiseWiseTurnRequired = 2;
       }else {
           clockWiseTurnsRequired = indexOfAdjacentSide + 1;
           if(indexOfAdjacentSide == 0){
               antiClockWiseWiseTurnRequired = 3;
           }else{
               antiClockWiseWiseTurnRequired = 1;
           }
       }
        return Math.min(clockWiseTurnsRequired, antiClockWiseWiseTurnRequired);
    }

    private boolean isNotAPrettyTile(String currentTile, String adjacentTile) {
       return currentTile.charAt(1) != adjacentTile.charAt(3);
    }


    public char[] rotateAntiClockWiseForTurns(char[] array, int turns) {
        for (int i = 0; i < turns; i++)
        {
            array = rotateAntiCWArrayByOne(array);
        }
        return array;
    }

    public char[] rotateAntiCWArrayByOne(char[] array) {
        char temp;
        int i;
        temp = array[0];
        for (i = 0; i < array.length - 1; i++)
        {
            array[i] = array[i + 1];
        }
        array[i] = temp;
        return array;
    }

    public char[] rotateClockWiseForTurns(char[] array, int d)
    {
        for (int i = 0; i < d; i++)
        {
           array =  rotateClockWise(array, array.length);
        }
        return array;
    }
    public char[] rotateClockWise(char[] array, int n)
    {
        char temp;
        int i;
        temp = array[n - 1];
        for (i = n-1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }
}
