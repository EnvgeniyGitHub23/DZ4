// Домашнее задание №4 от 12.10.2026


fun main() {
    val library = Library()

    println("=== Добавление книг ===")
    library.addBook("Мастер и Маргарита", "Михаил Булгаков", 4.9)
    library.addBook("Преступление и наказание", "Достоевский", 4.7)
    library.addBook("Война и мир", "Лев Толстой", 4.5)
    library.addBook("Колобок", "", 5.0)
    library.addBook("Гарри Поттер", "Роулинг", 4.6)

    println("\n=== Печать каталога ===")
    library.printCatalog()

    println("\n=== Поиск книги ===")
    library.findBooks("война")
    library.findBooks("Гарри")

    println("\n=== Средний рейтинг ===")
    library.averageRating()

    println("\n=== Удаление книги ===")
    library.removeBook("Колобок")
    library.removeBook("несуществующая книга")

    println("\n=== Каталог после удаления ===")
    library.printCatalog()

    println("\n=== Средний рейтинг после удаления ===")
    library.averageRating()
}