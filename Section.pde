class Section {
  boolean showing;
  int indent, indLength, buttonSize;
  float ypos;
  String notes;
  Section (int tindent, String tnotes, float typos) {
    showing = false;
    indent = tindent;
    indLength = 50;
    buttonSize = 15;
    notes = tnotes;
    ypos = typos;
  }
  
  void show() {
    fill(0);
    text(showing ? notes : "...", buttonSize+20+(indent*indLength), ypos);
    
    fill(showing ? 150:200);
    circle((indent*indLength)+20, ypos-(buttonSize/2), buttonSize);
  }
  
  void toggle() {
    if (dist(mouseX, mouseY, (indent*indLength)+20, ypos-(buttonSize/2)) <= buttonSize/2) {
      showing = !showing;
    }
  }
}
