
fun main() {
    println("Лабораторна робота №1")
    val N = 0 //TODO change for your variant number
    val a = IntArray(100_000) { (0 until 100_000+1000*N).random() }
    //TODO write application logic here
    
}

fun chooseSort(array: IntArray) {
    //TODO Write ChooseSort Algorithm here
}

fun bubbleSort(array: IntArray) {
    //TODO Write BubbleSort Algorithm here
}

fun insertSort(array: IntArray) {
    //TODO Write InsertSort Algorithm here
}

fun linearSearch(array: IntArray, key:Int) : Int {
    // TODO Find the smallest index of an element whose value is "key" with Linear Search algorithm
    return -1 // or -1 if absent
}

fun binarySearch(array: IntArray, key:Int) : Int {
    // TODO Find the smallest index of an element whose value is "key" with Binary Search algorithm
    return -1 // or -1 if absent
}

fun findMax(array: IntArray): Int? {
    // TODO Find max value in array
    return null
}

fun findMaxBinary(array: IntArray) : Int? {
    return if (array.isEmpty()) {
        null
    } else findMax(array, 0, array.size - 1)
}

fun findMax(array: IntArray, low: Int, high: Int): Int {
    if (low == high) {
        return array[low]
    } else {
        val mid = (low + high) / 2
        val leftMax = findMax(array, low, mid)
        val rightMax = findMax(array, mid + 1, high)
        return maxOf(leftMax, rightMax)
    }
}