# BankMoment
Exercise for "Промсвязьбанк"

# Задание
Дан список  с результатами матчей ("3:1", "2:2", "0:1", "4:2", "3:a", "3- 12"). Исходя из логики, что за победу в домашних матчах дается 3 очка, за ничью 1 очко,  за поражение 0 очков.
Вывести на экран количество очков, набранных каждой командой по итогам проведенных матчей.
Например, счет матча "3:1": Команда №1 (хозяева) забила 3 гола, гости - Команда №2 забила 1 гол. Соответственно, Команда №1 получила 3 очка, Команда №2 - 0 очков.
В результатах матча могут быть ошибки, ваш код должен обработать это поведение.    
Языки для выполнения задачи на выбор: C#, Kotlin, Swift, Java

# Решение
По логике задания изначально дан массив String-данных {"3:1", "2:2", "0:1", "4:2", "3:a", "3- 12"};
Было принято решение использовать Hash-Map для удобства работы с данными, так как ограничений в памяти нет
Проход по всему листу с помощью for, создание массива со значением счета из изначального массива с счетами
Если длина равна двум(два числа и только) в массиве - идем дальше. Нет - инициализация NumberFormatException
В try происходит перевод из строки в число, а потом классическая проверка на счет. Проверка отсутсвия элементов
в Hash-Map и добавление очков в зависимости от результата матча.
Также присутствует проверка формата результата, которая срабатывает при неверных данных (Рис. 1)
В конце проход по Hash-Map и вывод данных.

# Рисунок 1
![image](https://github.com/az3l1t/BankMoment/assets/126178814/1829cd6b-e8fc-4d5a-9a75-d20393d42625)



