ECHO OFF
REM compile
javac MySingleton.java
javac MainApp.java

REM run
REM java -Xmx128M -Xms16M mainApp
java MainApp
pause;
