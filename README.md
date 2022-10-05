# testTask
Тестове завдання для курсів Основи Java
Розробити додаток, який надаватиме наступні
можливості:
1. Вводити арифметичні вирази, що містять цілі та дробові
числа, а також математичні операції +, -, *, / та круглі дужки,
рівень вкладеності дужок – довільний.
2. Перевіряти введений вираз на коректність розміщення дужок
3. Перевіряти коректність введеного виразу (не повинно бути 2
знаків математичних операцій поспіль, наприклад, неприпустимо
вираз 3+*4, в той же час, вираз 4*-7 є
допустимим)
4. Якщо вираз є коректним, обчислити його значення та
зберегти вираз та обчислене значення у БД.
5. Надати можливість перегляду та редагування виразів у
БД. Якщо вираз після редагування залишається коректним,
скоригувати та її значення в БД.
6. Реалізувати функції пошуку виразів у БД за результатами.
Наприклад, можливий запит: знайти всі вирази, значення яких
рівні (і навіть більше, менше...) зазначеному значенню.
7. Проект має бути реалізований з використанням системи збирання
Maven в одному із середовищ розробки: IntelliJ IDEA або Eclipse.
8. Проект має бути завантажений у репозиторій GitHub та надано
посилання на його отримання. Також припустимо вислати архів з
проектом.

Примітки.
У роботі використовувати Java 11 чи 17.
Рекомендується використання таких СУБД: MySQL, MariaDB або
PostgreSQL.
Вітається використання JUnit та інших засобів тестування.
Дозволяється використовувати файли (замість БД) для зберігання інформації про
введених та редагованих арифметичних виразах.
Обов'язковими для виконання є пп.1-3 та 8. Якщо п.4-7 не
виконуються, то виконати додаткове завдання:
- порахувати кількість чисел у рядку, введеному користувачем.
