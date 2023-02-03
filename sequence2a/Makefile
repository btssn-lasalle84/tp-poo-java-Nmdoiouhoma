SRC=./src

all: FizzBuzz

FizzBuzz: $(SRC)/FizzBuzz.class
	@java -classpath $(SRC) FizzBuzz

$(SRC)/FizzBuzz.class: $(SRC)/FizzBuzz.java
	javac -d $(SRC) $(SRC)/FizzBuzz.java

clean:
	rm -f $(SRC)/*.class $(SRC)/*~
