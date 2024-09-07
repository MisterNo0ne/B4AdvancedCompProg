# B4AdvancedCompProg
B4 Advanced Computer Programming class portfolio

## Note Taking App
This app is a variation on a normal note taking app, and it has standard bullet points. Specifically, I added functionality that the user can toggle showing a line, to reduce clutter and make it easier to find specific things.
Each line of notes is an instantiation of the class Section. These have two functions, one for display and one for toggling. 

The toggle function works by testing if the user clicked on the button, and will change a boolean from true to false or vice versa.
The display function will take that into account when displaying, and show "..." when the boolean is false, but the actual line when it's true.

