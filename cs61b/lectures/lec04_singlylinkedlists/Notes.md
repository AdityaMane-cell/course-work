# To solve error using approach 1 results in more special cases.

## So let's explore the solution better than approach 1 - were you need to check for special cases.

---

## mechanism failure:

- NullPointerException Error.
- It occurs when SLList is intantialized with SLList() instead of SLList(x)
- When addLast() is invoked on the null list it tries to
- access the next feild of null which doesn't exist.

---

## solution:

### Approach 1 -> add null check in addLast method

- and if List is null then invoke addFirst method internally

### Approach 2 -> use sentinel node

**which is actually vastly superior to the approach 1**

- sentinel node eliminates the need for these special cases.
- which make the code clear, bug resistent & easier to upgrade (eg. convert to
- doubly linkedlist approach1 would result in lots of errors)

---

## Takeaway:

- Suppose if you use approach 1 then you would have to manually add special case checks in each and every method to make sure their are no exceptions.
- Now imagine writing doubly linkedlist based on your singly linkedlist(which uses approach one)
- This is were more complications are caused as we have to insure soomth operations on forward and backward pointer.
- Thus sentinal approach is better as it allows easier upgrade.
