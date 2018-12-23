# MavenWorks

## Учебное задание по работе с Maven

1. Создать 6 модулей, которые наследуются от одного корневого модуля
2. Добавить maven-compiler-plugin и удостовериться, что появились исходники
3. В ChildOne добавить public class. Добавить зависимость ChildOne в ChildTwo
4. В ChildFive добавить public class. Добавить зависимость ChildFive в ChildOne
5. Добавить в dependencyManagement (root pom), зависимость Gson. В ChildThree унаследовать данную записимость
6. В ChildThree создать класс Currency, после чего в классе Solution сериализовать в Json объект данного класса.
Результат сериализации должен быть доступен при запуске jar.