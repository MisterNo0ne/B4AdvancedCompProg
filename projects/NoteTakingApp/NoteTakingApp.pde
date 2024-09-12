Section s1;
ArrayList<Section> sections = new ArrayList<Section>();

void setup() {
  size(600, 400);
  
  sections.add(new Section(0, "Sejong the Great", 35));
  sections.add(new Section(1, "Created Hangul, the Korean script", 70));
  sections.add(new Section(1, "Promoted trade with Song Dynasty", 105));
  sections.add(new Section(0, "I ran out of world facts about East Asia", 140));
  sections.add(new Section(0, "I'm very sleepy", 175));
  sections.add(new Section(1, "I should go to bed after this", 210));
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
