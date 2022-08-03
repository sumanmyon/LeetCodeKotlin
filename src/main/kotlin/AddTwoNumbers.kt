/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var templ1 = l1
        var templ2 = l2
        val dummy = ListNode(-1)
        var temp = dummy
        var carry: Int = 0

        while (templ1 != null || templ2 != null) {
            var total: Int = 0

            if (templ1 != null) {
                //System.out.println("${templ1.`val`}")
                total += templ1.`val`
                templ1 = templ1.next
            }

            if (templ2 != null) {
                //System.out.println("${templ2.`val`}")
                total += templ2.`val`
                templ2 = templ2.next
            }
            total += carry
            carry = total / 10
            val currentNodeValue = total % 10
            temp.next = ListNode(currentNodeValue)
            temp = temp.next!!
        }

        if (carry > 0) {
            temp.next = ListNode(carry)
        }

        return dummy.next

//        var templ1 = l1
//        var templ2 = l2
//        val dummy = ListNode(-1)
//        var temp = dummy
//        var carry: Int = 0
//
//        while (templ1 != null || templ2 != null) {
//            val first = if (templ1 != null) templ1.`val` else 0
//            val second = if (templ2 != null) templ2.`val` else 0
//            val total = first + second + carry
//            carry = total / 10
//            val currentNodeValue = total % 10
//            temp.next = ListNode(currentNodeValue)
//            if (templ1 != null) templ1 = templ1.next
//            if (templ2 != null) templ2 = templ2.next
//            temp = temp.next!!
//        }
//
//        if (carry > 0) {
//            temp.next = ListNode(carry)
//        }
//
//        return dummy.next
    }
}

fun main(args: Array<String>) {
    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.
    val li1 = ListNode(2)
    li1.next = ListNode(4)
    li1.next!!.next = ListNode(3)

    val li2 = ListNode(5)
    li2.next = ListNode(6)
    li2.next!!.next = ListNode(4)

    val addTwoNumbers = AddTwoNumbers()
    var result = addTwoNumbers.addTwoNumbers(li1, li2)

    while (result != null) {
        System.out.println("${result.`val`}")
        result = result.next
    }
}