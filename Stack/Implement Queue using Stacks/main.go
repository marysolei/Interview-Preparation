package main
//Question Link: https://leetcode.com/problems/implement-queue-using-stacks/

type MyQueue struct {
     s1 []int
     s2 []int
}


/** Initialize your data structure here. */
func Constructor() MyQueue {

    return MyQueue {}
}


/** Push element x to the back of queue. */
func (this *MyQueue) Push(x int)  {
    this.s1 = append(this.s1, x )
}


/** Removes the element from in front of queue and returns that element. */
func (this *MyQueue) Pop() int {
    this.Peek()
    element := this.s2[len(this.s2)-1]
    this.s2 = this.s2[:len(this.s2)-1]
    return element
}


/** Get the front element. */
func (this *MyQueue) Peek() int {

    if len(this.s2)==0 {
        for len(this.s1) >0 {
           // element := this.s1 [len(this.s1)-1]
            this.s2 = append (this.s2, this.s1[len(this.s1)-1])
            this.s1 = this.s1[:len(this.s1)-1]
        }
    }
    return this.s2[len(this.s2)-1]
}


/** Returns whether the queue is empty. */
func (this *MyQueue) Empty() bool {
    return len(this.s1) ==0 && len(this.s2)==0
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Peek();
 * param_4 := obj.Empty();
 */
