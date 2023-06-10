package koschei;

/**
 * Собрать цепочку до 8го элемента, использовав все вышеперечисленные методы связывания. После выполнения вы
 * должны получить полную фразу.
 * Проверьте своё решение тестом из заготовки.
 */

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
