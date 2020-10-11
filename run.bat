set path=C:\Program Files\Java\jdk-15\bin
set include=C:\Program Files\Java\jdk-15\include
set lib=C:\Program Files\Java\jdk-15\lib
set link=C:\Program Files\Java\jdk-15\bin
javac -version Initials.java
java Initials
javap -c Initials>bite_code_listing.txt
javadoc Initials.java -d documentation
pause