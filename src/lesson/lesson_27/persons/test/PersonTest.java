package lesson.lesson_27.persons.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test // Анатация указывает что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;

        Assertions.assertEquals(4, result);// проверяет равны ли два значения
        Assertions.assertNotEquals(5, result);// тест будет пройден если 'не ожидаемый результат' не совпадет с фактическим
        assertTrue(4 == result);// проверяет что условие верно
        assertFalse(5 == result);//проверяет что условие ложное
        assertNull(null);//проверяет что обьект равен null;
        assertNotNull("String");// проверяет что обьект не равен null
    }
}