class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val output = ArrayList<Int>()
        for (i in nums.indices step 1) {
            val b = nums[i]
            for (j in i + 1 until nums.size step 1) {
                val sum = b + nums[j]
                if (sum == target) {
                    output.add(i)
                    output.add(j)
                    break
                }
            }

        }

        return output.toIntArray()
    }
}

fun main(args: Array<String>) {
    val twoSum = TwoSum()
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]

//    val i = intArrayOf(2, 7, 11, 15)
//    val o: IntArray = twoSum.twoSum(nums = i, target = 9)


//    val i = intArrayOf(3,2,4)
//    val o: IntArray = twoSum.twoSum(nums = i, target = 6)

    val i = intArrayOf(3,3)
    val o: IntArray = twoSum.twoSum(nums = i, target = 6)

    for (i in 0..o.size - 1 step 1) {
        println(o.get(i))
    }
}