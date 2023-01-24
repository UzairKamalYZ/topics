package be.techfix.problem.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {

    public int solution(String[] input) {

        List<String> inputTile = Arrays.asList(input);

        findTheTotalTurnToMakeTilesPretty(input);

        return inputTile.size();
    }

    public int findTheTotalTurnToMakeTilesPretty(String[] tiles) {
        int turns = 0;
        int index = 0;
        for (String tile : tiles) {
            int indexOfNextTile = index + 1;
            if ((indexOfNextTile) <= tiles.length - 1) {
                String adjacentTile = tiles[indexOfNextTile];
                int turnAntiClockWise = numberOfAntiClockWiseTurnRequiredToGetSidesWithSameColor(tile, adjacentTile);
                int turnsClockWise = numberOfClockWiseTurnRequiredToGetSidesWithSameColor(tile, adjacentTile);
                if (turnAntiClockWise < turnsClockWise) {
                    turns = turns + turnAntiClockWise;
                    tiles[indexOfNextTile] = String.valueOf(rotateACW(adjacentTile.toCharArray(), turnsClockWise));


                } else {
                    turns = turns + turnsClockWise;
                    tiles[indexOfNextTile] = String.valueOf(rotateClockWise(adjacentTile.toCharArray(), turnsClockWise));
                }
            }
            index++;
        }
        return turns;
    }


    public boolean adjacentTilesArePretty(List<String> tiles) {
        int tileNumber = 0;
        for (String tile : tiles) {
            if (tileNumber < tiles.size() - 1) {

                char[] sides = tile.toCharArray();
                char[] sidesOfAdjacentTile = tiles.get(tileNumber + 1).toCharArray();

                if (sides[1] != sidesOfAdjacentTile[3]) {
                    return false;
                }
                tileNumber++;
            }
        }
        return true;

    }

    public int numberOfClockWiseTurnRequiredToGetSidesWithSameColor(String tileA, String tileB) {

        int indexOfSideInTile = getIndexOfSideInTile(tileA, tileB);
        return 3 - indexOfSideInTile;

    }

    public int numberOfAntiClockWiseTurnRequiredToGetSidesWithSameColor(String tileA, String tileB) {
        int indexOfSideInTile = getIndexOfSideInTile(tileA, tileB);
        return indexOfSideInTile + 1;
    }

    private int getIndexOfSideInTile(String tileA, String tileB) {
        char[] sidesA = tileA.toCharArray();
        char[] sidesB = tileB.toCharArray();
        char sideAColor = sidesA[1];
        return getIndexOfSideInTile(sidesB, sideAColor);
    }

    private int getIndexOfSideInTile(char[] sides, char side) {
        return IntStream.range(0, sides.length).filter(i -> sides[i] == side).findFirst().orElse(-1);

    }

    public char[] rotateClockWise(char[] array, int turns) {
        for (int i = 0; i < turns; i++)
        {
            array = rotateCWArrayByOne(array);
        }
        return array;
    }

    public char[] rotateCWArrayByOne(char[] array) {
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

    public char[] rotateACW(char[] array, int d)
    {
        for (int i = 0; i < d; i++)
        {
           array =  rotateACWArrayByOne(array, array.length);
        }
        return array;
    }
    public char[] rotateACWArrayByOne(char[] array, int n)
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
