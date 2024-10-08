class Piece {
  int pieceType;
  int[][] triValues;
  int xpos, ypos; //topleft corner of the piece rotation table
  color pieceColor;
  
  Piece(int pieceType) {
    this.pieceType = pieceType;
    triValues = new int[3][3];
    
    xpos = 5;
    ypos = 0;
    
    switch(pieceType) {
      default: //for now, it's just a ninja
        int[][] tempValues = {{1,0,0} , {0,0,0} , {0,0,0}};
        triValues = tempValues;
        pieceColor = color(230);
        xpos = 4;
        break;
    }
  }
  
  void displayPiece() {
    fill(pieceColor);
    
    for (int i=0; i<3; i++) { //column
      for (int j=0; j<3; j++) { //row
        int posx, posy;
        posx = 50+(50*i)+(50*xpos);
        posy = 50+(50*j)+(50*ypos);
        
        switch(triValues[i][j]) { 
          case 1:                                     //topleft corner
            triangle(posx, posy, posx, posy+50, posx+50, posy);
            break;
          case 2:                                     //topright corner
            triangle(posx, posy, posx+50, posy, posx+50, posy+50);
            break;
          case 3:                                     //bottomleft corner
            triangle(posx, posy, posx, posy+50, posx+50, posy+50);
            break;
          case 4:                                     //bottomright corner
            triangle(posx+50, posy, posx, posy+50, posx+50, posy+50);
            break;
          case 5:
            rect(posx, posy, 50, 50);
            break;
        }
        
      }
    }
  }
}
