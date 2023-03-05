- Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов
- Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр
- Подсчет слов должен выполняться без учета регистра
- Выводите слова в нижнем регистре
- Если в тексте меньше 10 уникальных слов, то выводите сколько есть
- Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке
- Написать используя stream api

Sample Input:
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.

Sample Output:
consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mi
