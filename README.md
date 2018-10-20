
# Project Title

### LEXI_Document_Editor

## Getting Started

These project will help you to understand the concepts of Design Patterns thorugh JAVA programming language. The basis to apply and refer is Gang of Four book by Eric Gamma. 

### Prerequisites

Platform used is Netbeans IDE 8.2
You can get it free from:   [Netbeans Download](https://netbeans.org/downloads/)
```
Design Patterns by Eric Gamma.
Basic JAVA and SWING understanding.
Object oriented Principles.
```


## Running the File

Open the Source file MainFrame.java and Run it. 

### Importing the Projet


```
1. Download the ZIP file for Project
2. Open Netbeans IDE and Go to File menu and Select Import Project
3. Choose "Import from ZIP", and search for the location where you saved the downloaded ZIP file
4. Choose the file and then let it load the project.
5. Open the ### MainFrame.java file and run the file using "Shift+F6" or right click anywhere in the Code pane and choose option to Run file.
```


## Using the Editor
```
1. Start typing in the canvas layout. 
2. When you want to change the font size, you can select the button on right side of the canvas, it will ask you the size(in pt). Input integer values between 20 to 40. 
3. For inserting the image, choose from the images which are provided in the "images" folder for seemless working of the project.
4. You can also change the color or border using "Border" button
5. Some user operation like undo and redo can also be performed.
6. To represent the "space", explicit Rectangles with Boundary are used. 
```

## Features
```
1. Composite Pattern has been used to make the structure of the Document Editor. Main aim was to make all the graphics object, behave same independent of the state they represent.
2. To communicate with system, Facade pattern was introduced which delegates the requests to inner complex codes and keep the UI code simple and easy to handle.
3. Command pattern was introduced in order to serve the User operation like Undo and Redo and also all the necessary command like font change, border change, etc.
4. Memento pattern was used to remember the state of the Object, in order to perform UNDO and REDO on the state.(Stack Data structure is used). 
5. Iterator pattern is used to traverse the Collection during various occations
6. Flyweight Factory is used to generate the Pool of characters available for typing in the text editor to avoid unncessary creation of new objects everytime.
```

## Built With

* [Swing ](https://docs.oracle.com/javase/tutorial/uiswing/) - The Framework used to develop


## Versioning

This is basic version of the Project. I will add more sophiscated Application version soon in the future.

## Features to be added

```
* Line breaking Algorithm
* Multiple window Support
* Spellcheking and Hyphenation

```

## Author

* **Rakshit Kathawate** - *Initial work* - [ChampionTej05](https://github.com/ChampionTej05)


## License

This project is not licensed. You can use this, for study purposes. For any commercial or promotive purposes, permission should be taken from Author,

## Acknowledgments

* Thanks to Menelaos Kotsollaris whose [Medium](https://medium.com/@mkotsollaris/applied-design-patterns-software-architecture-42a8e6835cf0 ) article guided me, on how to proceed with this Project.
* Great thanks to our College professor for introducing us to the Design paterns subject and helping us learn the core concepts.

