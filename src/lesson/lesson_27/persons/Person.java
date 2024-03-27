package lesson.lesson_27.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    //john@test.net
/*
ТРЕБОВАНИЯ К EMAIL
1.@ должна присутствовать и должен быть только один
2. Точка после собаки
3. Точка не может быть сразу после собаки
4. После последней точки должно быть не менее двух символов
5. могут присутcтвовать  символы алфавита цифры "-", '_' ,'.'
6. Первый символ должен быть алфавит
 = место для @ хотя бы один символ для собаки

 */
    private boolean isEmailValid(String email) {
        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty()) return false;
        //1. @
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;

        //2.Должна быть точка после собаки
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        //3. lastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;


        //true если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return false;

        //5. могут присутcтвовать  символы алфавита цифры "-", '_' ,'.' ,'@'
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            //true если символ удовлетворяет хотябы одному критерию
            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '.'
                    || c == '@');

            if (isCharValid) return false;
        }
        // все проверки пройдены нигде метод не вернул false ->
        return true;
    }

    /*
    Требования к PASSWORD
    1. Длина пароля не менее 8 символов
    2. минимум одна маленькая
    3. минимум одна большая буква
    4. минимум одна цифра
    5. минимум один спец символ (!%@*$()[])

     */

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}
