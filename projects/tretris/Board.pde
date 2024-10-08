class Board {
  int[][] fillValues;
  //int[][] colorValues; maybe use enumerators?

  Board() {
    fillValues = new int[8][16];
    for (int i=0; i<8; i++) { //column
      for (int j=0; j<16; j++) { //row
        fillValues[i][j] = 0;
      }
    }
  }

  void displayBoard() {
    fill(0);
    stroke(230); //replace with a check for colorValues
    rect(50, 50, 400, 800);
    
    fill(200);
    for (int i=0; i<8; i++) { //column
      for (int j=0; j<16; j++) { //row
        int posx, posy;
        posx = 50+(50*i);
        posy = 50+(50*j);
        
        switch(fillValues[i][j]) { 
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
