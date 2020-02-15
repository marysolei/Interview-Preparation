package main

//Question Link: https://leetcode.com/problems/min-stack/

func main() {

}

type MinStack struct {
	stack []stackNode
}
type stackNode struct {
	value int
	min   int
}

/** initialize your data structure here. */
func Constructor() MinStack {
	return MinStack{}
}

func (this *MinStack) Push(x int) {

	min := x
	if len(this.stack) > 0 && this.GetMin() < x {
		min = this.GetMin()
	}
	this.stack = append(this.stack, stackNode{value: x, min: min})
}

func (this *MinStack) Pop() {
	n := len(this.stack)
	if n != 0 {
		this.stack = this.stack[:n-1]
	}
}

func (this *MinStack) Top() int {
	v := this.stack[len(this.stack)-1].value
	//this.stack = this.stack[:len(this.stack)-1]
	return v
}

func (this *MinStack) GetMin() int {
	return this.stack[len(this.stack)-1].min
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */
