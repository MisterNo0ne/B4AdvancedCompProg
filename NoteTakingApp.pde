Section s1;
ArrayList<Section> sections = new ArrayList<Section>();

void setup() {
  size(600, 400);
  
  sections.add(new Section(0, "These are new test notes", 30));
}

void draw() {
  background(250);
  
  ellipseMode(CENTER);
  textSize(25);
  
  for (Section s : sections) {
    s.show();
  }
}

void mouseReleased() {
  for (Section s : sections) {
    s.toggle();
  }
}
