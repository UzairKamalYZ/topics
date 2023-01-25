Tom is decorating the pavement in his garden with N square tiles. Each tile is divided into four triangles of different colors (white - 'W', red - 'R', green - 'G' and blue - 'B'). A tile is described as a string of four characters denoting respectively, the color of the upper, right, bottom and left triangle. For example, the tile in the figure below is described as "WRGB".

The image illustrates an examples of tile <BR>
![img_1.png](img_1.png)

Tom arranged the tiles in a row and decided to rotate some of them to obtain a pretty sequence. He considers a sequence of tiles pretty if each pair of adjacent tiles shares one side of the same color.

Write a function:

class Solution { public int solution(String[] A); }

that, given an array A of N strings, representing the sequence of tiles, returns the minimum number of 90-degree rotations (clockwise or counter-clockwise) that Tom has to perform.

Examples:

1. Given A = ["RGBW", "GBRW"], the function should return 1.

The image illustrates the first example test.<BR>
![img_2.png](img_2.png)

Tom can rotate the second tile counter-clockwise once to obtain a pretty sequence.

The image illustrates the answer to the first example test.<BR>
![img_3.png](img_3.png)

2. Given A = ["WBGR", "WBGR", "WRGB", "WRGB", "RBGW"], the function should return 4.

The image illustrates the second example test.

Tom can obtain a pretty sequence by rotating the first and third tiles counter-clockwise and the second and fourth tiles clockwise.

The image illustrates the answer to the second example test.

3. Given A = ["RBGW", "GBRW", "RWGB", "GBRW"], the function should return 2.

The image illustrates the third example test.



Tom can rotate the first tile clockwise twice to obtain a pretty sequence.

The image illustrates the answer to the third example test.<BR>


4. Given A = ["GBRW", "RBGW", "BWGR", "BRGW"], the function should return 2.

The image illustrates the fourth example test.

Tom can rotate the first two tiles clockwise to obtain a pretty sequence.

The image illustrates the answer to the fourth example test.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
string representing a tile has 4 letters (exactly one occurrence of 'R', 'G', 'B' and 'W').
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.