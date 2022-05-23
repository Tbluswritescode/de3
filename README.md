# Design Exercise3

## KDA TRACKER
For the first exercise in this design activity I decided to go the KDA tracker for games.  

#### This included 2 classes: 
##### Tracker.java 
    which keeps track of games added, can provide a by game summary of 
    statistical averages.  It also has methods for getting a list of all the game 
    titles added, and can a return a set of games for a given title or a copy of 
    the entire tracking map. It has multiple constructors, including one which 
    uses one initial game as a parameter, and one which uses a set of games as a 
    parameter, adding them to the tracker on construction.

##### Game.java 
    is a simple class which keeps track of games themselves.  Each game has 4 
    instance variables: kills, deaths, assists, and the string title of the 
    game.  It has methods for toString, and getters for each instance variable.  
    Kills, deaths, assists, and title are all added to the game on construction.

##### Test.java
    Drives testing for the other classes


## APOCALYPTIC EVACUATION TRACKER
For the first exercise in this design activity I decided to go the Evacuation 
tracker for the end of the world.  

#### This included 4 classes: 
##### Tracker.java 
    which keeps track of applications recived so far in a priority queue based on 
    application date.  It also keeps track of applications selected for 
    evacuation and has a method for accepting an application, adding 
    applications, toString method for printing, toStringSelected which returns an 
    alphabetically ordered string of all of the selected individuals.  There is 
    also a special comparator in the class for ordering the output of selected 
    inviduals, as well as methods for getting a list of all selected 
    applications, getting the next application in the queue, and getting an 
    individual in the selected set by their name.  

##### Application.java 
    A class which contains a person, and an application date timestamp which is 
    created when the object itself is instantiated.  It has a default constructor 
    which only does timestamp, and a constructor which can take a person and add 
    that to the instance variables on instantiation.  It also has a compareTo 
    method used for sorting our priority queue, a toString for printing, and a 
    getPersonName which gets from the person contained in the application their 
    name.  

##### Person.java
    A simple class which holds a person's name and address, as well as getters 
    and setters for same.  It also has a toString method for outputting a person

##### Test.java
    Drives testing for the other classes

