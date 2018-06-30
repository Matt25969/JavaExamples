
public class Spirals {

	enum Direction {
		UP, RIGHT, DOWN, LEFT
	}

	enum Clockwise {
		CLOCKWISE, COUNTER_CLOCKWISE
	}

	public static void main(String[] args) {
		// int[][] board = generateSpiral(30, Clockwise.COUNTER_CLOCKWISE);
		// printBoard(board, 30);

		int[][] board = generateSpiral(5, Clockwise.CLOCKWISE);
		printBoard(board, 5);

	}

	// length -- Length of spiral
	// clockwise -- Direction of sprial (clockwise, counter-clockwise)
	public static int[][] generateSpiral(int length, Clockwise clockwise) {
		int x = 0, y = 0; // (y, x) Position to place index
		int index = 1;
		Direction direction = (clockwise == Clockwise.CLOCKWISE) ? Direction.RIGHT : Direction.DOWN;

		int[][] board = new int[length][length];

		while (index <= (length * length)) {
			board[y][x] = index++; // arrays are weird

			// When moving the position, X is the position on the X-axis,
			// Y is the position on the Y-axis.
			if (direction == Direction.RIGHT) {
				if (x == (length - 1) || board[y][x + 1] != 0) {
					if (clockwise == Clockwise.CLOCKWISE) {
						direction = Direction.DOWN;
						y++;
					} else {
						direction = Direction.UP;
						y--;
					}
				} else {
					x++;
				}
			} else if (direction == Direction.DOWN) {
				if (y == (length - 1) || board[y + 1][x] != 0) {
					if (clockwise == Clockwise.CLOCKWISE) {
						direction = Direction.LEFT;
						x--;
					} else {
						direction = Direction.RIGHT;
						x++;
					}
				} else {
					y++;
				}
			} else if (direction == Direction.LEFT) {
				if (x == 0 || board[y][x - 1] != 0) {
					if (clockwise == Clockwise.CLOCKWISE) {
						direction = Direction.UP;
						y--;
					} else {
						direction = Direction.DOWN;
						y++;
					}
				} else {
					x--;
				}
			} else if (direction == Direction.UP) {
				if (y == 0 || board[y - 1][x] != 0) {
					if (clockwise == Clockwise.CLOCKWISE) {
						direction = Direction.RIGHT;
						x++;
					} else {
						direction = Direction.LEFT;
						x--;
					}
				} else {
					y--;
				}
			}
		}

		return board;
	}

	public static void printBoard(int[][] board, int length) {
		int spaces = String.valueOf(length * length).length() + 1;

		for (int[] x : board) {
			for (int y : x) {
				int lenY = String.valueOf(y).length();
				System.out.printf("%s%d", genStr(spaces - lenY), y);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static String genStr(int length) {
		String output = "";

		for (int i = 0; i < length; i++) {
			output += " ";
		}

		return output;
	}
}
