# Connect-Four
Connect-Four is a classic two-player game where the objective is to connect four of your pieces in a row, either horizontally, vertically, or diagonally. This project is an implementation of Connect-Four in Java.

![Image](https://user-images.githubusercontent.com/103065549/221435625-31f5ab2b-6ec1-4fd4-9e0c-fd8bcdaa2b64.jpg)

## Table of Contents
- [How to Play](#how-to-play)
- [Implementation Details](#implementation-details)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [Credits](#credits)

## How to Play
The game is designed on a 10x8 board, with each player taking turns dropping their pieces into one of the ten columns. The first player to connect four pieces in a row wins the game.

To play the game, simply run the Connect Four Game.jar file, that can be found in the **'out/artifacts/Connect_4_jar/'** directory of the project. You will be prompted to enter the names of the two players, and the game will begin. The game will display the board with the current player's name displayed at the right bottom of the screen. To drop a piece, the player can directly click on the desired column, and the piece will drop to the lowest available spot in that column. Once a player has won the game, the program will display the winner and prompt the user to play again or exit.

## Implementation Details
The game logic is implemented using a two-dimensional array to represent the game board. The game is implemented using JavaFX and has a **Controller** class that implements the Initializable interface. The class contains several constants, including the number of columns and rows of the game, the diameter of the discs, and the colors of the discs.

The class also contains several JavaFX controls. The **createPlayground** method is responsible for creating the game's graphical user interface. The **insertDisc** method is responsible for inserting a disc into the game board. The method iterates over the rows of the column and finds the first empty row to insert the disc. The method then updates the **insertedDiscsArray** and **insertedDiscsPane** arrays with the new disc and translates the disc to the correct position on the board. The method also checks if the game has ended after the disc insertion and switches the turn to the other player.

The **gameEnded** method checks if the game has ended after the disc insertion. The method checks the vertical, horizontal, and diagonal points around the last inserted disc and counts the number of consecutive discs of the same color. If there are four or more consecutive discs, the method returns true, indicating that the game has ended.

## Future Improvements
There are several possible improvements that could be made to this implementation of Connect-Four:

* **Add a computer opponent**: Currently, the game is only playable by two human players. Adding a computer opponent with varying levels of difficulty would add a new level of challenge to the game.
* **Add additional game modes**: There are several variations of Connect-Four that could be implemented, such as playing with more than two players or playing on a larger board.

## Contributing
If you find any new Feature or have suggestions for improving the code, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again! Your contributions are greatly appreciated!

1. Fork the Project
2. Create your Updates Branch (git checkout -b features/NewFeature)
3. Commit your Changes (git commit -m 'Add new Feature')
4. Push to the Branch (git push origin features/NewFeature)
5. Open a Pull Request

## Credits
This project was completed with the help of the following resources:

* [Internshala Java Course](https://trainings.internshala.com/java-course/?utm_source=is_web_internshala-menu-dropdown) - provided a comprehensive introduction to Java programming language and helped me build a strong foundation for this project.
* Special thanks to [Payal Jain](https://github.com/paayal-j) for her valuable support.
