package main

//Question Link: https://leetcode.com/problems/design-hashmap/

func main() {

}

//MyHashMap
type MyHashMap struct {
	hmap map[int]int
}

/** Initialize your data structure here. */
func Constructor() MyHashMap {
	return MyHashMap{map[int]int{}}
}

/** value will always be non-negative. */
func (this *MyHashMap) Put(key int, value int) {
	this.hmap[key] = value
}

/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
func (this *MyHashMap) Get(key int) int {
	if _, ok := this.hmap[key]; ok {
		return this.hmap[key]
	}
	return -1
}

/** Removes the mapping of the specified value key if this map contains a mapping for the key */
func (this *MyHashMap) Remove(key int) {

	if _, ok := this.hmap[key]; ok {
		delete(this.hmap, key)
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Put(key,value);
 * param_2 := obj.Get(key);
 * obj.Remove(key);
 */
