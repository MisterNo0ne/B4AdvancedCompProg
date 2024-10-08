//Tretris

/* to do list
piece movement side to side
piece falling
piece landing
piece fillvalues
random piece
piece colors
piece 

*/

Board board;
Piece currentPiece;
float tileSize, margin;

void setup() {
  board = new Board();
  currentPiece = new Piece(0);
  
  size(700, 900);
}

void draw() {
  background(255);
  fill(100);
  rect(0, 0, 500, 900);
  
  board.displayBoard();
  currentPiece.displayPiece();
}
