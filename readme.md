## Description
This is homework nr 4

## Prerequisites
Install JAVA version 17

## How to run
Run the main method

###### Tasks
Обязательные задания

Задание 1
Дана непустая строка и целое число n. Верните новую строку, в которой символ с индексом n был удален. Значение n будет допустимым индексом символа в исходной строке (то есть n будет находиться в диапазоне от 0 до длины строки - 1 включительно).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
public String missingChar(String str, int n) {
}


Задание 2

Дано два целых числа, верните их сумму. Если два значения равны, то верните удвоенную сумму этих чисел
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

public int sumDouble(int a, int b) {
}
Задание 3
Дано три целых числа, верните самое большое из них
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
public int intMax(int a, int b, int c) {
}

Задание 4
Дано целое число n, верните true, если оно находится в пределах 10 единиц от 100 или 200. Примечание: Math.abs(num) вычисляет абсолютное значение числа.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
public boolean nearHundred(int n) {
}
Задание 5
Дана строка, верните новую строку, в которой "not " добавлено в начало строки. Однако, если строка уже начинается с "not", верните строку без изменений.
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
public String notString(String str) {  
}


Бонусные задания
Бонусные задания для тех, кому обязательных мало. Описание заданий будет на английском и без готового “макета” методов.

Задание 1
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

Задание 2
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false

Задание 3
You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If the speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0

Задание 4
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
Задание 5
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
