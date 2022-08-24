package classes_interface

fun main() {
    var button = Button()
    // * this is a concrete implementation
//    button.clickListener = MyListener()

    // this is anonymous implementation (Way 1)
//    button.clickListener = object : OnClickListener {
//        override fun onClick() {
//            println("This is anonymous click")
//        }
//    }

    // * this is anonymous implementation (Way 2)
    button.setMyListener(object : OnClickListener {
        override fun onClick() {
            println("This is anonymous click")
        }

    })

    button.click()
}

interface OnClickListener {
    fun onClick()
}

abstract class View {
    lateinit var clickListener: OnClickListener

    fun setMyListener(onClickListener: OnClickListener) {
        this.clickListener = onClickListener
    }

    fun click() {
        clickListener.onClick()
    }
}

class MyListener : OnClickListener {
    override fun onClick() {
        println("Clicked")
    }
}

class Button : View()
class Image : View()
class Map : View()