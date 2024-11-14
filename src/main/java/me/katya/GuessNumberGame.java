package me.katya;
import java.util.Scanner;

public class GuessNumberGame implements Game { //"Мозг" игры

	private int targetNumber;      // Загаданное число
	private int attempts;          // Счетчик попыток

	public GuessNumberGame() {
		this.targetNumber = RandomUtils.randInt(1, 100);
		this.attempts = 0;
	}

	@Override
	public void start() {
		System.out.println("Добро пожаловать в игру 'Угадай число'!");
		System.out.println("Компьютер загадал число от 1 до 100. Попробуйте его угадать!");

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Введите ваше число: ");
				int guess = scanner.nextInt();
				attempts++;

				if (guess > targetNumber) {
					System.out.println("Загаданное число меньше.");
				} else if (guess < targetNumber) {
					System.out.println("Загаданное число больше.");
				} else {
					System.out.println("Поздравляю! Вы угадали число " + targetNumber + " за " + attempts + " попыток.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
		}
	}

}