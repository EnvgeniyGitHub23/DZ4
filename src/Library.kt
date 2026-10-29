class Library {
    private val books: MutableList<Book> = mutableListOf()

    // === 1.Добалене книги  =====
    fun addBook(title: String, author: String, rating: Double) {
        require(rating in 0.0..5.0) { "Рейтинг должен быть от 0 до 5" }

        val book = Book().apply {
            this.title = title
            this.author = author
            this.rating = rating
        }
        books.add(book)
        println("✅ Книга добавлена: $book")
    }

    // ===== 2. удаление книги по названию  ====
    fun removeBook(title: String) {
        val found = books.find { it.title.equals(title, ignoreCase = true) }

        found?.let { book ->
            books.remove(book)
            println("Книга удалена: $book")
        } ?: println("Книга «$title» не найдена.")
    }

    // === 3 Поиск книги по названию==
    fun findBooks(title: String): List<Book> {
        val results = books.filter { it.title.contains(title, ignoreCase = true) }

        if (results.isEmpty()) {
            println("По запросу «$title» ничего не найдено.")
        } else {
            println("Найдено книг: ${results.size}")
            results.forEach { println("   $it") }
        }
        return results
    }

    // ====4. Печать каталога  =======
    fun printCatalog() {
        books.run {
            if (isEmpty()) {
                println("Библиотека пустая")
            } else {
                println("Каталог библиотеки (всего книг: $size):")
                forEachIndexed { index, book ->
                    println("   ${index + 1}. $book")
                }
            }
        }
    }

    // ===== 5.Средний рейтинг====
    fun averageRating(): Double {
        val avg = with(books) {
            if (isEmpty()) 0.0 else sumOf { it.rating } / size
        }

        if (books.isEmpty()) {
            println("Нет книг для подсчёта среднего рейтинга.")
        } else {
            println("Средний рейтинг всех книг: " + "%.2f".format(avg))
        }
        return avg
    }
}
