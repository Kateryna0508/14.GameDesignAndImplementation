# Игра "Угадай число"

## Описание
Компьютер загадывает случайное число от 1 до 100, и игрок должен его угадать. После каждой попытки компьютер сообщает, больше или меньше загаданное число.

## Требования
1. Компьютер генерирует случайное число от 1 до 100.
2. Игрок вводит свои догадки, а программа сообщает, выше или ниже загаданное число.
3. Если игрок угадывает число, программа завершает игру и поздравляет игрока.
4. Количество попыток отслеживается и отображается в конце игры.

## Структура проекта
- `Game`: основной интерфейс для игры.
- `GuessNumberGame`: реализация игры "Угадай число".
- `GameController`: мозг игры, основная логика.
- `RandomUtils`: утилита для генерации случайного числа.
