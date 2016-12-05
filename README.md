# EXAM: Java Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.

# Tasks
## 1. Setup a new project (~5 mins) [5p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
    - Just the src directory should be committed
- Create a package called `com.greenfox.exams.java` and work under that

## 2. The BlackJack Application (~90 mins) [15p]
The task is to create a `BlackJack` application where a `user` `Player` can play BlackJack with the `house` `Player`. The game should have a very simple graphical user interface with two labels (one for the user and one for the house) and two buttons for draw and for resetting the game.

![Start](bj_start.png)

When a new game started a new `Deck` should be generated with 52 randomly ordered `Card`s in it.
When the user hits the `drawCard` button the top card of the deck should be added to the users `played` cards. If the house's played cards sum is under 17 it will draw automatically. After drawing the labels should be updated.

One card drawn:

![Round one](bj_1.png)

Two cards drawn:

![Round two](bj_2.png)

**Layout is not important just put everything in one JPanel with the default layout (no need to change that)**

When the user hits the `reset` button, a new Deck should be generated and players should be reset as well.

### Information on the elements
- Tests will be run on your code
    - use names in the code whats used in the description
    - don't use visibility on fields
    - don't use accent in strings or in comments
    - otherwise tests will fail probably
- The `BlackJack`
    - should be a `JPanel`
    - should have two buttons, a `user` and a `house` `Player`s and a `deck`
    - should handle the button actions in one method
- The `Deck`
    - should contain two lists: `cards` and `used`, all cards should be in the cards list and after used it should go in to the used list.
    - you can use the `Collection.shuffle(list)` for shuffling the deck
    - if all cards are used `null` should be returned when drawing from the deck
- The `Card`
    - should have a color and a value
    - should have a getter for the value
    - should be displayed as `"color value"` eg. `"karo 7"`
- The `Player`
    - should have a name
    - should have a list where it stores its `played` cards
    - should be able to `sum` the value of its played cards
    - should be able to `add` a new card to its played cards
    - should be added to the panel and displayed as shown: `"Name played: color value..."` eg. `"User played: kor 7 karo 4 "`
- In your main method
    - create a JFrame
    - add BlackJack panel to it
    - make it visible

### Acceptance criteria
The application is accepted if:
- All tests pass
- You can check your results here: http://gf-exam.mobil.ninja/
    - In order to register your work you have to create a Pull Request on Github
    - Go to your forked repo (https://github.com/yourname/zerda-java-basics)
    - Click `New pull request`
    - Then `Create pull request`
    - After the pull request created your every commit will be evaluated on the site
    - You can check your results

## 3. Understand the code (~10 mins) [4p]
```java
class Apple {
  public int add(int a, int b) {
    return 5;
  }

  public int max_of_three(int a, int b, int c) {
    if (a > b) {
      return a;
    }
    return c;
  }
}

class TestApple {
  public void testAdd() {
    assertEquals(5, Apple.add(2, 3));
  }

  public void testMax() {
    assertEquals(5, Apple.max_of_three(3, 4, 5));
  }
}
```

Are the tests passing? Detail your answer! [2p] Fix the situation! [2p]

#### Explain what you did, and answer the questions here:
Yes, the tests are passing:
```testAdd()```: ```Apple.add()``` always returns 5, no matter what.
```testMax()```: ```Apple.max_of_three()``` in this case jumps through the if (since 3 isn't bigger than 4), and returns 5.
It should be
```add(int a, int ) {
	return a + b
	}```
and
``` max_of_three(int a, int b, inc c) {
	if (a > b) {
		if (a > c) {
			return a
		} else if (c > a) {
			return c
		}
	} else if (a < b) {
		if (c > b) {
			return c
		} else if (c < b) {
			return b
		}
	}```
I'm not gonna finish this cause I'm running out of time, but the point is this wasn't actually checking which one was the biggest of the three numbers and that's what it should do and still return the int 5 at the end as the test says.
		

## 4. Question time! (~20 mins) [6p]

### Where the abstract class is useful? [2p]
#### Your answer:
We use abstract classes when we don't want to instantiate and Object from the abstract class but want to be able to write methods for the classes extended from it at the same time. It's useful when several classes have the same or similar methods, so we don't have to write them over and over again. (For example: Animal abstract class that has a feed method and different kinds of Animals (Cat, Dog etc) that all eat.)

### Describe a method! Show the necessary parts and how are them called! [2p]
#### Your answer:
A method is a block of code that changes something else in the code.
A method has a modifier (which is public by default if not specified), a return type (that can be void if it doesn't return anything), a name, parentheses (that might include parameters, but not necessarily), and a body between {} that has the code to be executed and a return statement it a return type was specified.

### What is the constructor? When it is used? [2p]
#### Your answer:
A constructor is a method that gets executed first and every time an Object is created. It is used when a new instantiation of a Class is created: ``` new Dog()``` for example. It can have zero or more parameters. There's always a default constructor in a Class with zero parameters unless one with parameters is defined so the Object can always get created.
