rule-engine
============

Simple application to prototype a basic RuleEngine that applies a set of rules to a list of arguments

Why Maven?
----------

The use of maven here is just for the sake of making it easier the jar generation and project generation for the IDE.
Hopefully it doesn't add too much noice to the whole app.

How to run
----------

You will need Maven 2.2.x to run this application.
When you clone the repo, go to the root directory where your pom.xml is.

You can then choose between console or IDE.

IDE
---

You can just execute the maven command to generate your IDE files for you and then open the project there, in case there's a plugin for that, for example:

	mvn eclipse:eclipse

or

	mvn idea:idea

Command line
------------

If you'd rather run this on the command line, then just generate the jar file by running

	mvn package

Then execute the program like this:

	java -jar target/engine-1-0.jar 100 50 30 50 60 20 5000
