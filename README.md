# Design Exercise3

## KDA TRACKER
For the first exercise in this design activity I decided to go the KDA tracker for games.  

#### This included 2 classes: 
##### Tracker.java 
    which keeps track of games added, can provide a by game summary of statistical averages.  It also has methods for getting a list of all the game titles added, and can a return a set of games for a given title or a copy of the entire tracking map. It has multiple constructors, including one which uses one initial game as a parameter, and one which uses a set of games as a parameter, adding them to the tracker on construction.

##### Game.java 
    is a simple class which keeps track of games themselves.  Each game has 4 instance variables: kills, deaths, assists, and the string title of the game.  It has methods for toString, and getters for each instance variable.  Kills, deaths, assists, and title are all added to the game on construction.  
