package classes_interface

fun main() {
    val fileSystem = getFileSystem()
    fileSystem.readDir()
}

// dummy dependency injection
fun getFileSystem() : FileSystem {
//    return Fat32FileSystem()
    return MemoryFileSystem(listOf("/path/to/file", "/another/path"), "file-contents-go-here")
}

interface FileSystem {
    fun readDir() : List<String>
    fun readFile() : String
    //...
}

class Fat32FileSystem : FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}

class ExtFileSystem : FileSystem {
    override fun readDir(): List<String> {
        TODO("Not yet implemented")
    }

    override fun readFile(): String {
        TODO("Not yet implemented")
    }
}

class MemoryFileSystem (val files: List<String>, val fileContents: String) : FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContents
    }
}