# CSCI370-Lab_05
Initial Data Storage and SharedPreference Lab

# Lecure: #
Up until now, our applications have started from a fresh, initial state when we initialize the app. We have asked the user for some imput and we have done something with that data. When the app is closed, that data is discarded and the cycle starts over the next time we start the app. This will work in few cases and/or simple apps but will be rarely the case in most applications. We need some a mechanism to persist data.

Android provides several means to store data permanently. 
* SharedPreferences
* File I/O
* SQLite Database
* Room Database
* Content Provider
* Online Database solutions

## SharedPreference ##
SharedPreference is an API provided by Android and is used when you have small sets of **key/value** pairs that you need to persist. Examples of this might be username/password, high scores, etc. Android will store this information in an XML file and provide an API to quickly access this information. 

Every Activity comes with its own SharedPreference file and you free but not limited to using it. Sometimes you may want a SharedPreference that is accessible across multiple Activity classes.

Read reference: [Storing data in SharedPreference](https://developer.android.com/training/data-storage/shared-preferences)

## File I/O ##
When you need to store more complex data but unstructured, then you probably want to use the Java native File I/O API. Examples of complex unstructured data would be a picture, document, or mp3 file. 

Android activity does have few specific methods that look like replacements of the Java standard File IO methods. For instance, instead for File.delete() you can call Context.deleteFile(), and instead of applying File.listFiles() recursively you can call Context.fileList() to get the list of all your app specific files with somewhat less code. However, they do not provide extra functionality beyond standard java.io package.

## SQLite Database ##
Sometimes your data will be too complex for SharedPreference but will be **structured**. Android comes stock with a watered down version of a Relation database. Normally when we say Relation database, or RDMS, we usually think of Oracle, mySql, or Postgres. Those systems are usually to resource intensive to run in an Android device, so they decided to include SQLite.

## Room Database ##
Android felt that accessing SQLite database was a little too confusing, and they were correct. So they created Room Database, which is not really a new database, but rather an API that simplifies access to the underlying SQLite database. For the purposes of this class we will skip SQLite database and have a lab on Room database.

## Online Database ##
Not technically an Android provided solution, but we will be learning about storing our data 'off device' in a cloud solution. This solution will be Firebase Database provided by Google.

# Lab: #
* Create a simple Android app that has a TextView with a label of 'Name:'. Followed by another TextView that displays a default value.
* Under that create another TextView with a label of 'New Name:' . Folled by an EditText that allows you to input a String.
* Under that create a Button that when pressed changes the EditText with your default value and write the value of the EditText. 
* Back out of the app and click on the icon to launch the app again and verify that the default is displayed again.
* Edit your code so that you only use the default value if there is no key/value pair in the Activity's SharedPreference.
* Add to your button clickListener writing the value to the Activity's SharedPreference.
* Back out of the app and click on the icon to launch the app again and verify that the last entry you entered is now displayed instead of the default value.

