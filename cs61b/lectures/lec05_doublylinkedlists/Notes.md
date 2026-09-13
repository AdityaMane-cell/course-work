# Adapting sentinel approach to Doubly linkedList

* In doubly linked list the last pointer would sometimes point to the __sentinel__ and sometimes to the __last node__.

* How to fix that?

---

## Solution:

## Approach 1: Double sentinels

* Simply use another sentinel for the last pointer.
* So Intially we have two sentinels.
* Any added value or number is essentially added between these two sentinel nodes.
* It's a reasonable approach. hmmm is it?


## Approach 2: Circular sentinels

* Instead of two separate sentinels, use one sentinel for both the front and the back.
* __How?__
* Prev is sentinel itself and the next is sentinel itself.
* Sentinels next points to the next element / null.
* Last elements next pointer would point to sentinel.
* 

---

## Takeaway:
* While fast, adding .last(tail) and .prev(previous pointer) introduces lots of special cases.
* So to avoid that we can add sentBack sentinel at the end of the list.
* Make it circular with single sentinel in the middle.