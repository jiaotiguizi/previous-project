# Project 3 - Superhero Battle Royale
In this project, you will be working with a dataset of more than six hundred Superheroes. Some good, some bad, some neutral - each has different strengths and weaknesses, and they are being called for a showdown in the ultimate media crossover event. 

In this project, you will develop a Java program that demonstrates you can:
- Develop your own classes based on the characteristics of objects in a dataset
- Develop your own sub classes based on more nuanced object characteristics
- Develop your own methods for unique class behaviors
- Read a file into objects in a program
- Use polymorphism to conduct an analysis of objects with many different sub-classes
- Output the results of your analysis

# Teams
You may partner with another student on this project to discuss code and strategies for completing the various parts of the assignment. You may share code with your partner, but you should still write much of your own code in your own repository. You should still update your repository (by pushing) incrementally as you make progress. It is up to teammates to ensure that their partner adheres to the <a href="https://www.american.edu/academics/integrity/code.cfm">American University Honor Code.</a> You may use [pair programming](https://en.wikipedia.org/wiki/Pair_programming), however, you must each take turns in the driver role on your own laptop. I should see commits and a submission on Github for each of you to get full credit for this assignment. If you decide to work with a partner, modify the statement below:

- [x] I worked on my own.
- [ ] I worked with *INSERT PARTNER NAME* on this project. The parts I worked on were: *EDIT THIS*

## Step 1 - Open the Included Dataset in a Spreadsheet Application
In the included file, `SuperHeroes.csv`, is a collection of super-powered or notable fictional individuals: heroes, villains, cosmic entities, starship captains, and many more. This is a comma-separated value (csv) file, and each line is a record. The properties of each record are separated by a comma. This is a simple text file format that is supported by many programming languages and packages. 

Each has a set of characteristics that define them:

- Intelligence: how smart are they? can they think their way out of a trap, or devise one for their foes?
- Strength: how much can the lift, push or pull, in terms of physical mass?
- Speed: how fast are they? how quick are their reflexes? can they get out of trouble fast, or bring trouble to the enemy?
- Durability: can they take a hit? can they walk away unscathed, and live to fight another day?
- Power: do they have an amazing superpower, such as a Jedi using the force or Godzilla blowing energy across entire cities? Or is this Paul Blart, Mall Cop (I'm not kidding, he's in here).
- Combat: are they scrappy, and good in a fight?
- Others: gender, race, eye color and other descriptive characteristics.

Open up the file in the spreadsheet application of your choice (e.g., Excel, Google Sheets) and review the data to get acquainted with it. Try to get a sense for the different types of superheroes there. Are there Masterminds, for example, with really high intelligence that might give them an edge on top of whatever combat ability they possess? As you are looking, start to think of categories for these SuperHeroes that you might want to use in the upcoming Battle Royale. If you have trouble coming up with fun and descriptive names, you can always draw upon the many examples found at [tvtropes.org](https://tvtropes.org/pmwiki/pmwiki.php/Main/SuperheroTropes), though be careful - that site is a massive time sink if you get sucked in. 

Of course, the world of SuperHeroes is much more interesting and complex than this. High-intelligence alone may not be the sole reason a Superhero is powerful. Someone who is not just intelligent, but also has high speed, can make smart decisions and act on them much faster than someone who is slow. Someone may have high power, but low durability, and be unable to deal damage to an opponent with a higher combat ability. 

Of course, we all have a favorite. Look through the dataset and figure out which one is yours. Do they have a starship that allows them to deal much more damage and defend against combat damage with energy shields? Or do they have an awesome catch phrase that boosts their strength? Whatever that unique power is, it's going to do something a little different than just fight the other opponent, but will definitely give them an edge. This should not mean that they instantly defeat all challengers (seriously, a StormTrooper should probably not be defeating Thanos), but that they have an advantage when other heroes would not.

**Deliverable 1:** Your first deliverable is to identify four categories of heroes that are found here based on a single attribute in a certain range (e.g., `MasterMind` with high intelligence). Document below your four named categories and the criteria that you would use to define them. You cannot use MasterMind, that one is already defined for you - but follow the example in describing your own categories. There are really no wrong answers, as long as they are based on one of the attributes in the dataset and fight in a slightly different way than the basic `SuperHero` class. They don't have to be the quantitative attributes, you can use Hair Color or text found in the Occupation - it's up to you, but these might be harder to translate to fight methods.

My categories (and their descriptions) are: *EDIT THIS*
1. *MasterMind is a `SuperHero` with an intelligence over 90 who uses their intelligence to fight. In addition to whatever combat damage is assigned on attack, they also deal 1.5x of the difference between their intelligence and their opponent as damage to the other `SuperHero`.*
2.
3.
4.
5.

Second, you must identify two subcategories of heroes that are found here based on a two or more attributes in a certain range. These subcategories should extend from the descriptions of at least one of your categories defined above (they can both be from the same super category, or from two different categories). Document below your two named subcategories and the criteria that you would use to define them. There are really no wrong answers, as long as they are based on two or mroe of the attributes in the dataset and fight in a slightly different way than their superclass.

My subcategories (and their descriptions) are: *EDIT THIS*
1. *`MySubcategory` is a `Category` that is different because and fights differently from a `Category` by...*
2.


Third, you must identify a champion. This is one of your "fan favorites" and you do not really have to justify it to us - it can be a good, bad, or neutral superhero. Tell us the "Name" of your champion from the name category in the dataset. Then, tell us what their unique power is. 


My champion is: *EDIT THIS*

Their unique power is: *EDIT THIS* 

## Step 2 - Develop SubClasses for your Categories
In your src folder, we have provided you with a superclass called `SuperHero` and an example subclass called `MasterMind`. You may alter SuperHero, but you may not alter MasterMind. A third class, `BattleRoyale` contains the main method. 

The SuperHero class is used to create objects that store all the attributes of a SuperHero from the included datafile. Each of these is private, and should not be modified outside of the class. Public getter methods are provided for each of the field variables. There are two constructors provided - one that takes each of the field values according to their separate types, and one that takes an array of String objects. The second is particularly useful for reading csv files.

Included in `SuperHero` is a method `readDataFile` that takes a file name and reads each line of the file as a String. For each String, it uses the `split` method to split the String into an array of String objects. The array is equal in length to the number of values that were separated by commas in the original line. 

The String array represents the attributes of that superhero. The `readDataFile` method must then decide what type of superhero will be created. So far, it only knows about `MasterMind` superhero types - everything that is not a MasterMind is just a normal superhero. Do determine if a superhero record meets the criteria of being a mastermind, it calls a static method `meetsConditions`. If true, then the superhero meets the conditions of being a MasterMind (i.e., high intelligence) and a new `MasterMind` is created and added to the growing arrayList of SuperHero objects. Otherwise, a normal `SuperHero` is created and added instead. Keep this section in mind, because you will come back and modify this part of the code for each class you create. A superhero may meet the conditions of more than one of your class - the order in which you check will likely affect how many of each type are created. 

The `SuperHero` class has a static implementation of the `meetsConditions` method that always returns true, because all records meet the conditions for being a basic superhero. All subclasses should override this method with their own specific criteria.

Finally, the `SuperHero` class has a method called `attack` that takes another SuperHero as a parameter. It returns the difference between the combat attribute of the current SuperHero object and the other SuperHero object. Regardless of all their other powers and abilities, this is the basic method for determining how much damage one superhero would deal to another. If positive, it means that this superhero would deal that much damage to the other superhero. If zero, it means that no damage is dealt on this attack. If negative, it means that the attack backfired, and the current superhero was dealt damage instead (whoops). 

The `MasterMind` class is a subclass of `SuperHero`, and serves as an example of the four classes that you will create. It has overridden the `meetsConditions` method with its own implementation, which checks to see if the fields contain an intelligence > 90. If so, then this Superhero could be a mastermind, and the method returns true. 

The `MasterMind` class overrides the attack method with its own implementation. A `MasterMind` uses their own intelligence to gain a competitive advantage, so if this hero has a higher intelligence than the other it will deal additional damage equal to 1.5x the difference. Otherwise, it only deals the same base combat damage done by all superheroes by calling `super.attack()`. 

To complete this step, you must design four more classes that extend `SuperHero` and overrides the `attack` and `meetsConditions` methods. These classes should match the names and fulfill the requirements of your categories above.

**Deliverable 2:** Four subclasses matching your category descriptions.

## Step 3 - Develop Subclasses for your SubCategories

To complete this step, you must design two more classes that extend one or more of your subclasses defined in Step 2. Do not extend `MasterMind`. These should also overrides the `attack` and `meetsConditions` methods and should use the methods of the superclasses through `super()`. These classes should match the names and fulfill the requirements of your subcategories above.

**Deliverable 3:** Two subclasses matching your subcategory descriptions.

## Step 4 - Develop your Champion

The last subclass you will develop will be for your chosen champion. To meet the criteria of being your champion, the fields must contain the name that you are looking for (depending on your champion, you may need to be more specific and require species, hair color, etc - there are two characters named Angel, for example, and they are very different). Your champion can be a subclass of any other class you have designed or it can be a direct subclass of SuperHero. In addition to overriding the constructor, `meetsConditions`, and `attack` methods, your champion should have one additional method.  You decide and design the parameters of the method header yourself, but no matter what it should return an int. This int is a modifier to the amount of damage dealt by, or dealt to, your champion. Where you call this method is up to you, but it needs to be called either in the `fight` method of your champion (to change how much damage your champion deals) or in the `BattleRoyale` class (to change how much damage is dealt to your champion). 

> How to do fulfill this? Well, Indiana Jones is not very powerful, fast, or strong, but still has quite a knack for getting out of tight situations due to ancient artifacts and incredible luck. So, you might want to give him an `activateArtifact()` method that returns his intelligence stat if the results of a random number call is less than 0.5 (essentially flipping a coin). This could be used to increase the damage he deals on attack and/or decrease the damage he receives when attacked. Note - do not use this exact approach. Sorry, Indie fans. 

**Deliverable 4:** One subclass matching your champion descriptions.

## Step 5  - Ready to Rumble 

In the `BattleRoyale` method, you should call the `readDataFile` method to create an arraylist of SuperHero objects with all of the appropriate classes that you have defined above. That means that, as promised, you will need to modify the `readDataFile` method to create each object depending on which criteria it meets for the subclasses. 

Once you have your arraylist, it's time to Battle! Each superhero should fight each other superhero in the dataset. For each fight, both superheroes get one attack each. That means that SuperHero A attacks SuperHero B, and SupeHero B attacks Superhero A. The difference of the resulting damage values tell you who won the fight - if positive, then SuperHero A won, if zero it was a stalemate, if negative it means that SuperHero B won.

- A superhero does not fight itself (two superheros with the same name can still fight each other). This should not be a n<sup>2</sup> battle, but an n(n-1)/2 battle.
- A good superhero does not fight another good superhero 
- Each pairing should occur only once

**Deliverable 5 :** The`main` that loads the file and matches each superhero against all of the others according to the rules above.

## Step 6 - Report your Results

Once the battle has concluded, output your results to a file `results.txt` for subsequent review. There is example code in the `BattleRoyale` class that gives an example of writing multiples lines to a file. Follow the template to generate your report. 

The report should consist of three formatted sections: 

1. Report how many times heroes with the good, neutral, and bad alignments win, lose, and tie. Each alignment should get its own line. Underneath, report which alignment won the most.
2. For each of your created subclasses (not `SuperHero`) report the number of times they win, lose, and tie. Each subclass should get its own line. Underneath, report which subclass won the most.
3. For each individual superhero, report how many times they win, lose, or tie. Each superhero should get its own line. Underneath, report which superhero won the most.

> Hint: you may think that you need to create arrays or many other variables to track all of this information. Instead, think about static and non-static fields. Non-static fields can be used to track data for an individual object of the class (e.g., the number of `Thor` victories). Static fields can be used to track data for an entire class (e.g., the number of `MasterMind` victories). You are absolutely free to modify the classes to contain these fields. That said, if you are more comfortable with arrays, you are free to do that instead. 

**Deliverable 6 :** Your code generates a report with the three required sections.

# Deliverables and Grading

| Weight | Deliverable                                                                                                           |
|--------|-----------------------------------------------------------------------------------------------------------------------|
| 10    | Modify the readme for each of the category, subcategory, and champion descriptions as outline in Step 1|
| 30     | Developed four subclasses matching your category descriptions.|
| 20     | Developed two subclasses matching your subcategory descriptions |
| 10     | Developed one subclass matching your champion descriptions.|
| 20     | The`main` that loads the file and matches each superhero against all of the others according to the rules above. |
| 10     | Your code generates a report with the three required sections.|

# Getting Stuck
There are times when you might get stuck on some part of an assignment. It happens to the best of us. If you need assistance on a specific part of your code, then be sure to try to `push` the most recent version of your files to Github. It makes it much easier for your instructor and TA to provide specific feedback on individual lines of code in the files that you submit. 

