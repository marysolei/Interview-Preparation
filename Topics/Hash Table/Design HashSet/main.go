package main

//Question link:https://leetcode.com/problems/design-hashset/

func main() {

}

type MyHashSet struct {
	data []bool
}

/** Initialize your data structure here. */
func Constructor() MyHashSet {

	return MyHashSet{
		data: make([]bool, 100000),
	}
}

func (this *MyHashSet) Add(key int) {
	this.data[key] = true
}

func (this *MyHashSet) Remove(key int) {
	if ok := this.data[key]; ok {
		this.data[key] = false
	}
}

/** Returns true if this set contains the specified element */
func (this *MyHashSet) Contains(key int) bool {
	if ok := this.data[key]; ok {
		return true
	}
	return false
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(key);
 * obj.Remove(key);
 * param_3 := obj.Contains(key);
 */
